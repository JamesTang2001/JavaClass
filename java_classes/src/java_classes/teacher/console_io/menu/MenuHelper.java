package java_classes.teacher.console_io.menu;

import java.io.Console;
/*
 * 使用這個helper 來幫助
 */

public class MenuHelper {

	private String[] items = { "歡迎使用溫度轉換器:", "1. 華氏轉攝氏", "2. 攝氏轉華氏", "0. 離開" };
	private Console console;

	public enum Choice {
		EXIT, FAREN_TO_CELSIUS, CELSIUS_TO_FAREN
	};

	public MenuHelper() {
		console = System.console();
		if (console == null) {
			System.out.println("No console.");
			System.exit(1);
		}
	}

	public Choice show() {
		printMenu();

		int ans = -1;
		while (true) {
			try {
				ans = Integer.valueOf(console.readLine("請輸入選項:"));
			} catch (NumberFormatException e) {
				System.out.println("請輸入整數！！");
				continue;
			}
			if (isAnsOK(ans)) {
				break;
			} else {
				System.out.println("輸入錯誤，請重輸:");
			}
		}
		return Choice.values()[ans];
	}

	private void printMenu() {
		for (int id = 0; id < items.length; id++) {
			System.out.println(items[id]);
		}
	}

	private boolean isAnsOK(int ans) {
		return ans == 0 || ans == 1 || ans == 2;
	}

	public static void main(String[] args) {

		MenuHelper menu = new MenuHelper();
		Choice result = menu.show();
		System.out.println("result is " + result);
	}

}

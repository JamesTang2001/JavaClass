package java_classes.teacher.console_io;

import java.io.IOException;

//import java.io.Console;

public class ReadConsoleInput_v2 {

	public static void main(String[] args) throws IOException {

//		Console console = System.console();
//		if (console == null) {
//			System.err.println("No console.");
//			System.exit(1);
//		}
		NConsole console = new NConsole();

		String name = console.readLine("請輸入姓名：");

		// 輸入整數，格式不對請重輸
		/*
		 * 至少一次，不知幾次
		 */
		int id = -1;
		boolean formatOK = false;
		do {
			try {
				id = Integer.valueOf(console.readLine("請輸入整數："));
			} catch (NumberFormatException e) {
				console.println("格式錯誤，請重輸...");
			}
			formatOK = true;
		} while (!formatOK);

		double r = Math.sqrt(id);

		System.out.format("嗨， %s， %d 的平方根是： %.4f.%n", name, id, r);// ％n是斷行符號，依各平台自訂

	}

}
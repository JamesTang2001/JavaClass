package java_classes.teacher.console_io.menu.trial01;

import java.io.IOException;

import java_classes.teacher.console_io.NConsole;


public abstract class AbstractMenu {

	private Item[] items;
	
	protected void setItems(Item[] items){ 
		this.items = items;
	}	
	private NConsole console;

	/*
	 * 請在建構子呼叫本方法
	 */
	protected void getConsole() {
		console = new NConsole();
	}

	/*
	 * 子世代使用這個來操作
	 */
	protected char showMenu() {
		printMenu();

		char ans = 'x';
		while (true) {
			try {
				ans = console.readLine("請輸入選項:").trim().toCharArray()[0];
			} catch (IOException e) {
				System.out.println("請輸入整數！！");
				continue;
			}
			if (isAnsOK(ans)) {
				break;
			} else {
				System.out.println("輸入錯誤，請重輸:");
			}
		}
		return ans;
	}

	private void printMenu() {
		for (int id = 0; id < items.length; id++) {
			System.out.println(items[id].getIndex()+" | "+items[id].getDesc());
		}
	}
	private int enumId = -1;

	protected int getEnumId() {
		return enumId;
	}

	private boolean isAnsOK(int ans) {
		boolean isAnsOK = false;
		for (int id = 0; id < items.length; id++) {
			if(ans == items[id].getIndex()) {
				isAnsOK = true;
				this.enumId = id;
				break;
			}
		}
		return isAnsOK;
	}

	
}

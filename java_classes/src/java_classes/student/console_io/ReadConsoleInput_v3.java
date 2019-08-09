package java_classes.student.console_io;

import java.io.IOException;

import java_classes.teacher.console_io.NConsole;

//import java.io.Console;
/*
 * 本程式有兩個問題
 * 1. 資料輸入錯誤沒有檢核
 * 2. 只能作一次
 * 
 * 先處理資料輸入檢核
 * 示範利用refractor 擷取方法
 */

public class ReadConsoleInput_v3 {

	public static void main(String[] args) throws IOException {

		NConsole console = new NConsole();

		String name = console.readLine("請輸入姓名：");

		// 輸入整數，格式不對請重輸
		int id = getInteger(console);

		double r = Math.sqrt(id);

		System.out.format("嗨， %s， %d 的平方根是： %.4f.%n", name, id, r);// ％n是斷行符號，依各平台自訂

		console.close();
	}

	private static int getInteger(NConsole console) throws IOException {
//		private static int getInteger(NConsole console)  {
		int id = -1;
		boolean formatOK = false;
		do {
			try {
				id = Integer.valueOf(console.readLine("請輸入整數："));
				formatOK = true;
			} catch (NumberFormatException e) {
				console.println("格式錯誤，請重輸...");
			}
			formatOK = true;
		} while (!formatOK);
		return id;
	}

}

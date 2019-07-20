package java_classes.teacher.console_io;

import java.io.IOException;

//import java.io.Console;
/*
 * 本程式有兩個問題
 * 1. 資料輸入錯誤沒有檢核
 * 2. 只能作一次
 * 
 * 先處理資料輸入檢核
 */

public class ReadConsoleInput_v4 {

	public static void main(String[] args) throws IOException {

		NConsole console = new NConsole();

		String name = console.readLine("請輸入姓名：");

		outerloop:
		while (true) {
			// 輸入整數，格式不對請重輸
			int id = -1;
			boolean formatOK = false;
			do {
				try {
					String ans = console.readLine("請輸入整數，離開按X：");
					if (ans.equalsIgnoreCase("X")) {
						console.println("謝謝使用，再見！！");
						break outerloop;
					}
					id = Integer.valueOf(ans);
					formatOK = true;
				} catch (NumberFormatException e) {
					console.println("格式錯誤，請重輸...");
					continue;
				}
			} while (!formatOK);

			double r = Math.sqrt(id);

			System.out.format("嗨， %s， %d 的平方根是： %.4f.%n", name, id, r);// ％n是斷行符號，依各平台自訂

		}
		console.close();
	}

}

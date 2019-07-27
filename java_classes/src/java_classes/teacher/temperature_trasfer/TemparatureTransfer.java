package java_classes.teacher.temperature_trasfer;

import java.io.IOException;

import java_classes.teacher.console_io.NConsole;

/*
 * 顯示選單
 * 接收使用者輸入
 * 如果x/X，離開
 * 如果攝氏轉華氏
 * 如果華氏轉攝氏
 */
public class TemparatureTransfer {

	public static void main(String[] args) throws IOException {
		TemparatureTransfer tt = new TemparatureTransfer();
		tt.init();
		while (true) {
// * 顯示選單
// * 接收使用者輸入
			String ans = tt.showMenu();
// * 如果x/X，離開
			if (ans.equalsIgnoreCase("X")) {
				break;
			}
// * 如果攝氏轉華氏
			if(ans.equals("1")) {
				tt.celsiusToFahrenheit();
			}
			
// * 如果華氏轉攝氏
			if(ans.equals("2")) {
				tt.fahrenheitToCelsius();
			}

		}
		tt.finish();

	}
	private NConsole console;
	private void init() {
		console = new NConsole();
		
		

	}

	private void finish() throws IOException {
		
		console.close();
	}

	private void fahrenheitToCelsius() {
		// TODO Auto-generated method stub
		
	}

	private void celsiusToFahrenheit() {
		// TODO Auto-generated method stub
		
	}

	private String showMenu() {
		// TODO Auto-generated method stub
		return null;
	}

}

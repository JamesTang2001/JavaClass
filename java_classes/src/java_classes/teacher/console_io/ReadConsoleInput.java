package java_classes.teacher.console_io;

import java.io.IOException;

//import java.io.Console;

public class ReadConsoleInput {

	public static void main(String[] args) throws IOException {

//		Console console = System.console();
//		if (console == null) {
//			System.err.println("No console.");
//			System.exit(1);
//		}
		NConsole console = new NConsole();

		String name = console.readLine("請輸入姓名：");
		
		int id = Integer.valueOf(console.readLine("請輸入整數："));
		
		double r = Math.sqrt(id);

		System.out.format("嗨， %s， %d 的平方根是： %.4f.%n",name, id, r);//％n是斷行符號，依各平台自訂

	}

}

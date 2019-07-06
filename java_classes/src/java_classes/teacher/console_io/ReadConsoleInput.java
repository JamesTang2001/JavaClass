package java_classes.teacher.console_io;

import java.io.Console;

public class ReadConsoleInput {

	public static void main(String[] args) {

		Console console = System.console();
		if (console == null) {
			System.err.println("No console.");
			System.exit(1);
		}

		String name = console.readLine("請輸入姓名：");
		
		int id = Integer.valueOf(console.readLine("請輸入整數"));
		
		double r = Math.sqrt(id);

		System.out.format("Hi, %s, the square root of %d is %.4f.%n",name, id, r);//％n是斷行符號，依各平台自訂

	}

}

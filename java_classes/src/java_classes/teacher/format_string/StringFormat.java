package java_classes.teacher.format_string;

import java_classes.teacher.console_io.NConsole;

public class StringFormat {

	public static void main(String[] args) {

		NConsole console = new NConsole();
		
		//一般情形
		console.println("|%s|", "Hello World"); 
		//指定保留寬度
		console.println("|%30s|", "Hello World"); 
		//靠左
		console.println("|%-30s|", "Hello World"); 
		//變數最大印出內容
		console.println("|%.5s|", "Hello World"); 
		//保留寬度30，但字串最多印出5
		console.println("|%30.5s|", "Hello World");
	}

}

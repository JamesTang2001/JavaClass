package java_classes.teacher.format_string;

import java_classes.teacher.console_io.NConsole;

public class IntegerFormat {

	public static void main(String[] args) {
		NConsole console = new NConsole(); 
		console.println("%d", 93); // prints 93 一般的格式
		//width表最少長度
		console.println("|%1d|", 3); // prints: |3|
		console.println("|%1d|", 93); // prints: |93|
		console.println("|%20d|", 93); // prints: |                  93|
		//precision不適用
//		console.println("|%2.1d|", 93); // Error!!
		//-往左靠
		console.println("|%-20d|", 93); // prints: |93                  |
		//0前面補0
		console.println("|%020d|", 93); // prints: |00000000000000000093|
		//永遠保留+/-號
		console.println("|%+20d|", 93); // prints: |                 +93|"
		//+/-號位置，正值時以空格代替
		console.println("|% d|", 93); // prints: | 93| console.println("|% d|", -36); // prints: |-36|
		//加入千位號
		console.println("|%,d|", 10000000); // prints: |10,000,000|
		console.println("|%(d|", -36); // prints: |(36)|
		console.println("|%o|", 93); // prints: 135
		console.println("|%x|", 93); // prints: 5d
	}

}

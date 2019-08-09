package java_classes.teacher.format_string;

public class PrintSquareRoot {
	public static void main(String[] args) {
		String name = "Steven";//請改成你的名字
		int i = 2;
		double r = Math.sqrt(i);

		System.out.format("Hi, %s, the square root of %d is %.4f.%n",name, i, r);//％n是斷行符號，依各平台自訂
		
	}
}

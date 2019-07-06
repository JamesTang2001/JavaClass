package java_classes.teacher.format_string;

public class FormatPractices {

	public static void main(String[] args) {

		//浮點數格式練習
		
		double num = 1/3.0;
		
		System.out.println("num is :"+num);
		System.out.format("num is :% 10.2f%n", num);
		System.out.format("num is :%10.2f%n", num);
		System.out.format("num is :%-10.2f%n", num);
		System.out.format("num is :%- 10.2f%n", num);
		System.out.format("num is :%010.2f%n", num);
		
		
	}

}

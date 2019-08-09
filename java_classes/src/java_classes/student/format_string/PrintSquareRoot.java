package java_classes.student.format_string;

public class PrintSquareRoot {
	public static void main(String[] args) {
		String name = "James";
		int i = 2;
		double r = Math.sqrt(i);
		
		System.out.format("Hi, %s, the square root of %d is %.4f.%n", name, i, r);
		
		double num = 1/7.0;
		System.out.println("num is: " + num);
		System.out.format("num is: %014.7f", num);

		
	}

}

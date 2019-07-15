package java_classes.teacher.temperature_trasfer;

import java.io.IOException;

import java_classes.teacher.console_io.NConsole;

public class Temperature {

	
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = celsius * 9.0/ 5 + 32;
		return fahrenheit;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5.0 / 9;
		return celsius;
	}

	public static void main(String[] args) throws IOException {

		NConsole console = new NConsole();
		
		String ans = console.readLine("請輸入攝氏：");
		
		double celsius = Double.valueOf(ans);
		
		double fahrenheit = celsiusToFahrenheit(celsius);
		
		console.println(fmt, args);
	}

}

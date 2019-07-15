package java_classes.teacher.console_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NConsole {

	private BufferedReader bufferedReader;

	public NConsole() {
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public NConsole format(String fmt, Object... args) {

		System.out.printf(fmt, args);

		return this;
	}
	public NConsole printf(String fmt, Object... args) {

		return format(fmt, args);
	}
	public NConsole println(String fmt, Object... args) {

//		System.out.printf(fmt, args);
//		System.out.printf("%n");
//		
//		return this;
		return format(fmt, args).format("%n");

	}

	public String readLine() throws IOException {

		String line = null;
		line = bufferedReader.readLine();
		return line;

	}
	public String readLine(String fmt, Object... args) throws IOException {

		System.out.printf(fmt, args);

//		String line = null;
//		line = bufferedReader.readLine();
//		return line;
		return readLine();

	}

	public static void main(String[] args) throws IOException {

		NConsole console = new NConsole();

		console.println("Test: String:%s, integer:%d, double:%f", "Hi", 100, 3.14);

		String something = console.readLine("Say something...");

		console.println("That something is:**%s**", something);
	}
}

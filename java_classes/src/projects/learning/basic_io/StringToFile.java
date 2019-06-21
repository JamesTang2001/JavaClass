package projects.learning.basic_io;
import java.io.*;

public class StringToFile {

	public static void main(String[] args) {

		FileWriter fw = null;
		try {

			fw =  new FileWriter("/home/ganrqunx/temp/test.dat");
			
			String str = "這是一個測試\n";
			
			fw.write(str);
			
			fw.close();
			
		} catch (IOException e) {
			System.out.println("IOException occured!!");
		}
	}

}

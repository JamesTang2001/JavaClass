package projects.learning.basic_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UseSystemIn {

	public static void main(String[] args) throws IOException {

//		InputStream in = System.in;
//
//		int c;
//		while ((c = in.read()) != -1) {
//			
//			System.out.println(""+c);
//
//		}
		InputStreamReader cin = new InputStreamReader(System.in);
		char c;
		while ((c = (char) cin.read()) != -1) {
			if(c == 'x') {
				break;
			}
			
			System.out.println(""+c);

		}
		
		
		
	}

}

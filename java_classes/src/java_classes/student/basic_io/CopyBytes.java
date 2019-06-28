package java_classes.student.basic_io;
import java.io.*;

public class CopyBytes {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("/Users/jamestang/temp/xanadu.txt");
			out = new FileOutputStream("/Users/jamestang/temp/outagain.txt");
			int c;
			
			while ((c = in.read())!= -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if(out != null) {
			   out.close();
			}
		}
	}

}

package java_classes.student.basic_io;

import java.io.*;

public class CopyMoreBytes {

	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("/Users/jamestang/temp/xanadu.txt");
			out = new FileOutputStream("/Users/jamestang/temp/xanadu.txt");
			int c;

			byte[] bytes = new byte[10];
			while ((c = in.read(bytes)) != -1) {

				out.write(bytes, 0, c);
			}
		} finally {
			// TODO: handle finally clause
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}

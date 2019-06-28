package java_classes.teacher.basic_io;

import java.io.*;

public class CopyAllBytes {

	public static void main(String[] args) throws IOException {

		/*
		 * 本程式使用read[cbuf, offset, length]功能， 設定一個剛好是檔案長度的byte[] 再利用這個read功能，依次把資料放進去。
		 */
		// 先知道檔案的長度
		// 需要得到file
		File file = new File("/home/ganrqunx/temp/xanadu.txt");
		long length = file.length();

		FileInputStream in = null;

		try {
			in = new FileInputStream(file);
			int c;

			byte[] bytes = new byte[(int) length];
			int offset = 0;
			int readLength = 10;
			while ((c = in.read(bytes, offset, readLength)) != -1) {
				offset += c;
				if(offset >= length) {
					break;
				}
			}
			String result = new String(bytes);
			System.out.println("Result is:**"+result+"**.");
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

}

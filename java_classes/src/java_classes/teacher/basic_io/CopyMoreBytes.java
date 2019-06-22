package java_classes.teacher.basic_io;
import java.io.*;

public class CopyMoreBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/home/ganrqunx/temp/xanadu.txt");
            out = new FileOutputStream("/home/ganrqunx/temp/outagain.txt");
            int c;

            byte[] bytes = new byte[10];
            while ((c = in.read(bytes)) != -1) {
            		
            	//因為讀到的長度未必是10，所以必須參考讀到的長度
                out.write(bytes, 0, c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}

package java_classes.teacher.basic_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("xanadu.txt");
            fw = new FileWriter("characteroutput.txt");

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } finally {
            if (fr != null) {
                fr.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}
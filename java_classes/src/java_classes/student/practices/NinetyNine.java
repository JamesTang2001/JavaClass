package java_classes.student.practices;
import java_classes.teacher.console_io.NConsole;
public class NinetyNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("**********************")
		
		NConsole console = new NConsole();
		for (int id1 = 1; id1 <= 9; id1++) {
			for (int id2 = 1; id2 <= 9; id2++) {
				int product = id1 * id2;
				console.println("%d * %d = %02d", id1, id2, product);
				
			}
			System.out.println("**********************");
		}

	}

}

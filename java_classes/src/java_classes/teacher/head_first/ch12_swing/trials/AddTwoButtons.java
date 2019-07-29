package java_classes.teacher.head_first.ch12_swing.trials;

//記得import javax.swing.*
import javax.swing.*;

public class AddTwoButtons {

	public static void main(String[] args) {

		//  先建立一個jframe & jbutton
		JFrame frame = new JFrame();
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		
		//設定jframe關閉行為
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//把button加到frame的pane
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(b3);
		
		//設定frame size
		frame.setSize(300, 300);
		
		//令frame為可見
		frame.setVisible(true);
		

		
	}

}

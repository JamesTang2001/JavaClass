package java_classes.teacher.head_first.ch12_swing;

//記得import javax.swing.*
import javax.swing.*;

public class SimpleGUI {

	public static void main(String[] args) {

		//  先建立一個jframe & jbutton
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me!!");
		
		//設定jframe關閉行為
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//把button加到frame的pane
		frame.getContentPane().add(button);
		
		//設定frame size
		frame.setSize(300, 300);
		
		//令frame為可見
		frame.setVisible(true);
		

		
	}

}

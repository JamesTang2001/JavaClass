package java_classes.student.head_first.ch12_swing;

import javax.swing.*;

public class SimpleGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me!");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(button);

		frame.setSize(300, 300);

		frame.setVisible(true);
	}

}

package java_classes.student.head_first.ch12_swing;

import javax.swing.*;

public class SimpleGUI_UseMyPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();

		MyPanelRandomColor panel = new MyPanelRandomColor();
//		MyPanelDrawingRectangle panel = new MyPanelDrawingRectangle();
//		MyPanelShowJPG panel = new MyPanelShowJPG();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(panel);

		frame.setSize(300, 300);

		frame.setVisible(true);
	}

}

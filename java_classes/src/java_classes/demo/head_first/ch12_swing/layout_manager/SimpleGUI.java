package java_classes.demo.head_first.ch12_swing.layout_manager;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//記得import javax.swing.*
import javax.swing.*;

import java_classes.teacher.head_first.ch12_swing.MyPanelRandomColor;

public class SimpleGUI implements ActionListener{

	public static void main(String[] args) {

		//  先建立一個jframe & jbutton
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me!!");
		MyPanelRandomColor panel = new MyPanelRandomColor();
		
		//設定jframe關閉行為
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//把button加到frame的pane
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		//設定frame size
		frame.setSize(300, 300);
		
		//令frame為可見
		frame.setVisible(true);
		

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		frame.repaint();
		
	}

}

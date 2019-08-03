package java_classes.demo.head_first.ch12_swing.layout_manager;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//記得import javax.swing.*
import javax.swing.*;
import java_classes.teacher.head_first.ch12_swing.*;

public class FourElements{
class B2Action implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		label.setText("I've been clicked!!");
	}
	
}
class B1Action implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.repaint();
		
	}
	
}
		JFrame frame;
		JButton b1;
		JButton b2;
		MyPanelRandomColor panel;
		JLabel label;
	public static void main(String[] args) {
		FourElements u = new FourElements();
		
		u.go();

	}
	public void go() {

		//  先建立一個jframe & jbutton
		frame = new JFrame();
		b1 = new JButton("Click Me!!");
		b1.addActionListener(new B1Action());
		b2 = new JButton("Change Text..");
		b2.addActionListener(new B2Action());
		panel = new MyPanelRandomColor();
		label = new JLabel("None..");
		
		//設定jframe關閉行為
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//把button加到frame的pane
		frame.getContentPane().add(b1, BorderLayout.SOUTH);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(b2, BorderLayout.EAST);
		frame.getContentPane().add(label, BorderLayout.WEST);
		
		//設定frame size
		frame.setSize(500, 500);
		
		//令frame為可見
		frame.setVisible(true);
		

		
	}

}

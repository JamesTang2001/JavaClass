package java_classes.student.head_first.ch12_swing.layout_manager;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//記得import javax.swing.*
import javax.swing.*;
import java_classes.student.head_first.ch12_swing.*;

public class UseLayoutManager implements ActionListener {

	JFrame frame;
	JButton button;
	MyPanelRandomColor panel;

	public static void main(String[] args) {

		UseLayoutManager u = new UseLayoutManager();
		u.go();

	}

	public void go() {

		// 先建立一個jframe & jbutton
		frame = new JFrame();
		button = new JButton("Click Me!!");
		button.addActionListener(this);
		panel = new MyPanelRandomColor();

		// 設定jframe關閉行為
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 把button加到frame的pane
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		// 設定frame size
		frame.setSize(300, 300);

		// 令frame為可見
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.repaint();

	}

}

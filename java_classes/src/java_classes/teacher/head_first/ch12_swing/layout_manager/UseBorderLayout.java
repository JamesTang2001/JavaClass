package java_classes.teacher.head_first.ch12_swing.layout_manager;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//記得import javax.swing.*
import javax.swing.*;

import java_classes.teacher.head_first.ch12_swing.*;

public class UseBorderLayout implements ActionListener {

	public static void main(String[] args) {

		UseBorderLayout ub = new UseBorderLayout();

		ub.go();
	}

	JFrame frame;

	public void go() {

		// 產生JFrame 並設定關閉行為
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 產生組件
		JButton button = new JButton("Change color!!");
		button.addActionListener(this);
		MyPanelRandomColor panel = new MyPanelRandomColor();
		

		// 放置到適當位置
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(button, BorderLayout.SOUTH);

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

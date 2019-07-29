package java_classes.teacher.head_first.ch12_swing.layout_manager;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//記得import javax.swing.*
import javax.swing.*;

import java_classes.teacher.head_first.ch12_swing.*;

public class TwoEvents{

	public static void main(String[] args) {

		TwoEvents ub = new TwoEvents();

		ub.go();
	}

	JFrame frame;
	JLabel label = new JLabel("no change..");

	public void go() {

		// 產生JFrame 並設定關閉行為
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 產生組件
		JButton button = new JButton("Change color!!");
		button.addActionListener(new B1ActionListener());
		MyPanelRandomColor panel = new MyPanelRandomColor();

		// 新增組件
		JButton b2 = new JButton("Change text!!");
		b2.addActionListener(new B2ActionListener());
//		label = new JLabel("no change..");

		// 放置到適當位置
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		frame.getContentPane().add(b2, BorderLayout.EAST);
		frame.getContentPane().add(label, BorderLayout.WEST);

		// 設定frame size
		frame.setSize(500, 600);
		// 令frame為可見
		frame.setVisible(true);

	}

	class B2ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setText("I've been clicked!");

		}

	}

	class B1ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			frame.repaint();

		}

	}

}

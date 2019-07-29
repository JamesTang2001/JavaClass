package java_classes.teacher.head_first.ch12_swing.layout_manager;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//記得import javax.swing.*
import javax.swing.*;

import java_classes.teacher.head_first.ch12_swing.*;

/*
 * 讓所有組件屬於物件屬性
 * 在go中建構組件，加入布局，事件處理
 */
public class BetterGUI {

	public static void main(String[] args) {

		BetterGUI ub = new BetterGUI();

		ub.go();
	}

	JFrame frame;
	JLabel label;
	JButton b1;
	MyPanelRandomColor panel;
	JButton b2;

	public void go() {

		// 產生JFrame 並設定關閉行為
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 產生組件，加入事件
		b1 = new JButton("Change color!!");
		b1.addActionListener(new B1ActionListener());
		panel = new MyPanelRandomColor();
		b2 = new JButton("Change text!!");
		b2.addActionListener(new B2ActionListener());
		label = new JLabel("no change..");

		// 放置到適當位置
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(b1, BorderLayout.SOUTH);
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

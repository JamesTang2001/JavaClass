package java_classes.student.head_first.ch12_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGUIWithEvent implements ActionListener {

	public static void main(String[] args) {
		SimpleGUIWithEvent gui = new SimpleGUIWithEvent();
		gui.go();

	}

	JButton button;

	public void go() {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		button = new JButton("Click Me!");

		button.addActionListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(button);

		frame.setSize(300, 300);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setText("I've been clicked!");
	}

}

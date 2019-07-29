package java_classes.demo.head_first.ch12_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//記得import javax.swing.*
import javax.swing.*;

public class SimpleGUIWithEvent implements ActionListener {

	public static void main(String[] args) {

		SimpleGUIWithEvent gui = new SimpleGUIWithEvent();
		gui.go();

	}

	JButton button;

	public void go() {

		// 先建立一個jframe & jbutton
		JFrame frame = new JFrame();
		button = new JButton("Click Me!!");
		
		button.addActionListener(this);

		// 設定jframe關閉行為
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 把button加到frame的pane
		frame.getContentPane().add(button);

		// 設定frame size
		frame.setSize(300, 300);

		// 令frame為可見
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("I've been clicked!!");

	}

}

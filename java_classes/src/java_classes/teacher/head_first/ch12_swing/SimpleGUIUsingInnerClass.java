package java_classes.teacher.head_first.ch12_swing;

//記得import javax.swing.*
import javax.swing.*;
import java.awt.event.*;

public class SimpleGUIUsingInnerClass {
	// 要接收事件的元件，必須定義為個體屬性
	JButton button;
	JFrame frame;

	public static void main(String[] args) {
		SimpleGUIUsingInnerClass gui = new SimpleGUIUsingInnerClass();
		gui.go();
	}

	public void go() {

		// 先建立一個jframe & jbutton
		frame = new JFrame();
		button = new JButton("Click Me!!");

		// 重點在這一行
		button.addActionListener(new ButtonActionListener());

		// 設定jframe關閉行為
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 把button加到frame的pane
		frame.getContentPane().add(button);

		// 設定frame size
		frame.setSize(300, 300);

		// 令frame為可見
		frame.setVisible(true);

	}

	class ButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			button.setText("I've benn clicked!!");
		}
	}
}

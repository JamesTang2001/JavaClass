package java_classes.student.head_first.ch12_swing.layout_manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelInnerClass {
	int xPosition = 0;

	class ButtonClicked implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			xPosition += 5;
			frame.repaint();

		}

	}

	public static void main(String[] args) {
		PanelInnerClass p = new PanelInnerClass();
		p.go();
	}

	class InnerPanel extends JPanel {

		public void paintComponent(Graphics g) {
			g.setColor(Color.CYAN);
//			g.fillRect(20, 50, 100, 100);
//			g.fillOval(20, 50, 50, 50);
			g.fillOval(xPosition, 0, 50, 50);
		}
	}

	JFrame frame;
	InnerPanel panel;
	JButton button;

	public void go() {
		frame = new JFrame();
		panel = new InnerPanel();
		button = new JButton();
		button.addActionListener(new ButtonClicked());

		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(button, BorderLayout.SOUTH);

		frame.setSize(300, 300);

		frame.setVisible(true);
	}
}

package java_classes.student.head_first.ch12_swing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class MyPanelDrawingRectangle extends JPanel {

	public void paintComponent(Graphics g) {

		g.setColor(Color.blue);
		g.fillRect(20, 50, 100, 100);
	}
}

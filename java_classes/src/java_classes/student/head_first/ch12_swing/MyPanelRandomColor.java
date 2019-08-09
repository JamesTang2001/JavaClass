package java_classes.student.head_first.ch12_swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class MyPanelRandomColor extends JPanel {

	public void paintComponent(Graphics g) {

		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);

		Color color = new Color(red, green, blue);

		g.setColor(color);

		g.fillOval(70, 70, 100, 150);
	}
}

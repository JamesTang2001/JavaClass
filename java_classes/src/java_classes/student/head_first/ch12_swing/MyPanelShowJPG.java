package java_classes.student.head_first.ch12_swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class MyPanelShowJPG extends JPanel {

	public void paintComponent(Graphics g) {

		Image image = new ImageIcon("/Users/jamestang/temp/sample.jpg").getImage();

		g.drawImage(image, 3, 4, this);

	}
}

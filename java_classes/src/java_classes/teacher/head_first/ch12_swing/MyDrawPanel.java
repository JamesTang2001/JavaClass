package java_classes.teacher.head_first.ch12_swing;
import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.green);
		g.fillRect(20, 50, 100, 100);
	}
	


}

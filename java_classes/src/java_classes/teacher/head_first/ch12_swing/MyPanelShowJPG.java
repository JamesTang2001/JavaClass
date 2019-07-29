package java_classes.teacher.head_first.ch12_swing;
import javax.swing.*;
import java.awt.*;

public class MyPanelShowJPG extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		Image image = new ImageIcon("/Users/ganrqunx/Dropbox/Public/sample.JPG").getImage();
		
		g.drawImage(image, 3, 4, this);
	}
	


}

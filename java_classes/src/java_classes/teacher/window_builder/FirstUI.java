package java_classes.teacher.window_builder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class FirstUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstUI window = new FirstUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("AR PL UKai TW MBE", Font.PLAIN, 16));
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Samsung", "Asus", "Apple", "Google"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(67, 79, 196, 147);
		frame.getContentPane().add(list);
		frame.setBounds(100, 100, 376, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

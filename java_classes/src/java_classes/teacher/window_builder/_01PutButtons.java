package java_classes.teacher.window_builder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class _01PutButtons {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_01PutButtons window = new _01PutButtons();
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
	public _01PutButtons() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(332, 12, 106, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("華氏");
		label.setBounds(56, 22, 60, 15);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(56, 49, 104, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("攝氏");
		label_1.setBounds(224, 22, 60, 15);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 49, 104, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}

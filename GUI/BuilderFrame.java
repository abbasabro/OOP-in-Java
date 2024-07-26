package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;

public class BuilderFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderFrame frame = new BuilderFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuilderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setForeground(new Color(128, 255, 128));
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBackground(new Color(255, 255, 0));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBackground(new Color(0, 128, 64));
		contentPane.add(btnNewButton_1);
	}

}

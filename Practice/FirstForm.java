package Paper;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstForm frame = new FirstForm();
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
	public FirstForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(113, 50, 56, 25);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAge.setBounds(113, 111, 56, 31);
		contentPane.add(lblAge);
		
		textName = new JTextField();
		textName.setBounds(215, 55, 96, 19);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setBounds(215, 119, 96, 19);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOk.setBounds(84, 182, 85, 21);
		contentPane.add(btnOk);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textAge.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setBounds(242, 182, 85, 21);
		contentPane.add(btnReset);
	}
}

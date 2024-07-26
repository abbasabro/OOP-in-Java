package Paper;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class Structure extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Structure frame = new Structure();
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
	public Structure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLogo.setBounds(10, 10, 45, 13);
		contentPane.add(lblLogo);
		
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JPanel stdPanel = new JPanel();
				stdPanel.setBounds(129, 10, 297, 243);
				stdPanel.setLayout(null);
			
				JLabel lblName = new JLabel("Name");
				lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblName.setBounds(50, 50, 45, 13);
				stdPanel.add(lblName);
				
				JLabel lblRollNo = new JLabel("Roll No");
				lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblRollNo.setBounds(50, 100, 45, 13);
				stdPanel.add(lblRollNo);
				
				JLabel lblMail = new JLabel("Gmail");
				lblMail.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblMail.setBounds(50, 150, 45, 13);
				stdPanel.add(lblMail);
				
				JLabel lblBatch = new JLabel("Batch");
				lblBatch.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblBatch.setBounds(50, 200, 45, 13);
				stdPanel.add(lblBatch);
				
				JButton btnSubmit = new JButton("Submit");
				btnSubmit.setBounds(250, 250, 85, 21);
				stdPanel.add(btnSubmit);
				
				textField = new JTextField();
				textField.setBounds(200, 50, 96, 19);
				stdPanel.add(textField);
				textField.setColumns(10);
				
				textField_1 = new JTextField();
				textField_1.setBounds(200, 100, 96, 19);
				stdPanel.add(textField_1);
				textField_1.setColumns(10);
				
				textField_2 = new JTextField();
				textField_2.setBounds(200, 150, 96, 19);
				stdPanel.add(textField_2);
				textField_2.setColumns(10);
				
				JSpinner spinner = new JSpinner();
				spinner.setModel(new SpinnerListModel(new String[] {"19SW", "20SW", "21SW", "22SW", "23SW"}));
				spinner.setBounds(200, 200, 67, 13);
				stdPanel.add(spinner);
				
				contentPane.add(stdPanel);
			
				
			}
		});
		btnAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAddStudent.setBounds(10, 69, 109, 31);
		contentPane.add(btnAddStudent);
		
		JButton btnViewStudent = new JButton("View Student");
		btnViewStudent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewStudent.setBounds(10, 143, 109, 31);
		contentPane.add(btnViewStudent);
		

		
		JPanel viewPanel = new JPanel();
		viewPanel.setBounds(129, 10, 297, 243);
		viewPanel.setLayout(null);
		contentPane.add(viewPanel);
		
	}
	public void makeStdPanel() {}
}

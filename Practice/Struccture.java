package Paper;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Struccture extends JFrame {
	JLabel logo;
	JButton addButton,viewButton;
	JLabel lblName,lblRollNo,lblGmail,lblBatch;
	JTextField textName,textRollNo,textGmail,textBatch;
	JPanel viewPanel,stdPanel;
	Struccture(){
        logo= new JLabel();
		addButton=new JButton("Add Student");
		stdPanel= new JPanel();
		  addButton.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				 
				  
				 
				  lblName=new JLabel("Name");
				  lblName.setBounds(50,30,150,50);
				  stdPanel.add(lblName);
			  }
		   });
        addButton.setBounds(0, 50, 100, 50);
        this.add(addButton);
        
     	viewButton=new JButton("View Student");
	    viewButton.setBounds(0, 200, 100, 50);
	    this.add(viewButton);
	    
		logo.setText("Logo");
		logo.setBounds(0,0,50,30);
		
//		viewPanel.setLayout(null);
//		viewPanel.setBackground(Color.gray);
//		viewPanel.setPreferredSize(new Dimension(250,250));
//		this.add(viewPanel);
//		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,1000);
		this.setTitle("Student");
		this.add(stdPanel);
		this.add(logo);


		
		this.setLayout(null);
		this.setVisible(true);
		
		
		
		
	}
}

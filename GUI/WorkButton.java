import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class WorkButton extends JFrame implements ActionListener {
	JButton button1;
	JButton button2;
	WorkButton() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,500);
	this.setTitle("BUTTON");
	this.setLayout(new GridLayout());
	
	button1=new JButton("1");
	button1.addActionListener(this);
	button2=new JButton("2");
	button2.addActionListener(this);
	
	this.add(button1);
	this.add(button2);
	this.setVisible(true);
	
	
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			System.out.println("NO");
		}else {
			System.out.println("YEshhhhhhh");
		}
	}
	
	
	

}

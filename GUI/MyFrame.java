package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class MyFrame extends JFrame implements  ActionListener{
	JButton button;
	MyFrame(){
	 this.setSize(500,500);
   	 this.setTitle("This is Title");
   	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 this.setVisible(true);
   	 button = new JButton("My Button");
   	 
   	 this.setBackground(Color.black);
   	 this.add(button);
   	 ImageIcon image= new ImageIcon("A.png");
   	 this.setIconImage(image.getImage());
   	 
   	 button.setBounds(100,50,150,100);
   	 button.addActionListener(this);
   	 button.setBackground(Color.blue);
   	 button.setFocusable(false);
  
   	 
	}
	@Override
	public void actionPerformed(ActionEvent e)  {
		if(e.getSource()==button) {
			System.out.println("ah!");
		}
	}
	

	

}

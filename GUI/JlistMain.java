package GUI;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class List extends JFrame implements ActionListener{
	JList<String> list;
	JPanel panel;
	JTextField field;
	JButton button;
	String a[]= {"Data 1","Data 2","Data 3","Data 4","Data 5","Data 6","Data 7","Data 8","Data 9"};
	List(){
		list= new JList<>(a);
		panel=new JPanel();
		field =new JTextField();
		button =new JButton("Show");
		panel.add(list);
		panel.add(button);
		panel.add(field);
		button.addActionListener(this);
		
		field.setPreferredSize(new Dimension(250,250));
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setTitle("Jlist");
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String data=list.getSelectedValue();
			if(data!=null) {
				field.setText(data);
			}
		}
		
	}
}
public class JlistMain {
	
	public static void main(String[] args) {
		new List();
	}
}

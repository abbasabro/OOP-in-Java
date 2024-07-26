package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

class A extends JFrame implements MouseListener{
	JList<String> list;
	JLabel lbln,lble;
	JTextField txtn,txte;
	JPanel panel;
	String[] data={"Mike","Jane","Jone"};
	
	A(){
		list=new JList<>(data);
		list.addMouseListener(this);
		panel=new JPanel();
		panel.setLayout(new GridLayout(2,2));
		
		lbln=new JLabel("Name ");
		panel.add(lbln);
		
		txtn=new JTextField();
		txtn.setPreferredSize(new Dimension(100,100));
		panel.add(txtn);
		
		lble=new JLabel("Email ");
		panel.add(lble);
		
		txte=new JTextField();
		txte.setPreferredSize(new Dimension(100,100));
		panel.add(txte);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("List and Details");
		this.setLayout(new FlowLayout());
		this.add(list);
		this.add(panel);
		this.pack();
		this.setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		String data=list.getSelectedValue();
		if(data.contains("Mike")) {
		txtn.setText("Mike John");
		txte.setText("mikejones@example.com");
		}else if(data.contains("Jane")) {
		txtn.setText("Jane Malik");
		txte.setText("janemalik@example.com");
		}else if(data.contains("Jone")) {
		txtn.setText("John Khan");
		txte.setText("jonekhan@example.com");
		}else {
		txtn.setText("");
		txte.setText("");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class StdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new A();
	}

}

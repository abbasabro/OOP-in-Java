package GUI;

import javax.swing.*;

public class LabGUI{
	
	JFrame frame;
	
	
	public LabGUI() {
		frame = new JFrame();
		
		frame.setTitle("Demo 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,100);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new LabGUI();
	}
}
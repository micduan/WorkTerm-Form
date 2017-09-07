package mainsurvey;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Survey extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		try {
			Survey mysurvey = new Survey();
			mysurvey.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Survey() {
		setVisible(true);
		setSize(300, 600);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Work Term Evaluation");
		JButton button1 = new JButton("Continue");
		button1.setBounds(90, 500, 125, 30);
		button1.setActionCommand("continue");
		button1.addActionListener(Survey.this);
		add(button1);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if ("continue".equals(e.getActionCommand())) {
			JFrame newFrame = new JFrame();
			newFrame.setVisible(true);
			
		} else {
			JOptionPane.showMessageDialog(null, "Did not work");
		}
	}
	
}

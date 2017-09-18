package mainsurvey;

import java.awt.BorderLayout;
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
		setSize(300, 600);
		// Set setLayout to new BorderLayout() in order to add JPanels
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Work Term Evaluation");
		JButton button1 = new JButton("Continue");
		button1.setBounds(90, 500, 125, 30);
		button1.setActionCommand("continue");
		button1.addActionListener(Survey.this);
		add(button1);
		addText("test");
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if ("continue".equals(e.getActionCommand())) {
			final createFrame frame = new createFrame();
			frame.run();
			this.dispose();
			
		} else {
			JOptionPane.showMessageDialog(null, "Did not work");
		}
	}
	public void addText(String text) {
		JPanel main = new JPanel();
		JLabel label1 = new JLabel("Label1");
		label1.setText(text);
		main.add(label1);
		add(main);
	}
}

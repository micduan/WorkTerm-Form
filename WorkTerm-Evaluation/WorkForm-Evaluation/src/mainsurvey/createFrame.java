package mainsurvey;

import javax.swing.*;

public class createFrame extends JFrame {
    public void run()
    {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(300,600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Work Term Evaluation");
    }
    
    public void addQuestions()
    {
    	
    }
}

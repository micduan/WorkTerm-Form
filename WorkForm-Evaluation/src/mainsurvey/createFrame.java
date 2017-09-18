package mainsurvey;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import org.json.JSONObject;

@SuppressWarnings("serial")
public class createFrame extends JFrame implements ActionListener  {
	List<JTextField> textFields = new ArrayList<JTextField>();
	JFrame frame = new JFrame("Test");
    public void run()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(900,800);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		frame.setTitle("Work Term Evaluation2");
		frame.setVisible(true);
    	JPanel main = new JPanel();
		String myjson = parseJson.getQuestions();
		JSONObject json = new JSONObject(myjson);
		org.json.JSONArray jsonArray = json.getJSONArray("questions");
		GridBagConstraints textFieldConstraints = new GridBagConstraints();
		for (int i = 0; i < jsonArray.length(); i++) {
			JLabel l = new JLabel();
			JLabel l2 = new JLabel();
		    String value = "<html>" + jsonArray.getJSONObject(i).getString("text") + "</html><br></br>";
		    l2.setText("");
		    l.setText(value);
		    main.add(l);
		    main.add(l2);
            JTextField g=new JTextField();
            g.setText("");
            g.setColumns(10);
            textFieldConstraints.gridx = i;
            textFieldConstraints.fill = GridBagConstraints.HORIZONTAL;
            textFieldConstraints.weightx = 0.5;
            textFieldConstraints.insets = new Insets(10, 10, 10, 10);
            textFieldConstraints.gridy = i;
            textFields.add(g);
            main.add(g, textFieldConstraints);
		}
		JScrollPane scroller = new JScrollPane(main);
		scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
		frame.getContentPane().add(scroller);
        JButton button1 = new JButton("Continue");
		button1.setBounds(90, 500, 125, 30);
		button1.setActionCommand("continue");
		button1.addActionListener(createFrame.this);
		main.add(button1);
		frame.add(main);
    }
	public void actionPerformed(ActionEvent e) {
		if ("continue".equals(e.getActionCommand())) {
	        for(int i = 0;i< textFields.size(); i++){
	        	System.out.println(textFields.get(i).getText());
	        }
			final createFrame frame2 = new createFrame();
			frame2.run();
			frame.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(null, "Did not work");
		}
	}
}

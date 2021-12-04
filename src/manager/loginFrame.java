package manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class loginFrame extends JFrame{
	public loginFrame() {
		setTitle("·Î±×ÀÎ");
		setSize(700,500);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Color c = new Color(210,180,140);
		JPanel logo = new JPanel();
		logo.setBounds(0, 0, 250, 500);
		logo.setPreferredSize(new Dimension(250,500));
		logo.setBackground(c);
		//logo.setBackground(Color.pink);
		add(logo);
		
		JPanel loginPanel = new loginPanel(this);
		add(loginPanel);
		
		
	}
}

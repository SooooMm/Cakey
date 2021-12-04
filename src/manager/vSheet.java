package manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class vSheet extends JPanel{
	public vSheet() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		setBounds(0, 0, 200, 900);
		setPreferredSize(new Dimension(200,900));
		
		setBackground(Color.green);
	}

}

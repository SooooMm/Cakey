package menu;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.*;

public class ProductPanel extends JPanel{

	public ProductPanel(String t) {
		setBorder(new EmptyBorder(10,10,10,10));
		setPreferredSize(new Dimension(150,225));
		setBackground(Color.BLACK);
		JLabel jlabel = new JLabel(t);
		add(jlabel);
	}
	
}

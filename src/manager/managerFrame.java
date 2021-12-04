package manager;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import data.Data;

public class managerFrame extends JFrame{
	
	CardLayout card = new CardLayout();
	public managerFrame() {
		setTitle("°ü¸®");
		setSize(750,1000);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JPanel categoryP = new JPanel();
		categoryP.setBounds(0, 0, 200, 900);
		//categoryP.setBackground(Color.blue);
		categoryP.setLayout(new FlowLayout(FlowLayout.LEFT,0,10));
		add(categoryP);
		
		
		JButton category_btn[] = new JButton[6];
		for(int i=0; i<Data.type.length; i++) {
			category_btn[i]= new JButton(Data.type[i]);
			category_btn[i].setPreferredSize(new Dimension(200,140));
			//type_btn[i].addMouseListener(cc);
			categoryP.add(category_btn[i]);
		}
		
	}
}

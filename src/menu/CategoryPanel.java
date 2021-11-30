package menu;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import data.Product;

public class CategoryPanel extends JPanel{
	
	public JButton type_btn;
	
	public CategoryPanel() {
		setSize(650,130);
		setLayout(new FlowLayout(FlowLayout.RIGHT,0,20));
		
		JButton[] type_btn = new JButton[6];
		
		for(int i=0; i<6; i++) {
			type_btn[i]= new JButton(Product.type[i]);
			type_btn[i].setPreferredSize(new Dimension(100,50));
			//type_btn[i].addMouseListener(cc);
			add(type_btn[i]);
		}
		
		
	}

}

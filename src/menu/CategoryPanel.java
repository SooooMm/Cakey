package menu;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import data.Data;

public class CategoryPanel extends JPanel{
	menuFrame mframe;
	public JButton type_btn;
	
	public CategoryPanel(menuFrame mframe) {
		this.mframe = mframe;
		setSize(650,130);
		setBounds(650, 130, 100, 450);
		setLayout(new FlowLayout(FlowLayout.RIGHT,0,20));
		
		JButton[] type_btn = new JButton[6];
		
		for(int i=0; i<6; i++) {
			type_btn[i]= new JButton(Data.type[i]);
			type_btn[i].setPreferredSize(new Dimension(100,50));
			//type_btn[i].addMouseListener(cc);
			add(type_btn[i]);
		}
		
		
	}
	public class changeCard extends MouseAdapter{
		public changeCard() {}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			//CardLayout card = frm.
		}
	}

}

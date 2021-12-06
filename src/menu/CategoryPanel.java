package menu;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import data.Data;
import manager.vAddP;
import manager.vCream;
import manager.vFloor;
import manager.vIngre;
import manager.vSheet;
import manager.vTopng;
import menu.*;
import menu.menuPanel;
import menu.menuFrame;

public class CategoryPanel extends JPanel{
	//Color ca = new Color(253,245,230);
	menuFrame mframe;
	public JButton type_btn;
	public CardLayout card;

	/*
	 * mvAddp mva = new mvAddp(); mvSheet mvs = new mvSheet();
	 */
	/*
	 * mvSheet vs = new mvSheet(); mvCream vc = new mvCream(); mvIngre vi = new
	 * mvIngre(); mvTopng vt = new mvTopng(); mvFloor vf = new mvFloor(); mvAddP va
	 * = new mvAddP();
	 */
	JButton[] type_btn1 = new JButton[6];

	public CategoryPanel(menuFrame mframe) {
		this.mframe = mframe;
		setSize(650,130);
		setBounds(650, 130, 100, 450);
		setLayout(new FlowLayout(FlowLayout.RIGHT,0,20));
		
		
		Color ca = new Color(253,245,230);
		
		changeCard c = new changeCard();
		
		for(int i=0; i<6; i++) {
			
			type_btn1[i]= new JButton(Data.type[i]);
			type_btn1[i].setPreferredSize(new Dimension(100,50));
			type_btn1[i].addMouseListener(c);
			type_btn1[i].setBackground(ca);
			add(type_btn1[i]);
			
		}	
		
		
		
		 
		 
	}
	
	public class changeCard extends MouseAdapter{
		public changeCard() {}
		
		
		//"시트","생크림","속 재료", "겉 토핑","단","추가"
		@Override
		public void mouseClicked(MouseEvent e) {
			CardLayout card = menuPanel.card;
			JPanel pnCard = menuPanel.pnCard;
			JButton btn = (JButton) e.getSource();
			String category = btn.getText();
			System.out.println(category);
			card.show(pnCard, category);
			
		}
	}

}

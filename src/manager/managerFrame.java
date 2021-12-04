package manager;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.glass.ui.View;

import data.Data;
import menu.menuFrame;

public class managerFrame extends JFrame implements ActionListener{

	public CardLayout card;
	public JPanel pnCard;
	public JPanel categoryP;
	JButton category_btn[]=new JButton[6];
	// "시트","생크림","속 재료", "겉 토핑","단","추가"

	
	  vSheet vs = new vSheet(); 
	  vCream vc = new vCream(); 
	/*
	 * vIngre vi= new vIngre(); vTopng vt= new vTopng(); vFloor vf= new vFloor();
	 * vAddP va == new vAddP();
	 */
	 

	public managerFrame() {
		setTitle("관리");
		setSize(750, 1000);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		card = new CardLayout(0, 0);
		pnCard = new JPanel();
		pnCard.setLayout(card);
		pnCard.setBounds(200, 0, 550, 1000);
		
		pnCard.add("vs", vs);
		pnCard.add("vc", vc);
		
		card.show(pnCard, "vs"); //실행하자마자 보이는
		add(pnCard);

		
		
		categoryP = new JPanel();
		categoryP.setLayout(new FlowLayout(FlowLayout.LEFT,0,10));
		categoryP.setBounds(0, 0, 200, 1000);
		categoryP.setBackground(Color.BLACK);
		add(categoryP);

		for (int i = 0; i < Data.type.length; i++) {
			category_btn[i] = new JButton(Data.type[i]);
			category_btn[i].setPreferredSize(new Dimension(200, 140));
			category_btn[i].addActionListener(this);
			categoryP.add(category_btn[i]);
		}

	}
	
	@Override

	public void actionPerformed(ActionEvent e) {

	     Object ob = e.getSource();

	     if(ob == category_btn[0]) {
	         card.show(pnCard, "vs");
	     }else if(ob == category_btn[1]) {
	    	 card.show(pnCard, "vc");
	     }

	 

	  }
	
}

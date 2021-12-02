package menu;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import data.Data;

public class menuPanel extends JPanel{
	
	public JPanel pnCard;
	public CardLayout card;
	
	public menuPanel() {
		setPreferredSize(new Dimension(600,500));
	
		
		setOpaque(true);
	    setBackground(Color.BLACK);
	    setLayout(new BorderLayout(0, 0));
	    
	    card = new CardLayout(0, 0);
	    pnCard = new JPanel();
	    pnCard.setLayout(card);
	    add(pnCard);
	    
	    ArrayList<Data> pdList=null;
	    for(int i=0; i<Data.type.length; i++) {
	       
	         JPanel temp = new JPanel();
	         temp.setLayout(new BorderLayout());
	         
	         
	         JScrollPane scrollPane = new JScrollPane();
	         scrollPane.setPreferredSize(new Dimension(630,500));
	         scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	         scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	         scrollPane.getVerticalScrollBar().setUnitIncrement(15); //스크롤 속도
	         temp.add(scrollPane, BorderLayout.CENTER);
	         
	         
	         JPanel pn = new JPanel();
	         pn.setLayout(new GridLayout(0, 3,3,3));
	         
	         pn.setOpaque(true);
	         pn.setBackground(Color.white);
	         
	         for (int j = 0; j < Data.type.length; j++)
	         {
	            //Product pr = Product.type[j];
	        	String type = Data.menu[j];
	        	int price = Data.price[j];
	            ProductPanel pp = new ProductPanel(Data.menu[j]);
	            pp.setPreferredSize(new Dimension(150,225));
	            pp.addMouseListener(new MouseAdapter() {
	            	@Override
	            	public void mouseClicked(MouseEvent e) {
	            		new select_menu(type,price);
	            	}
				});
	            pn.add(pp);
	            scrollPane.setViewportView(pn);
	         }
	         pnCard.add(Data.type[i], temp);
	         
	    }
	}
}

/*
 * 
 * public class changeCard extends MouseAdapter
	{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			CardLayout card = 
			super.mouseClicked(e);
		}
	}
 * */

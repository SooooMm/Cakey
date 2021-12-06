package menu;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import data.Data;
import manager.vAddP;
import manager.vCream;
import manager.vFloor;
import manager.vIngre;
import manager.vSheet;
import manager.vTopng;
import user.Product;
import user.UserDAO;

public class menuPanel extends JPanel{
	
	public static JPanel pnCard;
	public static CardLayout card;
	
	/*
	 * vSheet vs = new vSheet(); vCream vc = new vCream(); vIngre vi= new vIngre();
	 * vTopng vt= new vTopng(); vFloor vf= new vFloor(); vAddP va = new vAddP();
	 */
	int count=0;
	public Statement stmt;
	public String sql;
	String category;
	
	public menuPanel() {
		Data data = new Data();
		//HashMap<Integer, ArrayList<Product>> prmap = data.getProductsByType();
		setPreferredSize(new Dimension(600,500));
	
		
		setOpaque(true);
	    setBackground(Color.BLACK);
	    setLayout(new BorderLayout(0, 0));
	    
	    card = new CardLayout(0, 0);
	    pnCard = new JPanel();
	    pnCard.setLayout(card);
	    
	    

		add(pnCard);
	    
	    ArrayList<Product> pdList=null;
	    for(int i=0; i<Data.type.length; i++) {
	    	//pdList = prmap.get(i);
	    	//System.out.println("******"+pdList);
	         JPanel temp = new JPanel();
	         temp.setLayout(new BorderLayout());
	         
	         // 아래 주문 확인 틀
	         JScrollPane scrollPane = new JScrollPane();
	         scrollPane.setPreferredSize(new Dimension(630,500));
	         scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	         scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	         scrollPane.getVerticalScrollBar().setUnitIncrement(15); //스크롤 속도
	         temp.add(scrollPane, BorderLayout.CENTER);
	         
	         //
	         JPanel pn = new JPanel();
	         pn.setLayout(new GridLayout(0, 3,3,3));
	         
	         pn.setOpaque(true);
	         pn.setBackground(Color.white);
	         
	         //System.out.println(pdList.size());
	         //메뉴 하나 하나 틀
	         for (int j = 0; j <Data.menu[i].length; j++)

	         {
	            //Product pr = pdList.get(j);
	        	String type = Data.menu[i][j];
	        	int price = Data.price[i][j];
	        	String filename = Data.Filename[i][j];
	        	
	            ProductPanel pp = new ProductPanel(filename);
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



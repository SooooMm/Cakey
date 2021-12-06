package manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menu.Program;
import user.Product;

public class ProductListPanel extends JPanel{
	String name;
	String fileSrc;
	String price;
	public ProductListPanel(String t,int p, String s) {
		setPreferredSize(new Dimension(550,30));
		this.name=t;
		this.fileSrc=s;
		this.price=Integer.toString(p);
		
		JLabel mName = new JLabel(name);
		mName.setBounds(30,0,160,30);
		mName.setFont(new Font(null, Font.BOLD,18));
		add(mName);
		
		JLabel mprice = new JLabel(price);
		mprice.setBounds(180,0,160,30);
		mprice.setFont(new Font(null, Font.BOLD,18));
		add(mprice);
		
		JLabel mfileSrc = new JLabel(fileSrc);
		mfileSrc.setBounds(340,0,160,30);
		mfileSrc.setFont(new Font(null, Font.BOLD,18));
		add(mfileSrc);
	}
	
	
	
	
}

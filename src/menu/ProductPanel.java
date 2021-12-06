package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.*;
import user.Product;

//메뉴 하나의 틀 (사진, 이름 ) ** 쭈희 **
public class ProductPanel extends JPanel{
	String name;
	public ProductPanel(Product t) {
		setBorder(new EmptyBorder(10,10,10,10));
		setPreferredSize(new Dimension(150,225));
		setBackground(Color.PINK);
		name=t.getName();
		JLabel jlabel = new JLabel(name);
		add(jlabel);
	}
	Image imageone= new ImageIcon(Program.class.getResource("../image/sheet_banila.jpg")).getImage();
	public void paint(Graphics g) { //그리는함수
		//setSize(10,10);
		Dimension d = getSize();
		g.drawImage(imageone,0,0,d.width,d.height,null); 	
	}
	
	
	
}

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

//�޴� �ϳ��� Ʋ (����, �̸� ) ** ���� **
public class ProductPanel extends JPanel{

	public ProductPanel(String t) {
		setBorder(new EmptyBorder(10,10,10,10));
		setPreferredSize(new Dimension(150,225));
		setBackground(Color.PINK);
		JLabel jlabel = new JLabel(t);
		add(jlabel);
	}
	Image imageone= new ImageIcon(Program.class.getResource("../image/sheet_banila.jpg")).getImage();
	public void paint(Graphics g) { //�׸����Լ�
		//setSize(10,10);
		Dimension d = getSize();
		g.drawImage(imageone,0,0,d.width,d.height,null); 	
	}
	
	
	
}

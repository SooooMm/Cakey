package menu;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javafx.scene.layout.Pane;
import data.Product;


class menu_click implements ActionListener{
	String name;
	int price;
	
	public menu_click() {
		
	}
	public menu_click(String name,int price) {
		this.name=name;
		this.price = price;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		new select_menu(name,price);
	}
}

public class menuFrame extends JFrame {
	public static TextArea orderFrame;
	
	public menuFrame() {
		super("메뉴 선택");
		setSize(750,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		JPanel menutext = new JPanel();
		menutext.setBounds(0, 0, 750, 100);
		menutext.setBackground(Color.cyan);
		add(menutext);
		
		
		JPanel frame = new JPanel();
		frame.setBackground(Color.gray);
		frame.setBounds(20, 120, 710, 510);
		frame.setLayout(null);
		add(frame);
		
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,5,5);
		
		JPanel pnMenu = new menuPanel();
		pnMenu.setBackground(Color.green);
		pnMenu.setBounds(0, 0, 630, 500);
		pnMenu.setLayout(fl);
		frame.add(pnMenu);
		
		
		
		
		
		JPanel select_type = new JPanel();
		select_type.setLayout(new FlowLayout(FlowLayout.RIGHT,0,20));
		select_type.setBounds(650, 130, 100, 450);
		JButton[] type_btn = new JButton[6];
		
		for(int i=0; i<6; i++) {
			type_btn[i]= new JButton(Product.type[i]);
			type_btn[i].setPreferredSize(new Dimension(100,50));
			//type_btn[i].addMouseListener(cc);
			select_type.add(type_btn[i]);
		}
		add(select_type);
		
		/*
		JLabel ordertext = new JLabel();
		ordertext.setBounds(20,650,710,200);
		ordertext.setPreferredSize(new Dimension(710,50));
		ordertext.setBackground(Color.yellow);
		ordertext.setOpaque(true);
		ordertext.setHorizontalAlignment(JLabel.CENTER);
		add(ordertext);*/
		
		orderFrame = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		orderFrame.setBounds(20,700,710,250);
		orderFrame.setBackground(Color.pink);
		add(orderFrame);
		
		
	}
	
	
	public static void main(String[] args) {
		new menuFrame();
	}
}

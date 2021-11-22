package menu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class select_menu extends JFrame{
	
	String name;
	int total;
	
	public select_menu() {
		System.out.println("�⺻");
	}
	public select_menu(String name,int price) {
		
		super("�޴� �ֹ�");
		setSize(500,280);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setLocationRelativeTo(null);
		setResizable(false);
		
		this.name= name;
		
		JLabel menu_name = new JLabel(name);
		menu_name.setPreferredSize(new Dimension(460,75));
		menu_name.setBackground(Color.yellow);
		menu_name.setOpaque(true);
		menu_name.setHorizontalAlignment(JLabel.CENTER);
		add(menu_name);
		
		JLabel menu_num = new JLabel("0");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		
		plus.setPreferredSize(new Dimension(75,75));
		minus.setPreferredSize(new Dimension(75,75));
		
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = (Integer.parseInt(menu_num.getText())) -1;
				if(num<0) num=0;
				menu_num.setText(Integer.toString(num));
				
			}
		});
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = (Integer.parseInt(menu_num.getText())) +1;
				menu_num.setText(Integer.toString(num));
				
			}
		});
		
		menu_num.setPreferredSize(new Dimension(150,75));
		menu_num.setHorizontalAlignment(JLabel.CENTER);
		menu_num.setBackground(Color.yellow);
		menu_num.setOpaque(true);
		
		add(minus);
		add(menu_num);
		add(plus);
		
		JButton ok_btn = new JButton("Ȯ��");
		ok_btn.setPreferredSize(new Dimension(360,75));
		ok_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				total=Integer.parseInt(menu_num.getText()) * price;
				if(total>0) System.out.println("�̸� : "+name+" ���� : "+total);
					
				dispose();
			}
		});
		add(ok_btn);
		                       							
		JButton cancel_btn = new JButton("���");
		cancel_btn.setPreferredSize(new Dimension(100,75));
		cancel_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		add(cancel_btn);
		
	}
	
	/*
	public String getName() {
		return name;
	}
	public int getPrice() {
		return total;
	}*/
}
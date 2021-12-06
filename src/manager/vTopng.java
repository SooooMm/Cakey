package manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.MenuListener;

import data.Data;
import user.UserDAO;
import manager.*;
import menu.*;

public class vTopng extends JPanel{
	public Statement stmt;
	public String sql;
	String category;
	int count=0;
	
	JPanel menuList;
	
	public vTopng() {
		System.out.println("토핑칸");
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		setLayout(null);
		setBounds(0, 0, 550, 1000);
		setPreferredSize(new Dimension(550,1000));
		
		JPanel btn_group = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,10));
		btn_group.setBounds(0,0,550,100);
		btn_group.setPreferredSize(new Dimension(550,80));
		btn_group.setBackground(Color.red);
		
		JButton add_btn = new JButton("추가");
		JButton del_btn = new JButton("삭제");
		JButton edit_btn = new JButton("수정");
		JButton reload_btn = new JButton("변경");
		add_btn.setPreferredSize(new Dimension(120,60));
		del_btn.setPreferredSize(new Dimension(120,60));
		edit_btn.setPreferredSize(new Dimension(120,60));
		reload_btn.setPreferredSize(new Dimension(60,60));
		btn_group.add(reload_btn);
		btn_group.add(add_btn);
		btn_group.add(edit_btn);
		btn_group.add(del_btn);
		
		menuList = new JPanel();
		menuList.setBounds(0,100,550,900);
		menuList.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		menuList.setPreferredSize(new Dimension(550,900));
		add(menuList);
		setMenu();
		
		
		add(btn_group);
		add_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new addFrame("Topping");

			}
		});
		edit_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new editFrame("Topping");

			}
		});
		del_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new delFrame("Topping");
				
			}
		});
		reload_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setMenu();

			}
		});
		
		
		setBackground(Color.green);
	}
	public void setMenu() {
		try {
			menuList.removeAll();
			menuList.revalidate();
			menuList.repaint();
			count=0;
			stmt = UserDAO.conn.createStatement();
			sql="SELECT * FROM Topping";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String Filesrc = rs.getString("fileSrc");
				
				String result="";
				result = result.format("%d : %s\t%d\t%s", ++count,name,price,Filesrc);
				System.out.println(result);
				
				ProductListPanel pp = new ProductListPanel(name,price,Filesrc);
				menuList.add(pp);
			}
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}

package manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JPanel;

import user.UserDAO;
import manager.*;

public class vSheet extends JPanel{
	
	public vSheet() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		setBounds(0, 0, 550, 1000);
		setPreferredSize(new Dimension(550,1000));
		
		JPanel btn_group = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,10));
		btn_group.setBounds(0,900,550,100);
		btn_group.setPreferredSize(new Dimension(550,80));
		btn_group.setBackground(Color.red);
		
		JButton add_btn = new JButton("추가");
		JButton del_btn = new JButton("삭제");
		JButton edit_btn = new JButton("수정");
		add_btn.setPreferredSize(new Dimension(120,60));
		del_btn.setPreferredSize(new Dimension(120,60));
		edit_btn.setPreferredSize(new Dimension(120,60));
		btn_group.add(add_btn);
		btn_group.add(edit_btn);
		btn_group.add(del_btn);
		
		
		
		
		add(btn_group);
		add_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new addFrame("sheets");

			}
		});
		edit_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new editFrame("sheets");

			}
		});
		del_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new delFrame("sheets");
				
			}
		});
		
		
		setBackground(Color.green);
	}

}

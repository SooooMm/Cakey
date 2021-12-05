package manager;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import user.UserDAO;
import manager.*;

public class editFrame extends JFrame{
	public Statement stmt;
	public String sql;
	String category;
	
	public editFrame(String category) {
		this.category=category;
		setSize(450,450);
		setTitle("메뉴 추가");
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		

		JLabel menuNameTxt = new JLabel("메뉴 이름 : ");
		menuNameTxt.setBounds(30,60,110,30);
		menuNameTxt.setFont(new Font(null, Font.BOLD,18));
		add(menuNameTxt);
		
		JTextField manuName = new JTextField();
		manuName.setBounds(130,60,270,30);
		// 아이디 제한
		add(manuName);
		
		JLabel editNameTxt = new JLabel("수정 이름 : ");
		editNameTxt.setBounds(30,120,110,30);
		editNameTxt.setFont(new Font(null, Font.BOLD,18));
		add(editNameTxt);
		
		JTextField editName = new JTextField();
		editName.setBounds(130,120,270,30);
		// 아이디 제한
		add(editName);
		
		JLabel priceText = new JLabel("가    격 : ");
		priceText.setBounds(30,180,110,30);
		priceText.setFont(new Font(null, Font.BOLD,18));
		add(priceText);
		
		JTextField price = new JTextField();
		price.setBounds(130,180,270,30);
		// 비밀번호 제한
		add(price);
		
		JLabel FileSrcText = new JLabel("사진 파일  : ");
		FileSrcText.setBounds(30,240,110,30);
		FileSrcText.setFont(new Font(null, Font.BOLD,18));
		add(FileSrcText);
		
		JTextField FileSrc = new JTextField();
		FileSrc.setBounds(130,240,270,30);
		// 비밀번호 제한
		add(FileSrc);
		
		
		
		JButton ok_btn = new JButton("확인");
		ok_btn.setBounds(30,300,370,60);
		add(ok_btn);
		
		ok_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					stmt = UserDAO.conn.createStatement();
					sql="UPDATE "+category+" SET name ='해피',price=2000, fileSrc='sad' WHERE name='해치'";
					int afectCnt = stmt.executeUpdate(sql);
					System.out.println(afectCnt); //영향 받은 데이터 몇개
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		
		
		
	}
}

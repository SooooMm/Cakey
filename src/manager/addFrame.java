package manager;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import user.UserDAO;
import manager.*;

public class addFrame extends JFrame{
	public Statement stmt;
	public String sql;
	String category;
	
	JTextField manuName;
	JTextField price;
	JLabel FileSrcText;
	JTextField FileSrc;
	public addFrame(String category) {
		this.category=category;
		setSize(450,400);
		setTitle("메뉴 추가");
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		
		JLabel menuNameTxt = new JLabel("메뉴 이름 : ");
		menuNameTxt.setBounds(30,60,110,30);
		menuNameTxt.setFont(new Font(null, Font.BOLD,18));
		add(menuNameTxt);
		
		manuName = new JTextField();
		manuName.setBounds(120,60,270,30);
		// 아이디 제한
		add(manuName);
		
		JLabel priceText = new JLabel("가    격 : ");
		priceText.setBounds(30,120,110,30);
		priceText.setFont(new Font(null, Font.BOLD,18));
		add(priceText);
		
		price = new JTextField();
		price.setBounds(120,120,270,30);
		// 비밀번호 제한
		add(price);
		
		FileSrcText = new JLabel("사진 파일  : ");
		FileSrcText.setBounds(30,180,110,30);
		FileSrcText.setFont(new Font(null, Font.BOLD,18));
		add(FileSrcText);
		
		FileSrc = new JTextField();
		FileSrc.setBounds(120,180,270,30);
		// 비밀번호 제한
		add(FileSrc);
		
		
		
		JButton ok_btn = new JButton("확인");
		ok_btn.setBounds(30,240,370,60);
		add(ok_btn);
		
		ok_btn.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = manuName.getText();
				String fileSrc = FileSrc.getText();
				String temp = price.getText();
				
				System.out.println(name);
				System.out.println(fileSrc);
				System.out.println(temp);
				
				int m = Integer.parseInt(temp);
				try {
					stmt = UserDAO.conn.createStatement();
					
					sql="INSERT INTO "+category+" (name,price,fileSrc) ";
					sql+="VALUES(?,?,?)";
					UserDAO.pstmt=UserDAO.conn.prepareStatement(sql);
					
					UserDAO.pstmt.setString(1, name);
					UserDAO.pstmt.setInt(2, m);
					UserDAO.pstmt.setString(3, fileSrc);
					
					int afectCnt = UserDAO.pstmt.executeUpdate();
					System.out.println(afectCnt); //영향 받은 데이터 몇개
					
					UserDAO.pstmt.close();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		
		
		
	}
}

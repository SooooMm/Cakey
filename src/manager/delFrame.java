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

public class delFrame extends JFrame{
	public Statement stmt;
	public String sql;
	String category;
	
	public delFrame(String category) {
		this.category=category;
		setSize(450,250);
		setTitle("�޴� ����");
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		

		
		JLabel menuName = new JLabel("�޴� �̸� : ");
		menuName.setBounds(30,50,110,30);
		menuName.setFont(new Font(null, Font.BOLD,18));
		add(menuName);
		
		JTextField MN = new JTextField();
		MN.setBounds(130,50,270,30);
		// ��й�ȣ ����
		add(MN);
		
		JButton ok_btn = new JButton("Ȯ��");
		ok_btn.setBounds(30,110,370,60);
		add(ok_btn);
		
		ok_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = MN.getText();
				try {
					stmt = UserDAO.conn.createStatement();
					
					sql="DELETE FROM "+category+" WHERE name = ?";;
					UserDAO.pstmt=UserDAO.conn.prepareStatement(sql);
					
					UserDAO.pstmt.setString(1, name);
					
					int afectCnt = UserDAO.pstmt.executeUpdate();
					System.out.println(afectCnt); //���� ���� ������ �
					
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

package manager;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import data.member;
import data.Data;

public class signUpFrame extends JFrame{
	public signUpFrame() {
		setSize(450,500);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel nameText = new JLabel("이       름 : ");
		nameText.setBounds(30,100,110,30);
		nameText.setFont(new Font(null, Font.BOLD,18));
		add(nameText);
		
		JTextField name = new JTextField();
		name.setBounds(120,100,270,30);
		add(name);
		
		JLabel phoneNumText = new JLabel("휴대전화 : ");
		phoneNumText.setBounds(30,160,110,30);
		phoneNumText.setFont(new Font(null, Font.BOLD,18));
		add(phoneNumText);
		
		JTextField phoneNum = new JTextField();
		phoneNum.setBounds(120,160,270,30);
		add(phoneNum);
		
		JLabel idText = new JLabel("아 이 디  : ");
		idText.setBounds(30,220,110,30);
		idText.setFont(new Font(null, Font.BOLD,18));
		add(idText);
		
		JTextField id = new JTextField();
		id.setBounds(120,220,270,30);
		add(id);
		
		JLabel pwText = new JLabel("비밀번호 : ");
		pwText.setBounds(30,280,110,30);
		pwText.setFont(new Font(null, Font.BOLD,18));
		add(pwText);
		
		JTextField pw = new JTextField();
		pw.setBounds(120,280,270,30);
		add(pw);
		
		JButton signUpFin_btn = new JButton("완료");
		signUpFin_btn.setBounds(30,340,360,60);
		signUpFin_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//member m = new member(name.getText(),phoneNum.getText(),id.getText(),pw.getText());
				//data.Data.mList.add(m);
				dispose();
			}
		});
		
		
		
	}
}

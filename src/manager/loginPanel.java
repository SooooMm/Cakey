package manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import com.sun.glass.events.KeyEvent;
//import com.sun.prism.paint.Gradient;

//import sun.java2d.loops.DrawLine;

public class loginPanel extends JPanel{
	public loginPanel() {
		setBounds(250, 0, 450, 500);
		setPreferredSize(new Dimension(450,500));
		setBackground(Color.gray);
		setLayout(null);
		
		JLabel idText = new JLabel("��  ��  �� : ");
		idText.setBounds(30,100,110,30);
		idText.setFont(new Font(null, Font.PLAIN,18));
		add(idText);
		
		JTextField id = new JTextField();
		id.setBounds(120,100,270,30);
		// ���̵� ����
		add(id);
		
		JLabel pwText = new JLabel("��й�ȣ : ");
		pwText.setBounds(30,160,110,30);
		pwText.setFont(new Font(null, Font.PLAIN,18));
		add(pwText);
		
		JTextField pw = new JTextField();
		pw.setBounds(120,160,270,30);
		// ��й�ȣ ����
		add(pw);
		
		JButton search_btn = new JButton("id/pw ã��");
		search_btn.setBounds(240,220,150,30);
		add(search_btn);
		
		JButton signUp_btn = new JButton("ȸ������");
		signUp_btn.setBounds(30,330,175,60);
		
		signUp_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new signUpFrame();
				
			}
		});
		
		
		JButton login_btn = new JButton("�α���");
		login_btn.setBounds(210,330,175,60);
		
		
		add(signUp_btn);
		add(login_btn);
		
		
		
		
	}
	
}

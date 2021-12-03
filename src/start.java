import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import manager.loginFrame;
import menu.Program;
import menu.menuFrame;

public class start extends JFrame{
	JScrollPane scrollPane; //컴포넌트에 스크롤 기능을 제공함
	ImageIcon icon;
	
	
	public start() {
		super("Cakey");
		setSize(750,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		icon = new ImageIcon("../image/sheet_banila.jpg");//생성자에 ico호출 후, 이미지 경로 지정
		
        
		JPanel pn = new JPanel();
         
		add(pn);
		
		pn.setLayout(null);
		
		JButton start_btn= new JButton("시작"); //시작 버튼
		JButton manager = new JButton("관리자");
		
		manager.setBounds(640, 20, 100, 50);
		start_btn.setBounds(0, 815, 750, 175);
		pn.add(start_btn);
		pn.add(manager);
		
		
		start_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new menuFrame(); //메뉴 프레임 생성
				setVisible(false);
			
			}
		});
		
		
		
		manager.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new loginFrame();
				
			}
		});
	}
	
	
	
	public static void main(String[] args) {
		new start();
		
	    }
	}


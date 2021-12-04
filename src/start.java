import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.loginFrame;
import menu.menuFrame;
import user.UserDAO;

public class start extends JFrame{
	public start() {
		super("Cakey");
		setSize(750,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		
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
		new UserDAO();
	}
}

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
	public select_menu() {
		super("메뉴 주문");
		setSize(500,280);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel menu_name = new JLabel("TEXT");
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
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = (Integer.parseInt(menu_num.getText())) +1;
				menu_num.setText(Integer.toString(num));
				
			}
		});
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = (Integer.parseInt(menu_num.getText())) -1;
				if(num<0) num=0;
				menu_num.setText(Integer.toString(num));
				
			}
		});
		
		menu_num.setPreferredSize(new Dimension(150,75));
		menu_num.setHorizontalAlignment(JLabel.CENTER);
		menu_num.setBackground(Color.yellow);
		menu_num.setOpaque(true);
		
		add(plus);
		add(menu_num);
		add(minus);
		
		JButton ok_btn = new JButton("확인");
		ok_btn.setPreferredSize(new Dimension(460,75));
		add(ok_btn);
		
	}
}

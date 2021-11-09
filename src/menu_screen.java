import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.scene.layout.Pane;

class menu_click implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		new select_menu();
		
	}
}
public class menu_screen extends JFrame {
	public menu_screen() {
		super("메뉴 선택");
		setSize(750,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		JPanel menutext = new JPanel();
		menutext.setBounds(0, 0, 750, 100);
		menutext.setBackground(Color.cyan);
		add(menutext);
		
		
		JPanel frame = new JPanel();
		frame.setBackground(Color.gray);
		frame.setBounds(20, 120, 710, 510);
		frame.setLayout(null);
		add(frame);
		
		JPanel select_menu = new JPanel();
		select_menu.setBackground(Color.green);
		select_menu.setBounds(5, 5, 630, 500);
		select_menu.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		frame.add(select_menu);
		
		JButton[] menu_btn = new JButton[6];
		
		for(int i=0; i<6; i++) {
			menu_btn[i]= new JButton();
			menu_btn[i].setBackground(Color.orange);
			menu_btn[i].setPreferredSize(new Dimension(150,225));
			select_menu.add(menu_btn[i]);
		}
		
		for(int i=0; i<6; i++) {
			menu_btn[i].addActionListener(new menu_click());
		}
		
		String type[] = {"시트","생크림","속 재료", "겉 토핑","단","추가",};
		JPanel select_type = new JPanel();
		select_type.setLayout(new FlowLayout(FlowLayout.RIGHT,0,20));
		select_type.setBounds(650, 130, 100, 450);
		JButton[] type_btn = new JButton[6];
		
		for(int i=0; i<6; i++) {
			type_btn[i]= new JButton(type[i]);
			type_btn[i].setPreferredSize(new Dimension(100,50));
			select_type.add(type_btn[i]);
		}
		
		add(select_type);
		
		
		JPanel orderFrame = new JPanel();
		orderFrame.setBounds(120,750,100,200);
		orderFrame.setBackground(Color.pink);
		add(orderFrame);
		
		
	}
	public static void main(String[] args) {
		new menu_screen();
	}
}

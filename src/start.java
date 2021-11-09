import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		
		
		start_btn.setBounds(0, 815, 750, 175);
		pn.add(start_btn);
		
		
		start_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new menu_screen();
				setVisible(false);
			
			}
		});
	}

	public static void main(String[] args) {
		new start();
		
	}
}

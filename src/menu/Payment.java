package menu;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Payment extends JFrame{

	static JPanel page1 = new JPanel() {
		Image background = new ImageIcon(Program.class.getResource("../image/pay.jpg")).getImage();
		public void paint(Graphics g) { //그리는함수
			g.drawImage(background,0,0,null); //background를 그려줌
		}
	};

	public Payment() {

		setTitle("TEST");
		setSize(1280,720);//JFrame의 크기
		setResizable(false);//창의 크기를 변경하지 못하게 해준다
		setLocationRelativeTo(null);//창이 가운데 나오게 해준다
		setLayout(null);
		setVisible(true);
		page1.setLayout(null);
		page1.setBounds(0,0,500,600);
		add(page1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//그냥 닫으면 프로그램이 정상적으로 종료X
	}
}


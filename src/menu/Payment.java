package menu;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Payment extends JFrame{

	static JPanel page1 = new JPanel() {
		Image background = new ImageIcon(Program.class.getResource("../image/pay.jpg")).getImage();
		public void paint(Graphics g) { //�׸����Լ�
			g.drawImage(background,0,0,null); //background�� �׷���
		}
	};

	public Payment() {

		setTitle("TEST");
		setSize(1280,720);//JFrame�� ũ��
		setResizable(false);//â�� ũ�⸦ �������� ���ϰ� ���ش�
		setLocationRelativeTo(null);//â�� ��� ������ ���ش�
		setLayout(null);
		setVisible(true);
		page1.setLayout(null);
		page1.setBounds(0,0,500,600);
		add(page1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�׳� ������ ���α׷��� ���������� ����X
	}
}


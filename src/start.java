import java.awt.Color;
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
import javax.swing.colorchooser.ColorChooserComponentFactory;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;

import manager.loginFrame;
import menu.Program;
import menu.menuFrame;

import user.UserDAO;


public class start extends JFrame{
	JScrollPane scrollPane; //������Ʈ�� ��ũ�� ����� ������
	//ImageIcon icon;

	public start() {

		super("Cakey");
		setSize(750,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		//icon = new ImageIcon("../image/sheet_banila.jpg");//�����ڿ� icoȣ�� ��, �̹��� ��� ����

		//icon = new ImageIcon("../image/back.jpg");
		JPanel pn = new JPanel() {
			Image background = new ImageIcon(Program.class.getResource("../image/back.jpg")).getImage();
			public void paint(Graphics g) { //�׸����Լ�
				g.drawImage(background,0,0,null); //background�� �׷���
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		//setSize(1280,720);//JFrame�� ũ��
		setResizable(false);//â�� ũ�⸦ �������� ���ϰ� ���ش�
		setLocationRelativeTo(null);//â�� ��� ������ ���ش�
		setLayout(null);
		setVisible(true);
		pn.setLayout(null);
		pn.setBounds(0,0,500,600);
		add(pn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�׳� ������ ���α׷��� ���������� ����

		pn.setLayout(null);

		Color s = new Color(204,153,102);
		JButton start_btn= new JButton("����"); //���� ��ư
		start_btn.setText("~�ֹ��� �Ͻ÷��� ���⸦ �����ּ���~");
		start_btn.setBackground(s);
		start_btn.setFont(new FontUIResource("����",FontUIResource.BOLD,32));
		//start_btn.setBackground(ColorUIResource.WHITE);
		System.out.println("getText: " + start_btn.getText());

		Color m = new Color(211,211,211);
		JButton manager = new JButton("������");
		//manager.setBackground(ColorUIResource.GRAY);
		manager.setBackground(m);
		manager.setBounds(640, 20, 100, 50);
		start_btn.setBounds(0, 815, 750, 175);
		pn.add(start_btn);
		pn.add(manager);


		start_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new menuFrame(); //�޴� ������ ����
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


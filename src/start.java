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
	JScrollPane scrollPane; //컴포넌트에 스크롤 기능을 제공함
	//ImageIcon icon;

	public start() {

		super("Cakey");
		setSize(750,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		//icon = new ImageIcon("../image/sheet_banila.jpg");//생성자에 ico호출 후, 이미지 경로 지정

		//icon = new ImageIcon("../image/back.jpg");
		JPanel pn = new JPanel() {
			Image background = new ImageIcon(Program.class.getResource("../image/back.jpg")).getImage();
			public void paint(Graphics g) { //그리는함수
				g.drawImage(background,0,0,null); //background를 그려줌
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		//setSize(1280,720);//JFrame의 크기
		setResizable(false);//창의 크기를 변경하지 못하게 해준다
		setLocationRelativeTo(null);//창이 가운데 나오게 해준다
		setLayout(null);
		setVisible(true);
		pn.setLayout(null);
		pn.setBounds(0,0,500,600);
		add(pn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//그냥 닫으면 프로그램이 정상적으로 종료

		pn.setLayout(null);

		Color s = new Color(204,153,102);
		JButton start_btn= new JButton("시작"); //시작 버튼
		start_btn.setText("~주문을 하시려면 여기를 눌러주세요~");
		start_btn.setBackground(s);
		start_btn.setFont(new FontUIResource("돋움",FontUIResource.BOLD,32));
		//start_btn.setBackground(ColorUIResource.WHITE);
		System.out.println("getText: " + start_btn.getText());

		Color m = new Color(211,211,211);
		JButton manager = new JButton("관리자");
		//manager.setBackground(ColorUIResource.GRAY);
		manager.setBackground(m);
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


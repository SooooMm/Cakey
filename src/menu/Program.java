package menu;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;

public class Program extends JFrame {

	  static JPanel page1 = new JPanel() {
	    	Image background = new ImageIcon(Program.class.getResource("../image/sheet_banila.jpg")).getImage();
	    	public void paint(Graphics g) { //�׸����Լ�
	    		g.drawImage(background,0,0,null); //background�� �׷���
	    	}
	   };
	   
    public Program() {
    	
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
   
    
   
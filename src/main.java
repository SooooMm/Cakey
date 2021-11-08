import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main extends JFrame{
	public main() {
		super("Cakey");
		setSize(755,1000);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		main kiosk = new main();
		JPanel pn = new JPanel();
		kiosk.add(pn);
		GridBagLayout layout = new GridBagLayout();
		
		pn.setLayout(layout);
		
		JButton start_btn= new JButton();
		
		kiosk.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

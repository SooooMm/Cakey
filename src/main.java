import javax.swing.JFrame;

public class main extends JFrame{
	public main() {
		super("Cakey");
		setSize(750,1000);
		setVisible(true);
	}

	public static void main(String[] args) {
		main kiosk = new main();
		kiosk.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}

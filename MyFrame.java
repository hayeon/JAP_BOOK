import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame (String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyFrame("내 프레임", 300, 300);
	}

}

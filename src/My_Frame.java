import java.awt.BorderLayout;
import javax.swing.JFrame;

public class My_Frame extends JFrame {
	public My_Frame(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);	
		setLocationRelativeTo(this);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		
		//���̾ƿ�
		setLayout(new BorderLayout()); 		
		this.setVisible(true);	
	}

	public static void main(String[] args) {
		new My_Frame("�� ������", 300, 200);			
	}
}

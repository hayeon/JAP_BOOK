//���� �׸�2-1
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdministratorLogin extends JFrame {

	public AdministratorLogin() { // ������
		setTitle("������ �α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // ���ԵǴ� ������� ���ʿ��� ���������� ������Ʈ ��ġ
		setSize(950, 430);		
		setLocationRelativeTo(this);
		setResizable(false); // ������ â ������ ����

		// �̹��� ���̺� ����
		ImageIcon img = new ImageIcon("images/Intro.jpg");
		JLabel imageLabel = new JLabel(img);

		c.add(imageLabel);
		c.add(new JLabel("ID: ")); // ���̺� ������Ʈ ���� �� ����
		c.add(new JTextField(10)); // â�� �� ���� 10
		c.add(new JLabel("PW: "));
		c.add(new JTextField(10));
		c.add(new JButton("�α���")); // ��ư ������Ʈ ���� �� ����
		c.add(new JButton("����"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new AdministratorLogin();
	}
}

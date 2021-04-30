//�Ͽ� �׸�2-2
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookManger extends JFrame {

	public BookManger(String title, int width, int height) {

		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����

		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // ����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ�

		// ��ư ����
		c.add(new JButton("ȸ�� ���/����"));
		c.add(new JButton("���� ���/����"));
		c.add(new JButton("���� �뿩/�ݳ�"));
		c.add(new JButton("��� �뿩 ����"));
		c.add(new JButton("����"));

		// �̹��� �ֱ�
		ImageIcon img = new ImageIcon("images/Welcome.jpg"); // �̹����ε�
		JLabel imageLabel = new JLabel(img); // ���̺� ����
		c.add(imageLabel);

		setVisible(true); // ȭ�鿡 ������ ���
		setResizable(false); // ������ â ������ ����
	}

	public static void main(String[] args) {
		new BookManger("�������� ���α׷�", 1000, 700);
	}
}
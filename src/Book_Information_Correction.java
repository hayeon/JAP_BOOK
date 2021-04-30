//�μ� �׸�2-22
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Book_Information_Correction extends JFrame {
	public Book_Information_Correction(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���̾ƿ�
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();

		JLabel lbl = new JLabel("������ȣ : ");
		p1.add(lbl);
		
		JTextField tf = new JTextField(10);
		p1.add(tf);
		
		JButton btn = new JButton("�˻�");
		p1.add(btn);
		
		add(p1, BorderLayout.NORTH);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(6, 2));
		
		JLabel lblNumber = new JLabel("������ȣ");
		p2.add(lblNumber);
		
		JTextField tfNumber = new JTextField();
		p2.add(tfNumber);		
		
		JLabel lblTitle = new JLabel("����");
		p2.add(lblTitle);
		
		JTextField tfTitle = new JTextField();
		p2.add(tfTitle);
		
		JLabel lblAuthor = new JLabel("����");
		p2.add(lblAuthor);
		
		JTextField tfAuthor = new JTextField();
		p2.add(tfAuthor);
		
		JLabel lblPublisher = new JLabel("���ǻ�");
		p2.add(lblPublisher);
		
		JTextField tfPublisher = new JTextField();
		p2.add(tfPublisher);
		
		JLabel lblPrice = new JLabel("����");
		p2.add(lblPrice);
		
		JTextField tfPrice = new JTextField();
		p2.add(tfPrice);
		
		JLabel lblRental= new JLabel("�뿩����");
		p2.add(lblRental);
		
		JTextField tfRental = new JTextField();
		p2.add(tfRental);
		
		add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();
		
		JButton btnCorrection = new JButton("����");
		p3.add(btnCorrection);
		
		JButton btnReturn = new JButton("���ư���");
		p3.add(btnReturn);
		
		add(p3, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Book_Information_Correction("�������� ����", 350, 300);
	}
}

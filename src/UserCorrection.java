//�μ� �׸�2-10
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserCorrection extends JFrame {
	public UserCorrection(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���̾ƿ�
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();

		JLabel lbl = new JLabel("ȸ�� �ֹι�ȣ : ");
		p1.add(lbl);
		
		JTextField tf = new JTextField(10);
		p1.add(tf);
		
		JButton btn = new JButton("�˻�");
		p1.add(btn);
		
		add(p1, BorderLayout.NORTH);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4, 2));
		
		JLabel lbl_Name = new JLabel("�̸�");
		p2.add(lbl_Name);
		
		JTextField tf_Name = new JTextField();
		p2.add(tf_Name);		
		
		JLabel lbl_Code = new JLabel("�ֹι�ȣ");
		p2.add(lbl_Code);
		
		JTextField tf_Code = new JTextField();
		p2.add(tf_Code);
		
		JLabel lbl_Tel = new JLabel("����ó");
		p2.add(lbl_Tel);
		
		JTextField tf_Tel = new JTextField();
		p2.add(tf_Tel);
		
		JLabel lbl_Address = new JLabel("�ּ�");
		p2.add(lbl_Address);
		
		JTextField tf_Address = new JTextField();
		p2.add(tf_Address);
		
		
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
		new UserCorrection("ȸ������ ����", 300, 200);
	}
}

//�μ� �׸� 2-7
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserFind extends JFrame {
	public UserFind(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);	
		setLocationRelativeTo(this);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		
		//���̾ƿ�
		setLayout(new BorderLayout()); 
		JPanel p1_1 = new JPanel();
		p1_1.setBackground(Color.BLACK);
		add(p1_1, BorderLayout.NORTH);
		
		JLabel lbl1 = new JLabel("ȸ���˻�");
		lbl1.setForeground(Color.WHITE); //JLabel���� �� ����
		p1_1.add(lbl1);
		
		JPanel p2_1 = new JPanel();
		p2_1.setLayout(null);
		add(p2_1, BorderLayout.CENTER);
		
		JLabel lbl_userCode = new JLabel("ȸ���ֹι�ȣ:");
		lbl_userCode.setBounds(50, 10, 80, 20);		
		p2_1.add(lbl_userCode);
		
		JTextField tf_1 = new JTextField();
		tf_1.setBounds(130, 10, 110, 20);
		p2_1.add(tf_1);
		
		JPanel p3_1 = new JPanel();
		add(p3_1, BorderLayout.SOUTH);
		
		JButton btn_find = new JButton("�˻�");
		p3_1.add(btn_find);
		
		JButton btn_cancel = new JButton("���");
		p3_1.add(btn_cancel);
		this.setVisible(true);	
	}

	public static void main(String[] args) {
		new UserFind("ȸ���˻�", 300, 200);			
	}
}

//�μ� �׸� 2-16
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookRegistration extends JFrame {
	public BookRegistration(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);	
		setLocationRelativeTo(this);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		
		//���̾ƿ�
		setLayout(new BorderLayout()); 
		JPanel p1_1 = new JPanel();
		p1_1.setBackground(Color.BLACK);
		add(p1_1, BorderLayout.NORTH);
		
		JLabel lbl1 = new JLabel("�������");
		lbl1.setForeground(Color.WHITE); //JLabel���� �� ����
		p1_1.add(lbl1);
		
		JPanel p2_1 = new JPanel();
		p2_1.setLayout(new GridLayout(6, 2));
		add(p2_1, BorderLayout.CENTER);
		
		JLabel lbl_Number = new JLabel("������ȣ ");
		p2_1.add(lbl_Number);
		
		JTextField tf_Number = new JTextField();
		p2_1.add(tf_Number);
		
		JLabel lbl_Title = new JLabel("���� ");
		p2_1.add(lbl_Title);
		
		JTextField tf_Title = new JTextField();
		p2_1.add(tf_Title);
		
		JLabel lbl_Author = new JLabel("���� ");
		p2_1.add(lbl_Author);
		
		JTextField tf_Author = new JTextField();
		p2_1.add(tf_Author);
		
		JLabel lbl_Publisher = new JLabel("���ǻ�");
		p2_1.add(lbl_Publisher);
		
		JTextField tf_Publisher = new JTextField();
		p2_1.add(tf_Publisher);
		
		JLabel lbl_Price = new JLabel("����");
		p2_1.add(lbl_Price);
		
		JTextField tf_Price = new JTextField();
		p2_1.add(tf_Price);
		
		JLabel lbl_Rental = new JLabel("�뿩���� ");
		p2_1.add(lbl_Rental);
		
		JTextField tf_Rental = new JTextField();
		p2_1.add(tf_Rental);
		
		JPanel p3_1 = new JPanel();
		add(p3_1, BorderLayout.SOUTH);
		
		JButton btn_ok = new JButton("Ȯ��");
		p3_1.add(btn_ok);
		
		JButton btn_cancel = new JButton("���");
		p3_1.add(btn_cancel);
		this.setVisible(true);	
	}

	public static void main(String[] args) {
		new BookRegistration("�������", 250, 250);			
	}
}

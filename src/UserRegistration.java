//민솔 그림 2-4
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserRegistration extends JFrame {
	public UserRegistration(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);	
		setLocationRelativeTo(this);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		
		//레이아웃
		setLayout(new BorderLayout()); 
		JPanel p1_1 = new JPanel();
		p1_1.setBackground(Color.BLACK);
		add(p1_1, BorderLayout.NORTH);
		
		JLabel lbl1 = new JLabel("회원등록");
		lbl1.setForeground(Color.WHITE); //JLabel글자 색 변경
		p1_1.add(lbl1);
		
		JPanel p2_1 = new JPanel();
		p2_1.setLayout(new GridLayout(4, 2));
		add(p2_1, BorderLayout.CENTER);
		
		JLabel lbl_Name = new JLabel("이름 :");
		p2_1.add(lbl_Name);
		
		JTextField tf_Name = new JTextField();
		p2_1.add(tf_Name);
		
		JLabel lbl_Code = new JLabel("주민번호 :");
		p2_1.add(lbl_Code);
		
		JTextField tf_Code = new JTextField();
		p2_1.add(tf_Code);
		
		JLabel lbl_Tel = new JLabel("연락처 :");
		p2_1.add(lbl_Tel);
		
		JTextField tf_Tel = new JTextField();
		p2_1.add(tf_Tel);
		
		JLabel lbl_Address = new JLabel("주소 :");
		p2_1.add(lbl_Address);
		
		JTextField tf_Address = new JTextField();
		p2_1.add(tf_Address);
		
		JPanel p3_1 = new JPanel();
		add(p3_1, BorderLayout.SOUTH);
		
		JButton btn_ok = new JButton("확인");
		p3_1.add(btn_ok);
		
		JButton btn_cancel = new JButton("취소");
		p3_1.add(btn_cancel);
		this.setVisible(true);	
	}

	public static void main(String[] args) {
		new UserRegistration("회원등록", 250, 200);			
	}
}

//현서 그림2-1
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdministratorLogin extends JFrame {

	public AdministratorLogin() { // 생성자
		setTitle("관리자 로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // 삽입되는 순서대로 왼쪽에서 오른쪽으로 컴포넌트 배치
		setSize(950, 430);		
		setLocationRelativeTo(this);
		setResizable(false); // 프레임 창 사이즈 고정

		// 이미지 레이블 생성
		ImageIcon img = new ImageIcon("images/Intro.jpg");
		JLabel imageLabel = new JLabel(img);

		c.add(imageLabel);
		c.add(new JLabel("ID: ")); // 레이블 컴포넌트 생성 및 부착
		c.add(new JTextField(10)); // 창의 열 개수 10
		c.add(new JLabel("PW: "));
		c.add(new JTextField(10));
		c.add(new JButton("로그인")); // 버튼 컴포넌트 생성 및 부착
		c.add(new JButton("종료"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new AdministratorLogin();
	}
}

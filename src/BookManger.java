//하연 그림2-2
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료

		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치관리자 달기

		// 버튼 설정
		c.add(new JButton("회원 등록/삭제"));
		c.add(new JButton("도서 등록/삭제"));
		c.add(new JButton("도서 대여/반납"));
		c.add(new JButton("모든 대여 정보"));
		c.add(new JButton("종료"));

		// 이미지 넣기
		ImageIcon img = new ImageIcon("images/Welcome.jpg"); // 이미지로딩
		JLabel imageLabel = new JLabel(img); // 레이블 생성
		c.add(imageLabel);

		setVisible(true); // 화면에 프레임 출력
		setResizable(false); // 프레임 창 사이즈 고정
	}

	public static void main(String[] args) {
		new BookManger("도서관리 프로그램", 1000, 700);
	}
}
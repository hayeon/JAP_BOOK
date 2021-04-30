//하연 2-3
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Member_List extends JFrame {

	public Member_List(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		// 패널 선언
		JPanel JPa1 = new JPanel();
		JPanel JPa2 = new JPanel();
		JPanel JPa3 = new JPanel();
		// JPa1 구현 - 버튼 추가
		JPa1.setLayout(new FlowLayout()); // FlowLayout으로 레이아웃 설정
		JPa1.add(new JButton("새로고침"));
		JPa1.add(new JButton("등록"));
		JPa1.add(new JButton("조회"));
		JPa1.add(new JButton("수정"));
		JPa1.add(new JButton("삭제"));
		JPa1.add(new JButton("돌아가기"));

		// JPa2 구현 - 레이블과 테이블 추가
		
		//레이블
		JLabel lbl  = new JLabel("회원목록");
		JPa2.add(lbl);//레이블 패널에 붙이기
		//테이블
		String[] heading = new String[] { "이름", "주민번호", "전화번호", "주소" };
		Object[][] data = new Object[][] { { "이슬비", "001010", "010-4533-34324", "전북 김제시" },
				{ "이슬비", "001010", "010-4533-34324", "전북 김제시" }, { "이슬비", "001010", "010-4533-34324", "전북 김제시" },
				{ "이슬비", "001010", "010-4533-34324", "전북 김제시" }, { "이슬비", "001010", "010-4533-34324", "전북 김제시" },
				{ "이슬비", "001010", "010-4533-34324", "전북 김제시" }, { "이슬비", "001010", "010-4533-34324", "전북 김제시" },
				{ "이슬비", "001010", "010-4533-34324", "전북 김제시" }, { "이슬비", "001010", "010-4533-34324", "전북 김제시" },
				{ "이슬비", "001010", "010-4533-34324", "전북 김제시" }, { "이슬비", "001010", "010-4533-34324", "전북 김제시" },
				{ "이슬비", "001010", "010-4533-34324", "전북 김제시" }, { "이슬비", "001010", "010-4533-34324", "전북 김제시" },
				{ "이슬비", "001010", "010-4533-34324", "전북 김제시" }, { "이슬비", "001010", "010-4533-34324", "전북 김제시" } 
				};
		JTable table = new JTable(data, heading);
		table.setPreferredScrollableViewportSize(new Dimension(440, 200));
		// 테이블 사이즈 및 스크롤이 가능하게 함

		table.setFillsViewportHeight(true); // 테이블이 보이게 함
		JPa2.add(new JScrollPane(table)); // 스크롤과 테이블을 JPa2에 붙임

		//패널 붙이고 BorderLayout으로 위치설정
		
		add(JPa1, BorderLayout.NORTH);
		add(JPa2, BorderLayout.CENTER);

		setVisible(true);
		setResizable(false);
	}


	public static void main(String[] args) {
		new Member_List("회원명단", 480, 500);
	}

}
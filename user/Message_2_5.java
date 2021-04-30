//민솔 그림2-5
package user;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Message_2_5 extends JFrame {
	public Message_2_5(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 레이아웃
		String message_title = "메시지";
		JOptionPane.showMessageDialog( // 메시지창 출력
				this, "중복된 아이디가 있습니다.", message_title, JOptionPane.INFORMATION_MESSAGE);
		// 메시지창 중에서알림창으로 설정

		// this.setVisible(true);
	}

	public static void main(String[] args) {
		new Message_2_5("메시지", 300, 150);
	}
}


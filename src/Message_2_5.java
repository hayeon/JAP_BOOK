//�μ� �׸�2-5
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Message_2_5 extends JFrame {
	public Message_2_5(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���̾ƿ�
		String message_title = "�޽���";
		JOptionPane.showMessageDialog( // �޽���â ���
				this, "�ߺ��� ���̵� �ֽ��ϴ�.", message_title, JOptionPane.INFORMATION_MESSAGE);
		// �޽���â �߿����˸�â���� ����

		// this.setVisible(true);
	}

	public static void main(String[] args) {
		new Message_2_5("�޽���", 300, 150);
	}
}

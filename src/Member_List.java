//�Ͽ� 2-3
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
		
		// �г� ����
		JPanel JPa1 = new JPanel();
		JPanel JPa2 = new JPanel();
		JPanel JPa3 = new JPanel();
		// JPa1 ���� - ��ư �߰�
		JPa1.setLayout(new FlowLayout()); // FlowLayout���� ���̾ƿ� ����
		JPa1.add(new JButton("���ΰ�ħ"));
		JPa1.add(new JButton("���"));
		JPa1.add(new JButton("��ȸ"));
		JPa1.add(new JButton("����"));
		JPa1.add(new JButton("����"));
		JPa1.add(new JButton("���ư���"));

		// JPa2 ���� - ���̺�� ���̺� �߰�
		
		//���̺�
		JLabel lbl  = new JLabel("ȸ�����");
		JPa2.add(lbl);//���̺� �гο� ���̱�
		//���̺�
		String[] heading = new String[] { "�̸�", "�ֹι�ȣ", "��ȭ��ȣ", "�ּ�" };
		Object[][] data = new Object[][] { { "�̽���", "001010", "010-4533-34324", "���� ������" },
				{ "�̽���", "001010", "010-4533-34324", "���� ������" }, { "�̽���", "001010", "010-4533-34324", "���� ������" },
				{ "�̽���", "001010", "010-4533-34324", "���� ������" }, { "�̽���", "001010", "010-4533-34324", "���� ������" },
				{ "�̽���", "001010", "010-4533-34324", "���� ������" }, { "�̽���", "001010", "010-4533-34324", "���� ������" },
				{ "�̽���", "001010", "010-4533-34324", "���� ������" }, { "�̽���", "001010", "010-4533-34324", "���� ������" },
				{ "�̽���", "001010", "010-4533-34324", "���� ������" }, { "�̽���", "001010", "010-4533-34324", "���� ������" },
				{ "�̽���", "001010", "010-4533-34324", "���� ������" }, { "�̽���", "001010", "010-4533-34324", "���� ������" },
				{ "�̽���", "001010", "010-4533-34324", "���� ������" }, { "�̽���", "001010", "010-4533-34324", "���� ������" } 
				};
		JTable table = new JTable(data, heading);
		table.setPreferredScrollableViewportSize(new Dimension(440, 200));
		// ���̺� ������ �� ��ũ���� �����ϰ� ��

		table.setFillsViewportHeight(true); // ���̺��� ���̰� ��
		JPa2.add(new JScrollPane(table)); // ��ũ�Ѱ� ���̺��� JPa2�� ����

		//�г� ���̰� BorderLayout���� ��ġ����
		
		add(JPa1, BorderLayout.NORTH);
		add(JPa2, BorderLayout.CENTER);

		setVisible(true);
		setResizable(false);
	}


	public static void main(String[] args) {
		new Member_List("ȸ�����", 480, 500);
	}

}
//���� �׸� 2-29
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Rental_Information extends JFrame {

    public Rental_Information() {
        setTitle("�뿩����");
        setSize(470, 520);
        setLocationRelativeTo(null);
      //��� �� ��� ������ü�� �ȶ��
        setLayout(new FlowLayout());        

        JPanel panel1 = new JPanel(); //�г� ����
        JPanel panel2 = new JPanel();

        JButton bnt = new JButton("���ư���");
        panel1.add(bnt);

        String[][] rec2 = { { "1", "��ȫ��", "010-7175-...", "��������", "A012", "2015-07-12" },
                { "2", "�����", "010-0689-...", "�ؾ����", "A004", "2015-07-12" },
                { "3", "�����", "010-0689-...", "����", "A017", "2015-07-12" },
                { "4", "��ȿ��", "010-4238-...", "����", "A023", "2015-07-12" } };
        String[] title2 = { "�뿩��ȣ", "ȸ���̸�", "ȸ����ȭ", "�����̸�", "������ȣ", "��¥" };
        JTable table = new JTable(rec2, title2);
        panel2.add(new JScrollPane(table));
        add(panel1);
        add(panel2);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Rental_Information();
    }
}
//���� �׸� 2-27
import java.awt.*;
import javax.swing.*;

public class BorrowReturn extends JFrame {
    BorrowReturn() {
        setTitle("�뿩/�ݳ�");
        Container ctn = getContentPane();

        ctn.setLayout(new FlowLayout());
        setSize(470, 560);        

        JPanel panel1 = new JPanel(); // �г� 1,2,3 ����
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JLabel lbl1 = new JLabel("ȸ���ֹι�ȣ"); // label 1,2,3 ������Ʈ ����
        JLabel lbl2 = new JLabel("������ȣ");
        JLabel lbl3 = new JLabel("����");
        JButton btn1 = new JButton("�뿩"); // button 1,2,3 ������Ʈ ����
        JButton btn2 = new JButton("�ݳ�");
        JButton btn3 = new JButton("���");
        JTextField tf = new JTextField(10);
        JTextField tf2 = new JTextField(10);
        JTextField tf3 = new JTextField(10);// TextField ������Ʈ ����

        panel1.add(lbl1); // �гο� ������Ʈ ���̱�
        panel1.add(tf);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel2.add(lbl2);
        panel2.add(tf2);
        panel2.add(lbl3);
        panel2.add(tf3);

        // JTable �� �Է�
        String[][] rec = { { "1", "��ȫ��", "010-7175-....", "��������", "A012", "2015-07-12" } };
        // JTable ��(�׸�) �Է�
        String[] title = { "�뿩��ȣ", "ȸ���̸�", "ȸ����ȭ", "�����̸�", "������ȣ", "��¥" };
        JTable table = new JTable(rec, title);
        panel3.add(new JScrollPane(table)); // JTable ������Ʈ�� ��ũ�� ��� ����
        // JFrame�� �г� ���̱�
        ctn.add(panel1);
        ctn.add(panel2);
        ctn.add(panel3);
        setLocationRelativeTo(null);	

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorrowReturn();
    }
}
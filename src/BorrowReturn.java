//현서 그림 2-27
import java.awt.*;
import javax.swing.*;

public class BorrowReturn extends JFrame {
    BorrowReturn() {
        setTitle("대여/반납");
        Container ctn = getContentPane();

        ctn.setLayout(new FlowLayout());
        setSize(470, 560);        

        JPanel panel1 = new JPanel(); // 패녈 1,2,3 선언
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JLabel lbl1 = new JLabel("회원주민번호"); // label 1,2,3 컴포넌트 선언
        JLabel lbl2 = new JLabel("도서번호");
        JLabel lbl3 = new JLabel("제목");
        JButton btn1 = new JButton("대여"); // button 1,2,3 컴포넌트 선언
        JButton btn2 = new JButton("반납");
        JButton btn3 = new JButton("취소");
        JTextField tf = new JTextField(10);
        JTextField tf2 = new JTextField(10);
        JTextField tf3 = new JTextField(10);// TextField 컴포넌트 선언

        panel1.add(lbl1); // 패널에 컴포넌트 붙이기
        panel1.add(tf);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel2.add(lbl2);
        panel2.add(tf2);
        panel2.add(lbl3);
        panel2.add(tf3);

        // JTable 열 입력
        String[][] rec = { { "1", "김홍식", "010-7175-....", "개구쟁이", "A012", "2015-07-12" } };
        // JTable 행(항목) 입력
        String[] title = { "대여번호", "회원이름", "회원전화", "도서이름", "도서번호", "날짜" };
        JTable table = new JTable(rec, title);
        panel3.add(new JScrollPane(table)); // JTable 컴포넌트에 스크롤 기능 제공
        // JFrame에 패널 붙이기
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
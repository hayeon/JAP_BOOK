//현서 그림 2-29
package rental;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Rental_Information extends JFrame {

  public Rental_Information() {
      setTitle("대여정보");
      setSize(470, 520);
      setLocationRelativeTo(null);
    //얘는 왜 가운데 맞춤자체가 안뜰까
      setLayout(new FlowLayout());        

      JPanel panel1 = new JPanel(); //패널 생성
      JPanel panel2 = new JPanel();

      JButton bnt = new JButton("돌아가기");
      panel1.add(bnt);

      String[][] rec2 = { { "1", "김홍식", "010-7175-...", "개구쟁이", "A012", "2015-07-12" },
              { "2", "김다은", "010-0689-...", "붕어빵가족", "A004", "2015-07-12" },
              { "3", "김다은", "010-0689-...", "씨름", "A017", "2015-07-12" },
              { "4", "한효선", "010-4238-...", "예의", "A023", "2015-07-12" } };
      String[] title2 = { "대여번호", "회원이름", "회원전화", "도서이름", "도서번호", "날짜" };
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
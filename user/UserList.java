package user;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class UserList extends JFrame implements ActionListener {
   private JPanel JPa1, JPa2;
   private JButton btn_f5, btn_registration, btn_inquiry, btn_modify, btn_remove, brn_return;
   private String name, min, tel, address;
   private Vector<String> data;
   private Vector<String> data_2;
   private JTable table;
   private DefaultTableModel model;
   private String[] tmp;

   public UserList(String title, int width, int height) {
      this.setTitle(title);
      setSize(width, height);
      setLocationRelativeTo(this);
      // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      dispose();

      setP1();
      setP2();

      setVisible(true);
      // setResizable(false);
   }

   private void setP1() {
      // JPa1
      JPa1 = new JPanel();
      add(JPa1, BorderLayout.NORTH);

      // JPa1 구현 - 버튼 추가
      JPa1.setLayout(new FlowLayout()); // FlowLayout으로 레이아웃 설정
      btn_f5 = new JButton("새로고침");
      JPa1.add(btn_f5);

      btn_registration = new JButton("등록");
      btn_registration.addActionListener(this);
      JPa1.add(btn_registration);

      btn_inquiry = new JButton("조회");
      btn_inquiry.addActionListener(this);
      JPa1.add(btn_inquiry);

      btn_modify = new JButton("수정");
      btn_modify.addActionListener(this);
      JPa1.add(btn_modify);

      btn_remove = new JButton("삭제");
      JPa1.add(btn_remove);

      brn_return = new JButton("돌아가기");
      JPa1.add(brn_return);
   }

   private void setP2() {
      // JPa2
      JPa2 = new JPanel();
      JPa2.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "회원목록")); // 패널에 라인 생성
      // JPa2.setLayout(new FlowLayout(FlowLayout.LEFT)); // JPa2왼쪽 정렬
      JPa2.setLayout(new BorderLayout());
      add(JPa2, BorderLayout.CENTER);

      Vector<String> column1 = new Vector<String>();

      column1.addElement("이름");
      column1.addElement("주민번호");
      column1.addElement("전화번호");
      column1.addElement("주소");

      // 추가한 컬럼명으로 모델 생성하고 인자로 넣어줌

      model = new DefaultTableModel(column1, 0) { // 테이블의 데이터 변경하려면 모델 사용

         public boolean isCellEditable(int r, int c) {
            return false;
         }

      };
      // model = new DefaultTableModel(column1, 0);
      // DefaultTableModel model = new DefaultTableModel(column1, 0);
      // 0은 비어있는 행을 추가하느냐 마느냐. 1로하면 아무것도 작성되지않은 행이 1개추가되서 테이블생성 필요없어서 0으로함

      data = new Vector<String>();
   //   data_2 = new Vector<String>();

      RowSorter<TableModel> sorter = new TableRowSorter<TableModel>();
      table.setRowSorter(sorter);
      try {
         File file = new File("txt/member.txt"); // 경로에서 파일 객체만들기
         FileReader fileReader = new FileReader(file); // 파일읽어서 파일리더객체 만들기

         BufferedReader bufferedReader = new BufferedReader(fileReader); // 버퍼로 만들기 입출력할떄 효율적
         // 기존 크기의 버퍼로 버퍼링된 문자열 입력 스트림 생성

         String line = "";
         while ((line = bufferedReader.readLine()) != null) {
            data.add(line); // 한줄씩 읽어온 line을 벡터의 data에 저장
            System.out.println(line);
         }

         for (int i = 0; i < data.size(); i++) { // 데이터의 크기만큼 반복
            tmp = data.get(i).split(","); // 벡터의 get()으로 요소 객체 얻음

//            for(int j = 0; j < tmp.length; j++) {
//               
//               data_2.add(tmp[j]);
//               System.out.println(data_2);
//            }

            model.addRow(tmp);
            System.out.println(model);
         }

         bufferedReader.close();
         //
      } catch (FileNotFoundException e) {
         // 파일 입출력 실행 예외 : 파일의 경로명이 틀리거나, 파일을 열 수 없는 경우
         e.printStackTrace();
      } catch (IOException e) {
         // 파일 읽기, 쓰기, 닫기 실행 예외 : 디스크 오작동, 파일이 깨진 경우
         e.printStackTrace();
      }

      table = new JTable(model); // 테이터 변경 시 테이블에 직접 접근하지 않고 변경

      	
      // 스크롤팬을 사용하지 않으면 컬럼명을 볼 수 없음
      JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      JPa2.add(sp);

   }

   public static void main(String[] args) {
      new UserList("회원명단", 480, 500);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      if (obj == btn_registration) {
         new UserRegistration("회원등록", 250, 200);
      } else if (obj == btn_inquiry) {
         new UserFind("회원검색", 300, 200);
      } else if (obj == btn_modify) {
         new UserCorrection("회원정보 수정", 300, 200);
      }
   }
}
//민솔 그림2-1 로그인 창
package login;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	private JPanel p1;
	private JPanel p2;
	private JButton btn_Login;
	private JLabel btn_ID;
	private JLabel lbl_PW;
	private JTextField tf_ID;
	private JTextField tf_PW;

	public Login(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setResizable(false);
		
		setmain();
		
		setVisible(true);
	}

	private void setmain() {
		//첫 번째 패널
		p1 = new JPanel();
		add(p1, BorderLayout.CENTER);
		
		btn_ID = new JLabel("ID :  ");
		p1.add(btn_ID);
		
		tf_ID = new JTextField(15);
		p1.add(tf_ID);
		
		lbl_PW = new JLabel("PW :");
		p1.add(lbl_PW);
		
		tf_PW = new JTextField(15);
		p1.add(tf_PW);
		
		//두 번째 패널
		p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		add(p2, BorderLayout.SOUTH);		
		
		btn_Login = new JButton("Login");
		btn_Login.addActionListener(this);
		p2.add(btn_Login);
	}

	public static void main(String[] args) {
		new Login("로그인", 230, 120);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btn_Login) {
			
		}
		
	}
}

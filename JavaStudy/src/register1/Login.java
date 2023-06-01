package register1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	Register g = new Register();
	
	JLabel loginlabel 			= new JLabel("로그인");
	JLabel loginlabelid 		= new JLabel("ID");
	JLabel loginlabelpass 		= new JLabel("PassWord");
	
	JTextField loginid 			= new JTextField("아이디를 입력하세요");
	JPasswordField loginpass 	= new JPasswordField("비밀번호를 입력하세요");
	
	JButton log 				= new JButton("로그인");
	JButton res 				= new JButton("회원가입");
	
	public Login() {
		
		loginlabel.setBounds(10, 10, 450, 10);
		loginlabel.setHorizontalAlignment(JLabel.LEFT);
		
		loginlabelid.setBounds(15, 40, 1000, 30);
		loginlabelpass.setBounds(15, 95, 1000, 30);
		
		loginid.setBounds(15, 70, 150, 30);
		loginpass.setBounds(15, 120, 150, 30);
		
		log.setBounds(15, 170, 90, 30);
		res.setBounds(120, 170, 90, 30);
		
		res.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				g.setVisible(true);
				
			}
		});
		
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});

		this.add(loginlabel);
		this.add(loginlabelid);
		this.add(loginlabelpass);
		
		this.add(loginlabel);
		this.add(loginid);
		this.add(loginpass);
		
		this.add(log);
		this.add(res);
		
		setTitle("login");
		setLocationRelativeTo(null);
		setLayout(null);
		setLocation(100, 100);
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public void open() {
		setVisible(true);
	}
}




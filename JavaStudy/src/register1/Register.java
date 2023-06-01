package register1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame {

	// 라벨단
	JLabel label = new JLabel("회원가입");
	JLabel labelid = new JLabel("ID (15자 이내)");
	JLabel labelpass = new JLabel("PassWord (15자 이내)");
	JLabel labelname = new JLabel("이름");
	JLabel labelage = new JLabel("나이");
	JLabel labeljumin = new JLabel("주민등록번호 앞자리를 입력하세요");
	JLabel labelInterests = new JLabel("관심사를 선택");
	JLabel labelemailagree = new JLabel("이메일 수신 동의");
	JLabel labelemail = new JLabel("이메일을 입력하세요");
	JLabel labelpnumber = new JLabel("핸드폰번호를 입력하세요 (하이픈제외)");

	// 컴포넌트 단
	JTextField id = new JTextField("아이디를 입력하세요");
	JPasswordField pass = new JPasswordField("비밀번호를 입력하세요");
	JTextField name = new JTextField("이름");
	JTextField age = new JTextField("나이");
	JTextField jumin = new JTextField("주민번호 앞자리");
	JComboBox Interests = new JComboBox();
	JCheckBox emailagree = new JCheckBox("yes");
	JCheckBox emaildisagree = new JCheckBox("no");
	JTextField email = new JTextField("이메일을 입력하세요");
	JTextField pnumber = new JTextField("핸드폰번호 입력");

	// 버튼
	JButton completion = new JButton("회원가입");

	public Register() {

		String[] Interest = { "일자리&고용", "생활경제", "부동산", "생활문화", "교통", "의료&보건", "안전&환경", "외교&안보", "노후안정&복지" };

		Interests = new JComboBox(Interest);

		label.setBounds(10, 10, 450, 10);
		label.setHorizontalAlignment(JLabel.CENTER);
		labelid.setBounds(15, 40, 1000, 30);
		labelpass.setBounds(15, 95, 1000, 30);
		labelname.setBounds(15, 143, 1000, 30);
		labelage.setBounds(15, 194, 1000, 30);
		labeljumin.setBounds(15, 244, 1000, 30);
		labelInterests.setBounds(15, 294, 1000, 30);
		labelemailagree.setBounds(15, 344, 1000, 30);
		labelemail.setBounds(15, 394, 1000, 30);
		labelpnumber.setBounds(15, 450, 1000, 30);

		id.setBounds(15, 70, 150, 30);
		pass.setBounds(15, 120, 150, 30);
		name.setBounds(15, 170, 150, 30);
		age.setBounds(15, 220, 150, 30);
		jumin.setBounds(15, 270, 150, 30);
		Interests.setBounds(15, 320, 100, 30);
		emailagree.setBounds(15, 370, 47, 30);
		emaildisagree.setBounds(60, 370, 50, 30);
		email.setBounds(15, 420, 150, 30);
		pnumber.setBounds(15, 480, 150, 30);
		completion.setBounds(15, 540, 150, 30);
		setLocationRelativeTo(null);

		completion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String userId = new String(id.getText());
				String userPass = new String(pass.getPassword());
				
				RegistervalidationId.CheckId(userId);
				Registervalidation.Registervalidation(userPass);
			
				}
			
		});

		// 라벨
		this.add(label);
		this.add(labelid);
		this.add(labelpass);
		this.add(labelname);
		this.add(labelage);
		this.add(labeljumin);
		this.add(labelInterests);
		this.add(labelemailagree);
		this.add(labelemail);
		this.add(labelpnumber);

		// 컴포넌트
		this.add(id);
		this.add(pass);
		this.add(name);
		this.add(age);
		this.add(jumin);
		this.add(Interests);
		this.add(emailagree);
		this.add(emaildisagree);
		this.add(email);
		this.add(pnumber);
		this.add(completion);

		// GUI
		setTitle("Register");
		setLocationRelativeTo(null);
		setLayout(null);
		setLocation(100, 100);
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
		
	

}

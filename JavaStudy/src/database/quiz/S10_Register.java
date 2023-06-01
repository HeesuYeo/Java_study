/*
 	회원가입을 받을 수 있는 창을 만들고
 	
 	회원의 다양한 정보를 입력받아 정보를 DB에 저장해보세요

	(1) 아이디,이름,나이,주민번호 맨 앞 자리까지, 관심분야, SNS수신 동의 여부
		이메일, 핸드폰 번호
	
	(2) 입력한 내용에 대한 유효성 검사를 구현 할 것

	(3) 비밀번호는 암호화 하여 DB에 저장할 것 (암호화는 구글링 가능)
	
	(4) 처음으로는 로그인 창이 등장하고 회원가입 버튼을 누르면 회원가입 창이 나올 것
	
	(5) 로그인 기능을 구현하여 ID, PASSWORD가 일치하면 로그인 성공 이라고 메세지를 띄워 줄 것

*/

package database.quiz;

import javax.swing.JFrame;
import javax.swing.JTextField;

import register1.Login;
import register1.Register;

public class S10_Register extends JFrame {
	
	public static void main(String[] args) {
		 
		Login l = new  Login();
		l.open();
		
		
	}
	 
	 

}

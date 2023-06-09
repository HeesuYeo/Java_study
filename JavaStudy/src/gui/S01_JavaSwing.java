/*
 		# Java Swing
 		
 			- 자바로 GUI 프로그램을 만들기 위한 API
 			
		# Container
		
			- 위에 여러 컴포넌트들을 배치 할 수 있는 판
			
			- JFrame, JPanel, JDialog ... 등 다양한 클래스가
			  컨테이너 역할을 할 수 있다 	
		
		# Component
 		
 			- 컨테이너 위에 배치 할 수 있는 다양한 기능을 가진것들

 			- 버튼, 표, 슬라이더 ... 등이있다
 
*/

package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {

	public static void main(String[] args) {
		
		//새 프레임 인스턴스 생성
		JFrame frame = new JFrame();
		
		//버튼 인스턴스 생성
		JButton btn1 = new JButton("OK");
		JButton btn2 = new JButton("NO");
	
		//btn1의 위치와 크기조정
		btn1.setLocation(10, 10);
		btn1.setSize(100, 50);
		
		//btn2의 위치와 크기조정
		btn2.setLocation(200, 13);
		btn2.setSize(100, 50);
		
		//설정한 버튼을 프레임에 붙인다
		frame.add(btn1);
		frame.add(btn2);
		
		// 프레임의 제목을 지정하는 메서드
		frame.setTitle("My Gui Programming");
		//프레임의 레이아웃을 지정하는 메서드
		frame.setLayout(null);
		//프래임을 보이도록 설정하는 메서드(기본적으로 보이지 않음)
		frame.setVisible(true);
		//프래임을 크기를 설정하는 메서드
		frame.setSize(500, 500);
		//프레임의 위치를 설정하는 메서드
		frame.setLocation(100, 200);
		
/*
		 프레임의 x 버튼을 누렀을 때의 동작을 설정하는 메서드
		 
		 EXIT_ON_CLOSE 			: X버튼을 누를시 프로그램 종료
		 DO_NOTHING_ON_CLOSE 	: 아무것도안함
		 HIDE_ON_CLOSE			: 창 숨기기
		 DISPOSE_ON_CLOSE 		: 창 닫고 프로그램 종료는 안하기
		 
		 ※ 직접 문서를 보고 어떤 메서드들이 있는지 파악할 줄 알아야 한다
		 
 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_JButton extends JFrame {
	
	JButton mainBtn = new JButton("Main");
	JButton subBtn = new JButton("Sub Button");
	
	public S03_JButton() { 		//JFrame의 생성자
		
		super("JButton 테스트"); 
		
		add(mainBtn, "Center");
		add(subBtn, "South");
		
		//버튼 텍스트 설정
		mainBtn.setText("Hello!");
		
		//글꼴설정
		mainBtn.setFont(new Font("궁서체", Font.ITALIC, 55));
		subBtn.setFont(new Font("굴림체", Font.PLAIN, 30));		 
		
		//버튼 색변겅
		subBtn.setForeground(Color.RED);
		
		//버튼의 배경색 변겅
		subBtn.setBackground(new Color(31, 236, 255));
		
		//버튼의 이벤트 설정 (버튼에 액션 리스너 추가)
		subBtn.addActionListener(new ActionListener() {
			
			int num = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼이 눌렸을 때의 동작을 설정 할 수 있음
				System.out.println("Hello, Button Event!!");
				mainBtn.setText(num++ + "번째 눌림");
			}
		});
		
		setVisible(true);
		setBounds(100, 100, 500, 500);  
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
			    
   

	public static void main(String[] args) {
      
		new S03_JButton(); // extends JFrame 로 새로운 방식, 여러 개 인스턴스 찍기 가능
   }

}

/*
			Attribute : 속성
		 
			family : 글꼴
			weight : 글씨 무게 (굵기)
			width  : 너비
			posture  : ?
			size : 크기
			transform : 방향 회전
			superscript : ?
			char_replacement : ?
			foreground : 글씨색
			background : 배경색
			underline : 밑줄
			strikethrough : ?
			run_direction : ?
			bidi_embedding : ?
			justification : 정렬
			input method highlight : ?
			input method underline : ?
			swap_color : ?
			numeric_shaping : ?
			kerning : ?
			ligatures : ?
			tracking : ?       // 다 알 순 없고 필요할 때 구글링
 */
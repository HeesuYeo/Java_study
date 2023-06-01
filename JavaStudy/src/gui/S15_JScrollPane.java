/*
 	JScrollPane에 붙이는 컴포넌트는 스크롤이 가능해진다
 	
 	
 */
package gui;

import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Scrollable;

public class S15_JScrollPane {

	private static final int EXIT_ON_CLOSE = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame("SCrollpane Test"); 
		
		f.setLayout(new GridLayout(2, 2));
		
		for (int i = 0; i < 3; i++) {
			f.add(new JButton("" + i));
		}
		//panel : 다른 컴포넌트들을 붙일 수 있는 컴포넌트 (레이아웃 설정가능)
		//pane : 다른 컴포넌트들을 붙일 수 있는 컴포넌트 (특이한 기능 있음) 
		JTextArea textarea = new JTextArea();
		JScrollPane scrollablePane =new JScrollPane();
		
		//JScrollPane에 컴포넌트 설정할 때는 add대신 setViewportView() 메서드를 사용한다 (또는 생성자) 
		scrollablePane.setViewportView(textarea);

		f.add(scrollablePane);
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
	}
}

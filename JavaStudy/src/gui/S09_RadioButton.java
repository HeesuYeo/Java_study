package gui;
//여러가지 옵션 중 하나를 선택 할 때 사용하는 컴포넌트

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class S09_RadioButton {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("RadioButton Tutorial");
		
		JRadioButton maleBtn = new JRadioButton();
		JRadioButton femaleBtn = new JRadioButton();
		
		JButton btn = new JButton("회원가입");
		
		maleBtn.setText("A) male");
		femaleBtn.setText("B) female");
		
		
		maleBtn.setBounds(50, 50, 150, 30);
		femaleBtn.setBounds(50, 100, 150, 30);
		btn.setBounds(50, 150, 150, 30);
		
		//	doClick(); : 해당 컴포넌트를 클릭하는 효과
		//  maleBtn.doClick();
			
		maleBtn.setSelected(true);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(femaleBtn.isSelected() ?
						"You are Female" : "You are Male");
				
			}
		});
		
		//버튼 그룹을 설정하면 여러 버튼 중 하나만 선택 할 수 있게 된다
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(maleBtn);
		buttonGroup.add(femaleBtn);
		
		f.add(maleBtn);
		f.add(femaleBtn);
		f.add(btn);
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

/*
 		컨테이너 위에 붙일 수 있는 컨테이너
 		레이아웃 위에 붙여 다른 레이아웃을 사용 할 수 있다
 */
package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class S12_JPanel {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("My JPanel Test");
		
		BorderLayout outLayout = new BorderLayout();
		GridLayout eastLayout = new GridLayout(10, 2);
		BorderLayout southLayout = new BorderLayout();
		
		f.setLayout(outLayout);
		
		JPanel eastPanel = new JPanel(eastLayout);
		JPanel southPanel = new JPanel(southLayout);
		
		for (int i = 0; i < 20; i++) {
			eastPanel.add(new JButton("" + i));
		}
		
		southPanel.add(new JTextArea() {
			{setRows(10);}
			
		}, "Center");
		southPanel.add(new JTextField("Input message here..."), "South");
		
		f.add(new JButton("component"), "Center");
		f.add(new JButton("component"), "South");
		f.add(eastPanel, "East");
		f.add(new JButton("component"), "North");
		f.add(new JButton("compooooooooooooooonent"), "West");
	
		f.setLocation(100, 100);
		f.setSize(500, 500);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

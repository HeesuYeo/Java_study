/*
 	JPopupMenu 에 JMenuItem을 붙여서 사용
*/
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;

public class S20_JPopupMenu {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Popup Menu!!"); 
		
		JPopupMenu popup = new JPopupMenu("popup");
		
		//JPopupMenu에 JMenu로 서브등록
		JMenu src = new JMenu("src");
		
		//보기 좋게 구분선 추가해주기(JSeparator)
		JSeparator sep = new JSeparator();
		
		src.add(new JMenuItem("Generate Getters"));
		src.add(new JMenuItem("Generate Setters"));
		
		
		JMenuItem[] items = new JMenuItem[5];
	
		for (int i  = 0; i < items.length; ++i) {
			items[i] = new JMenuItem("Popup Item " + (i + 1));
			popup.add(items[i]);
		}
		
		popup.add(sep);
		popup.add(src);
		
		f.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//메뉴가 Alt + 우클릭으로 발동하게 만들기
				if (e.isAltDown() && e.getButton() == 3) {
					
					popup.show(f, e.getX(), e.getY());
				}
			}
		});

		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
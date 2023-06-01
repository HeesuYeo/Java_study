/*
 		(1) image 폴더에 있는 모든 이미지들을 GridLayout로 보여주기
 		
 		(2) 해당 이미지를 클릭하면 확대된 이미지가 새 창에 나오기
 */

package gui.quiz;

import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.View;

import gui.quiz.imagegallery.ThumbnailButton;
import gui.quiz.imagegallery.ViewImageFrame;

public class S14_ImageGallery extends JFrame {
	
	public S14_ImageGallery(String path) {
		
		File dir = new File(path);
		
		//모든 ThumbnailButton에서 사용할 ViewImageFrame을 하나 생성하여 전달
		ViewImageFrame viewFrame = new ViewImageFrame();
		ThumbnailButton.setViewFrame(viewFrame);
		
		int imageCount = 0;
		for(File f : dir.listFiles()) {
			if (f.isFile()) {
				add(new ThumbnailButton(f));
				++imageCount;				
			}
		}
		
		while (imageCount++ < 16) {
			add(new JButton("empty"));
		}
		
		setLayout(new GridLayout(4, 4));
		setTitle("Thumbnails");
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new S14_ImageGallery("images/");	
	
		
		
	}
	
}

/*
 		images 폴더 내부의 모든 내용을 
 		원하는 경로의 밑으로 모두 복사해보세요
 		
 */
package quiz;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E06_Copy {

	public static void copyFile(File srcFile, File dstFile) {
		// FileReader in = null;
		// FileWriter out = null;

		FileInputStream in = null;
		FileOutputStream out = null;

		try {

			in = new FileInputStream(srcFile);
			out = new FileOutputStream(dstFile);

			out.write(in.readAllBytes());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void copyDirectory(File src, File dst) throws Exception {
		if (!src.isDirectory()) {
			throw new Exception("디렉토리만전달해익셉션");
		}

		if (!src.exists()) {
			throw new Exception("복사할파일경로틀리믹셉션");
		}

		if (!dst.exists()) {
			throw new Exception("목적지경로틀리믹셉션");
		}

		// src : images
		// dst : myFiles
		// to_copy : myFiles/images/

		File to_copy = new File(dst, src.getName());
		// myFiles/images/
		to_copy.mkdir();

		// 원본폴더인/images/ 내부의 파일들
		for (File f : src.listFiles()) {
			if (f.isDirectory()) {
				copyDirectory(f, to_copy);

			} else if (f.isFile()) {
				copyFile(f, new File(to_copy, f.getName()));
			}
		}
	}

	public static void copy(File src, File dst) {
		File to_copy = new File(dst, src.getName());

		System.out.println("================================================");
		System.out.println("원본의 위치 : " + src);
		System.out.println("복사해야 하는 위치 :" + to_copy);

		if (src.isDirectory()) {
			to_copy.mkdir();

		} else if (src.isFile()) {
			copyFile(src, to_copy);
			// 복사
		} else {
			System.out.println("복사종료");
		}

	}

	public static void main(String[] args) {
		try {
			copyDirectory(new File("images"), new File("copypractice"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

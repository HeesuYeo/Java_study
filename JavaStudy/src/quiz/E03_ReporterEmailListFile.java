// 기자들의 이메일로만 이루어진 파일을 생성
package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03_ReporterEmailListFile {

	public static void main(String[] args) {

		Pattern emailPattern = Pattern.compile("\\S+@\\S+");

		Matcher matcher = emailPattern.matcher(D10_ReporterEmailList.text);

		try {
			FileOutputStream out = new FileOutputStream("myFiles/email_List.txt");
			while (matcher.find()) {
				out.write((matcher.group(0) + "\n").getBytes());
				out.write('\n');
			}
			out.close();
		} catch (Exception e) {
			System.out.println("파일을 찾을수 없거나 쓰기도중 에러");
		}
		System.out.println("프로그렘 종료");

	}

}

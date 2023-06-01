package register1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Registervalidation {

	public static boolean Registervalidation(String userPass) {
		
		JOptionPane pu = new JOptionPane();

		int len = userPass.length();

		if (len < 8 || len > 16) {

			pu.showMessageDialog(null, "PassWord의 길이가 잘못되었습니다.");
			return false;
		}

		if (!Pattern.matches("[a-zA-Z\\d!@#$%]{8,16}", userPass)) {

			pu.showMessageDialog(null, "사용하면 안되는 PassWord 문자를 사용하셨습니다." + "(소문자, 대문자, 숫자, 특수문자만 사용 가능)");
			return false;
		}

		for (int i = 0; i < userPass.length(); ++i) {
			char ch = userPass.charAt(i);
		}

		List<Character> mustHave = new ArrayList<>();
		Collections.addAll(mustHave, '!', '@', '#', '$', '%');

		boolean digit = false, lower = false, upper = false, special = false;

		for (int i = 0; i < len; ++i) {
			char ch = userPass.charAt(i);

			if (Character.isLowerCase(ch)) {
				lower = true;
			} else if (Character.isUpperCase(ch)) {
				upper = true;
			} else if (Character.isDigit(ch)) {
				digit = true;
			} else if (mustHave.contains(ch)) {
				special = true;
			}
			
		}

		if (!digit) {

			pu.showMessageDialog(null, "오류 : PassWord 숫자 미포함");
			return false;
		} else if (!upper) {

			pu.showMessageDialog(null, "오류 : PassWord 대문자 미포함");
			return false;
		} else if (!lower) {

			pu.showMessageDialog(null, "오류 : PassWord 소문자 미포함");
			return false;
		} else if (!special) {

			pu.showMessageDialog(null, "오류 : PassWord 특수문자 미포함");
			return false;
		}

		return true;

	}

	public static void main(String[] args) {

	}

}

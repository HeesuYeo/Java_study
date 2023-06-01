package register1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RegistervalidationId {

	public static boolean CheckId(String userId) {
		
		JOptionPane pu = new JOptionPane();

		int len = userId.length();

		if (len < 8 || len > 16) {

			pu.showMessageDialog(null, "ID의 길이가 잘못되었습니다.");
			return false;
		}

		if (!Pattern.matches("[a-zA-Z0-9]{8,16}", userId)) {

			pu.showMessageDialog(null, "사용하면 안되는 ID 문자를 사용하셨습니다." + "(소문자, 대문자, 숫자만 사용 가능)");
			return false;
		}

		List<Character> mustHave = new ArrayList<>();
		Collections.addAll(mustHave, '!', '@', '#', '$', '%');

		boolean digit = false, lower = false, upper = false, special = false;

		for (int i = 0; i < len; ++i) {
			char ch = userId.charAt(i);

			if (Character.isDigit(ch)) {
				digit = true;
			}
		}

		if (!digit) {
			pu.showMessageDialog(null, "오류 : ID 숫자 미포함");
			return false;
			
		}

		return true;

	}

	public static void main(String[] args) {

	}

}

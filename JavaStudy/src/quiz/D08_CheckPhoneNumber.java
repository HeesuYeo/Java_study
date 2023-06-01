/*
  사용자로부터 입력받은 문자열이 유효한 핸드폰 번호인지 검사하는 메서드 
 */

package quiz;

import java.util.Scanner;

public class D08_CheckPhoneNumber {

	public static boolean check(String phoneNumber) {
		// 공백제거
		System.out.println("번호를 입력해보세요");
		
		phoneNumber = new Scanner(System.in).next();
		
		phoneNumber = phoneNumber.trim();
		// 010 시작검사
		if (!phoneNumber.startsWith("010")) {
			return false;
		}
		// 01012341234 // <->작대기 미포함 (11) 작대기 포함(13) 검사
		int len = phoneNumber.length();
		if (len != 11 && len != 13) {
			return false;
		}

		// 길이가 13이면
		if (len == 13) {
			// -의 위치가 올바른지 확인하고
			if (phoneNumber.charAt(3) != '-' || phoneNumber.charAt(8) != '-') {
				return false;
			}
			// <-> , 공백을 제거
			phoneNumber = phoneNumber.replace("-", "");

		}
		// 남은 문자열이 모두 숫자인지 확인
		for (int i = 0; i < phoneNumber.length(); i++) {
			if (!Character.isDigit(phoneNumber.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(check(""));
		System.out.println(check("010-1$34-1234"));
		System.out.println(check("010-1234-123454"));
		System.out.println(check("01012341234"));
		
	}
}

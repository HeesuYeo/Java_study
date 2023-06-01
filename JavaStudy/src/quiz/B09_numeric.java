/*
 	사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지 
 	판별하는 프로그램을 만들어 보세요
 */
package quiz;

import java.util.Scanner;

public class B09_numeric {

	public static void main(String[] args) {

		System.out.println("문자열을 입력하시오 : ");                // 문자열입력
		String sc = new Scanner(System.in).next();
		int len = sc.length();
		int out = 0;

		for (int i = 0; i < len; ++i) {                        // 반복지정

			if (sc.charAt(i) >= '0' && sc.charAt(i) <= '9') {  // 조건 지정해서 컨티뉴로 숫자검사
				continue;
			} else {
				out = 1;                                       // for문 검사하고 카운트
				break;                                         // 아닐시 break로 밖으로 빼내기
			}
		}

		if (out == 1) {                                       // 숫자 없을시 out +1
			System.out.println("숫자 문자열 x");                 // 출력

		} else {
			System.out.println("숫자 문자열 O");

		}
	}
}

/*
 	사용자가 문장을 입력하면 해당 문장에 알파벳 e가 몇 회 등장하는지
 	알려주는 프로그램을 만들어 보세요
 	(대,소문자모두 구분)
 
 	 HINT 모든글자가 해당문자인지 검사하면 된다
 
 
 
 
 */
package quiz;

import java.util.Scanner;

public class B08_CountAlphatbet {

	public static void main(String[] args) {

		Scanner alpa = new Scanner(System.in);

		System.out.println("문장을 입력하시오 : ");
		String sent = new String();
		sent = alpa.nextLine();
		int count = 0;

		for (int i = 0; i < sent.length(); ++i) {

			if (sent.charAt(i) == 'e' || sent.charAt(i) == 'E') {

				count++;  // e 나 E가 있을때 카운트 1

			}
		}

		System.out.printf("해당문장에서 e나E는 %d회", count);
		/*
		// d >= 'a' && 'z'>= d || d >= 'A' && d >= 'Z';
		// (sent == 'e') || (sent == 'Q');
		// 1.e나 E가 들어가는지 검사
		// 2.몇회들어가는지 확인
		//문제지우고 다시풀어보는 복습
		답
		int count = 0;
		String text = "i am ironman";
		
		//0번부터 문자열의 길이만큼 반복하며 문자를 하나씩꺼낸다
		for( int i = 0, len = text.length(); i<len; ++i) {
		
		// 꺼낸문자가 'e'인지 비교한다
		if(text.charAt(i) =='e'|| text.charAt(i)=="E") {  // len?
		System.out.printf("%d번재에서  e가 등장했습니다\n", i);
		e_count++ e 또는 E 가 등장하면 1 증가시키고 싶다
		
		//다른타입끼리 연산은 원칙적으로 불가능
		 System.out.println("e" == 'E'); ....x
		 System.out.println(true * 3);
		 
		//예외1 : 소수와 정수연산
		System.out.println(123 < 123.4556 );
		
		//예외2 : 문자열은 모든 타입과 +가능 (이어붙이기)
		 System.out.println("나이 : " + 123.12345);
		 
		//예외3 : 문자타입은 정수로 인식되어 다른 숫자들과 연산가능
		 System.out.println('a' + 3.4556 );  
		
		
*/
	}
}

/*
 	1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
 	
 	2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
 	
 	3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 메서드
 	
 	4. 메서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로
 	
 	   이루어진 배열을 변환하는 메서드
 */
package quiz;

import java.util.Arrays;

public class C01_MethodQuiz2 {
	// 01
	public static int bask(int apple, int basket) {

		int apple1 = apple % basket == 0 ? apple / basket : apple / basket + 1;

		return apple;

	}

	// 2 *오류뜨면 막아놓고하기* return
	public static String suffle(String text) {
		char[] arr = text.toCharArray();

		for (int i = 0; i < 1000; ++i) {
			int index = (int) (Math.random() * arr.length);
			char tmp = arr[0];
			arr[0] = arr[index];
			arr[index] = tmp;

		}
		return new String(arr);
	}
	//03
	public static String reverseText(String text) {
		char[] ori = text.toCharArray();
		int len = ori.length;
		char[] reversed = new char[len];

		for (int i = 0; i < len; ++i) {
			reversed[len - 1 - i] = ori[i];

		}
		return new String(reversed);
	}
	
	
	//04
		public static int getrandomNumber() {
			return (int)(Math.random() * 45 + 1);
	}
		
	public static int[] getLottoNumber() {
		int[] lotto = new int[7];
		
		for (int i =0; i< lotto.length; ++i ) {
			lotto[i] = getrandomNumber();
			for (int j =0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					
					lotto[i] = getrandomNumber(); 
					j = -1;
				}
			}
		}
		return lotto;
	}
	//출력
	public static void main(String[] args) {

		System.out.println(bask(100, 10));
		System.out.println(suffle("hello"));
		System.out.println(reverseText("hello"));
		System.out.println(Arrays.toString(getLottoNumber()));

	}
}
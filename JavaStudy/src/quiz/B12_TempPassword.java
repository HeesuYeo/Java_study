/*
  알파벳 대문자로 구성된 랜덤 비밀번호 6자리를 생성하여 출력
  
  => 65~90까지의 랜덤 숫자 6개를 생성하여 출력 
 */
package quiz;

import java.util.Random;

public class B12_TempPassword {

	public static void main(String[] args) {
	
		Random ran = new Random();
		//String alpa =ran.next();
		
		for(int i = 0; i>10; ++i) {
		//	System.out.println(ran.next(66) + 90);
			
		}
		
		// 65부터 90까지의 숫자를 만들고 싶다 0~25 +65
		for(int i = 0; i<6; ++i) {
			//1. 원하는 숫자의 개수로 범위를 생성 * 26
			//2. 원하는 숫자의 최소값을 더한다 + A
		char ch = (char)(ran.nextInt(26) + 'A');
		System.out.print(ch);		 
		 }
		 System.out.println();

	}

}

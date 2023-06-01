/*
  	랜덤 양의 정수를 하나 생성하고  ran
  	해당 숫자까지 3,6,9게임이 진행 된다면 if 
  	박수를 총 몇 번 쳐야 하는지 출력해보세요 
  	
 */

package quiz;

import java.util.Random;

public class B12_Count369 {

	public static void main(String[] args) {
		Random ran = new Random(0);
	      int num = (int)(Math.random() * 100000);
	      
	      System.out.println("이번에 검사할 숫자: " + num);
	      
	      int clap = 0;
	      // 1. 문자열을 활용하는 방식
	      for (int i = 1; i < num; ++i) {
	         // 검사할 숫자를 문자열로 변환
	         String check = "" + i;
	         System.out.println(i + "검사 결과: ");
	         
	         // 문자열이 된 숫자를 하나씩 떼서 박수를 쳐야하는지 검사
	         for (int j = 0; j < check.length(); ++j) {
	            char ch = check.charAt(j);
	            System.out.printf("- %d번째 숫자 [%c]\n", j, ch);
	            
	            // "44839" -> '4', '4', '8' // 52, 52, 56
	            if(ch == '3' || ch == '6' || ch == '9') {
	               ++clap;
	               System.out.print("짝");
	            } else {
	               System.out.println();
	            }
	         }
	      }
	      System.out.println("총 박수 " + clap + "회 입니다.");
	
	
////   답2
	      
		clap = 0;
		
		for (int i = 3; i<= num; ++ i) {
			
			int check = i;
			System.out.println("이번에 검사할 숫자는 : " + check);
			
			// 십진수는 % 10 으로 일의 자리를 분리할수있다
			while(check > 0 ) {
				int digit = check %10;
				System.out.printf("- %d :  ",digit);
				
				if(digit != 0 && digit % 3 == 0) {
					System.out.println("짝");
					++clap;
				}else{
					System.out.println();
				}
				check/=10;
				
			}
			
			/*
			 1 2 3 4 5 % 10 -> 5
			 1 2 3 4  % 10 -> 4 
			 1 2 3  % 10 -> 3
			 1 2 % 10 -> 2
			 1 % 10 -> 1
			 끝
			 */
	
		}
		
		
	}

}

        /*
          1 문제푸는 절차를 잘못
			-내 머리로는 풀 수없는 경우 <- 심각
			- 풀 수 있지만 절차적으로 변환이 안되는 경우 <- 경험부족 
		  2 어떻게 만들어야 되는지는 아는데 자바문법을을 모르는경우
		   - 복습을 열심히
		   - 틀린 문제를 또 틀리면 안된다  
		*/
package quiz_answer;

import java.util.Scanner;

public class Palinanswer {

	public static void main(String[] args) {
		
		System.out.println("단어를 입력해보세요 : ");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		//01234567
		
		//stralight : 8글자
		
		// i:0      word.length() -i -1 : 7
		//i:1      word.length() -i -1 : 6
		//i:2      word.length() -i -1 : 5
		//i:3      word.length() -i -1 : 4
			//...
		//i:7      word.length() -i -1 : 7
		
		boolean palindrome = true;
		// (1) i번재 글자와 len-1번째글자가 모두 일치하면 좌우대칭
		for (int i = 0; i < word.length() / 2; ++i) {
			int i2 = word.length() - 1 - i;
		
		
			// i : 0 1 2 3 4 5 6 7 8 9 10 ... ien-1
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(i2);
		
			if (ch1 == ch2) {
				System.out.printf("%d %c %d %c  일치", i, ch1, i2, ch2);

			} else {

				System.out.printf("%d %c %d %c 불일치", i, ch1, i2, ch2);

				palindrome = false; // 안되는경우를생각해봐라

			}
			System.out.println("좌우대칭 여부 : " + palindrome);
		}
		
		// (2) 글자를 거꾸로 만든 후 거꾸로 되기전과 같으면 좌우대칭
		
		System.out.println("단어를 입력해보세요");
		//비어있는 문자열에 문자를 하나싹 계속 이어붙여 문자를 만들수있다
		
		
		
		//class pal2
		
		
	
		String example = "level";
				
	    String reversed = " ";
		
	     for (int i = example.length() - 1; i >= 0; --i) {
		 reversed += example.charAt(i);
		 
	     } 
	 
	     System.out.println("원래 문자열" + example);
	     System.out.println("뒤집은 문자열 " + reversed);
	     System.out.println("좌우대칭이니 " + example.equals(reversed)) ;
	     
		
		
		

				}
			
		}
	


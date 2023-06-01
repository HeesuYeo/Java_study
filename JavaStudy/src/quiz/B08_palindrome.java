/*
 	사용자가 단어를 입력하면 해당단어가 완벽하게 좌우대칭안지
 	판별해주는 프로그램을 만들어보세요
 	>>Level
 	->좌우대칭이 아닙니다
 	
 	>>level
 	->좌우대칭입니다
 	
 	>>abba
 	->좌우대칭입니다
 
 */

package quiz;

import java.util.Scanner;

public class B08_palindrome {

	public static void main(String[] args) {
	
		System.out.println("단어를 입력해보세요");
		String text = new Scanner(System.in).nextLine();
		//int ii = text.length();
	
		
		for (int i = text.length() - 1; i <= i; --i) {                                   // 반복문 지정
		for (int j = text.length() ; j >= 0; ++ i) { 
			
			if (text.charAt(i) == text.charAt(j) || text.charAt(i) == text.charAt(j)) {  // i랑 j랑 맞는지 비교
				System.out.println("맞는 문장입니다");                                       // 맞을시 좌우대칭 출력
				                                        
			}else { 
				System.out.println("틀린 문장입니다");			                             //아닐시 아닙니다 출력				

				
				
			}
			}
			}
		
		}
	}

//text.charAt(i) == j ||  text.charAt(i) == j)
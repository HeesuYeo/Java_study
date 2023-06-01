/*
     알맞은 조건식
     
    1.char형 변수 a가 'q'또는 'Q' 일 떄    true
    2.char형 변수 b 공백이나 탭이 아닐 떄     true 
    3.char형 변수 c가 0~9 일 떄           true 
    4.char형 변수 d가 영문자 (대,소문자)일 떄 true 
    5.char형 변수 e가 '한글' 일 떄          true 
    6.사용자가 입력한 문자열이 quit일때       true 

 */
package quiz;

import java.util.Scanner;


public class B02_ConditionQuiz2 {

	public static void main(String[] args) {
		
		char a = 'Q';
		char b = '가';
		char c = '0';
		char d = '가';
		char e = '대';
		
		//1.
		boolean first = a == 'q' || a =='Q';
		System.out.println("1번 답은 : " + first);
		//답
		// boolean first = a == 'q' || a =='Q';
		// System.out.println("1번 답은 : " + first);
		// 문자도 숫자이다 
		
		//2.
		boolean second = b != ' ' || b != '\t';
		System.out.println("2번 답은 : " + second);
		//에시
		//boolean second =(!(b == ' ' || b == '\t))';
		
		//3
		
		boolean three = c >= '0' && c <= '9';
		System.out.println("3번답은 : " + three);
		
		
	    //4
		//오래걸림
		boolean four = d >= 'a' && 'z'>= d || d >= 'A'  && d >= 'Z';
		System.out.println("4번 답은 : " + four );
		//다른 답
		//boolean four1 = d >= 'a' && d >= 'z'
		//boolean four2 = d >= 'A'  && d >= 'Z'
		//System.out.println(four1 || four2 );
		
	    //5
		//못품
		boolean five = (e >= '가' && e <= '힣');                                                    
		System.out.println("5번 답은 : " + five );
		// 자음,모음은 일딘 패스, 유니코드로 할때는  가,힣 자리에 코드적으면 출력가능 가 0xAC00 ~ 힣 0xD7A3  44032 ~ 55203
	
 		//6
        // 못품	
		Scanner sc = new Scanner(System.in);
		
		String command;
		
		System.out.print("> ");
		command = sc.next();
		
		System.out.println("quiz? " + (command.equals("quiz")));
		
		
		
		
		
		
		
		
		
		
		
		
		//
		//
		//
		//
		
		
		
		
		
		
		
		
		
	}

}

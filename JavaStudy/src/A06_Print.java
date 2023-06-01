/*
 		# 콘솔에 출력하는 함수들
 		
 		  1. println
 		   - print() + \n 의 형식
 		   -() 안에 전달한 데이터를 콘솔에 출력하면서 줄을 "자동으로" 바꿔준다
 		   
 		   
 		  2. print()
 		  
 		     - ()안에 전달한 데이터를 콘솔에 출력한다
 		     
 		  3. printf ()
 		  
 		  	- print format
 		  	
 		  	- 서식을 이용해 원하는 출력 형태를 미리 만들어 놓는 출력 방식
 		  	
 		  	- 서식 문자 자리에 값을 순서대로 채워 사용함
 		  	
 		  	- \n 이 추가 되지 않으므로 주의 해야함
 		  	
 		  	// "16진수 0 1 2 3 4 5 6 7 8 9 a b c d e f
		    //       10 11 12 13 14 15 16 17 18 19 a1 b2 c3 d4 e5 f6 "
 		  	
 		  	
 * 서식 문자의 종류
 		  
 		  	%d : 해당 자리에 전달한 점수값을 10진수로 출력 (decimal) 
 		  	%x : 해당 자리에 전달한 점수값을 16진수로 출력 (a~f 소문자)
 		  	%X : 해당 자리에 전달한 점수값을 16진수로 출력 (A~F대문자)
 		  	%o : 해당 자리에 전달한 점수값을  8진수로 출력 
 		  	%s : 문자열 
 		  	%c : 문자 
 		  	%f : 실수 (double, float)
			%% : 그냥 %을 출력
		
		
 *	서식 문자 옵션 - 서식 문자으 ㅣ%와 문자 사이의 넣어서 사용한다
		  
		  
		      1. %숫자d
		        - 숫자만큼 자릿수를 확보하면서 출력한다
		      
		      2. %-숫자d
		       - 숫자만큼 자릿수를 확보한 후 왼족 정렬하여 출력
		        
			  3. %0숫자d
		       - 숫자만큼 자릿수를 확보하고 빈자리에 10을 채우면서 출력
		      	
			  4. %-숫자d
		       - 숫자만큼 자릿수를 확보한 후 왼쪽 정렬하여 출력
						
 */


public class A06_Print {

	
	public static void main(String[] args) {
		
		int number = 12345;
		int a = 32;
		int year = 2022;
		int month = 10 ;
		int date = 6;
		int hour = 9 ;
		int minute = 26;
		int second =1;
		int fruitPrice = 1500; 
		String message = "Nice to meet you!";
		String name = "민수";
		String fruitName = "apple";
		int ch = 88;
		double weight = 75.8;
		
		
		//f와 ln의 차이점
		System.out.println("오늘은" + year + "년" + month + "월" + date + "일이고, "
		+ "현재시간은 " + hour + "시" + minute + "분" + second + "초 입니다" );
			
		System.out.printf("오늘은 %d년 %d월 %d일이고\n, 현재 시간은 %d시 %d분 %d초 입니다.\n",
		year, month, date, 22, minute, second);
		
		// 서식 옵션
		System.out.printf("%10d:\n", number);
		System.out.printf("%-10d:\n", number);
		System.out.printf("%-8s:%d\n,", fruitName, fruitPrice);
		
		//서식 문자 예시
		System.out.printf("a에 들어있는 값은 10진수로 %d 이고, 16진수로 %x입니다. \n",a, a);
		System.out.printf("문자 '%c' 의 코드값은 [%d]입니다.\n", ch, ch);
		System.out.printf("몸무게 : %f\n", weight);
		System.out.printf("이자율 : %f%%\n", weight);
		System.out.printf("%s 님이 남긴 메세지 입니다. \"%s\"\n ", name, message);
		
		// t, ln, ,print 의 차이점
		System.out.print("hello world");
		System.out.print("hello world");
		System.out.print("hello world");
		System.out.print("hello world");
			
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		
		System.out.printf("Hello World");
		System.out.printf("Hello World");
		System.out.printf("Hello World");
		System.out.printf("Hello World\n");
		
		
		//진수표
		//for (int num = 1; num <= 1000; ++num) {
		//System.out.printf("10진수 %d는 8진수로 %o, 16진수로%x\n", num, num, num);
			
				
				
				
			
		}
		
	}


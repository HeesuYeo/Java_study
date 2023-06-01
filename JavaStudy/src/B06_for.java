/*
 
 	# 반복문
 	
 	 - for, while, forEach, do- while(x)
 	 - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
 
 	# for
 		[형식]
     	for(초기화식;반복조건식;증감값식){
		실행문; //가운데의 반복 조건이 참인동안 반복될 코드를 적음
		
		}
 		- 초기값 : 다양한 변수들을 초기화 하는용도 
 		- 반복조건 : 가운데의 조건이 참인동안 {}안에 내용을 계속실행
 		- 증감값 : {}안의 내용이 모두 실행 되고 나면 값을 변화시키는 용도로 실행
 		 
 	 1. 가장 기본적인형태의 for 문
 	  	 - 초기값에 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다 
 	  	 - 증가는 1씩한다
 	  	 - 원하는 횟수만큼 반복하고 싶을때 가장 많이 사용하는 형태의 for문 
 	 
 	 2.  - 초기값 조건 증감값을 자유롭게 설정한 for문
 	   	 - 초기값, 조건, 증감값은 자유롭게 변경하여 용도에 맞게 사용할수있다
 	   	 - 증감 값에는 + 도 사용 할수았고, -도 사용할수있다
 	  	 - 증감 값에는 모든 연산을 자유롭게 사용 할 수 있다		 
 	
 	3.   - 각 자리의 값을 생략한 for문 
 		 
 		 - 초기값, 조건 증감값은 모두 생략하여 사용할 수있다
 		 - 조건을 생략하면 무한 반복하게 된다
 		 - ;;은 꼭 넣어야 한다
 		  	
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 		 
 */
public class B06_for {

	public static void main(String[] args) {
		// 똑같은걸 여러번반복한다,횟수를 지정할수있어야한다
		// Hello, world!를 1000번 출력해주세요 [복붙금지]

		for (int i = 0; i <= 12; i += 3) {
			System.out.println("Hello,world! " + i);
		}

		for (int i = 100; i > 0; i -= 5) {
			System.out.println("Hello,world! " + i);
		}
		// 1
		for (int i = 0; i < 143; ++i) {
			System.out.println(i + "회반복중입니다 ");
		}
		// 2
		for (int i = 7; i > 1000000000; i *= 7) {
			System.out.println(i);
		}
		for (int i = 483928123; i > 0; i /= 10) {
			System.out.println(i);
		}
		// ex
		int da;
		int time;

		for (da = 1; da <= 9; da++) {
			System.out.println(da + "단");

			for (time = 1; time <= 9; time++) {
				System.out.println(da + " X " + time + " = " + da * time);

				// 3
				int num = 10;
				for (; num < 100;) {
					System.out.printf("%d\n", num);
					num += 20;
				}

				System.out.printf("반복문이 모두 끝난 후의 num: %d\n", num);

			}
		}
	}
}
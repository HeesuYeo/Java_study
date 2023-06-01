/*
 	사용자가 정수를 입력하면 해당정수의 !(팩토리얼) 을 구하는 메서드를 입력해보시오
 	
 	10! => 10 * 9 * 8 * 6 * 5 * 4 * 3 * 2 * 1
 	 7! => 7 * 6 * 5 * 4 * 3 * 2 * 1  
 	
\ 
 
 
 
 
 */
package quiz;

import java.util.Scanner;

public class E06_Factorial {



	public static int test(int num) throws Exception {
		if (num == 200) {
			throw new Exception("이제 그만");
		}
		System.out.println("test: " + num);
		return test(num - 1);
	}

	// 자기 자신을 호출하는 재귀 함수 방식 (recursive, 성능 안 좋음)
	public static int factorial2(int num) { // 폴더 안의 폴더 등의 사용
		if (num == 1) {
			return 1;
		}

		return num * factorial2(num - 1);
	}

	public static int factorial(int num) {
		int result = 1;
		for (int i = num; i > 0; --i) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		
	}
}
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("팩토리얼을 구할 정수를 입력하시오");
//		int num = sc.nextInt();
//
//		int result = 1;
//		for (int i = num; i > 0; i--) {
//			result *= i;
//			
//			System.out.print(i + "\t" );
//		}
//		System.out.println();
//		System.out.println("\n" + result);

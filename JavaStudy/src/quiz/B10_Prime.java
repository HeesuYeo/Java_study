/*
 	사용자로 부터 숫자(양수)를 입력받으면
 	1부터 입력한 숫자 사이에 있는 모든 소수를 출력
 	
 	※ 소수 :나누어 떨어지는 수가 1과 자기자신밖에 없는 수
 	  Ex) 2 3 5 7 11 13 ...
	※ 사용자가 잘못된 숫자를 입력하는경우 다시 제대로 입력하게 만들것
	//원하는 숫자를 구할때 까지 반복
	  
	 i가 소수인지 검사
	 	방법1 - i를 1부터 i까지의 숫자로 모두 나누어본다.
		       모두 나누었을 때 약수가 2개라면 소수다.
	 	방법2 - i를 2부터 자기자신 직전까지 나눈다 .
   	           나누어 떨이지는 수가 없으면 소수다. 
   	  	방법3 - i를 2부터 검사하는 숫자의 제곱근까지의 숫자로 나눈다
 */
package quiz;

import java.util.Scanner;

public class B10_Prime {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();                 // 입력 된 수 사이에 소수 찾기

		for (;;) {
			System.out.print(">>");
			num = sc.nextInt();

			// num에 원하는 숫자가 들어와야 반복문 탈출
			if (num > 1) {
				break;
			}
			System.out.println("2 이상의 숫자를 입력하세요");
		}
		for (int i = 2; i <= num; ++i) {
			boolean prime = true;
			
			for (int j = 2; j < i; ++j) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.printf("%d이 소수인가요? %s\n", i, prime);
			}
		}

	}
}

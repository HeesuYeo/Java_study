/*
 		사용자로부터 nextInt()로 숫자를 입력 받되, 숫자가 아닌 문자룰 입력하더라도 
 		
 		다시 입력 받을 수 있는 프로그램을 만들어보세요
 */
package quiz;

import java.util.Scanner;

public class E01_InputRightThing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;

		while (true) {

			try {
				System.out.println("입력해보세요");
				a = sc.nextInt();
				break;

			} catch (Exception e) {
				System.out.println("!!오류발생!!");
				System.out.println("스트림에 남아있던것 : " + sc.nextLine());
				System.out.println("다시입력해보세요");
				continue;
			}
		}
		System.out.println("받은값 : " + a);
		System.out.println("해당 프로그램 종료");
	}

}

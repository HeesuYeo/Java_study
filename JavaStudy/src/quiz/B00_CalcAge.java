package quiz;

import java.util.Scanner;

// 사용자로부터 태어난 해를 입력 받으면 한국나이를 출력해주는 
// 프로그램을 만들어보세요
public class B00_CalcAge {

	public static void main(String[] args) {
			
		 	Scanner yearScanner = new Scanner(System.in);
		 	int thisYear, birthYear, age;
		 	System.out.print("해를 입력해보세요 >> ");
		 	
		 	birthYear = yearScanner.nextInt();
		 	thisYear =  yearScanner.nextInt();
		 	
		 	age = thisYear - birthYear + 1;
		 	
		 	System.out.printf("태어난해는 %d이고 당신의 나이는 %d살 입니다.\n", thisYear, age);
		 	
		 	
		 	 /*  Scanner age = new Scanner(System.in);     		
			System.out.print("해를 입력해보세요 >> ");
			
			int year = age.nextInt();
			
			
			System.out.printf("태어난 해는 한극나이 : %d\n", 2022 - year + 1);
		 	*/
		 
		
		// 혼자 해보기
		

	}

}

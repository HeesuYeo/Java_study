package quiz;

import java.util.Scanner;

/*
 	사용자로 부터 몇월인지 입력받으면 해당하는 계절을 출력해보세요
 
 
 	(반드시 Switch_case문를 사용할것.) 
 
  
 */
public class B04_MouthToSeason {

	public static void main(String[] args) {
		Scanner sea = new Scanner(System.in);
		
		
		String season;
		
		System.out.println("월을 입력하세요");
		
		String seas = sea.next();
		
		switch (seas) {
		case   "3월","4월","5월" : 
			System.out.println("봄");
		break;
		
		case  "6월","7월","8월":
		System.out.println("여름");
		break;		
		
		case  "9월","10월","11월":
			System.out.println("가을");
		break;
		
		case "12월","1월","2월":  
			System.out.println("겨울");
		break;
		
		default:
		      System.out.println("올바르지 않습니다");
		break;     
		
		/*
		 답
		 
		 //String season;
		 int month;
		 System.out.println("몇월인가요?");
		 
		 switch (month = new Scanner(System.in),nextInt()) {
		      
		case 12,1,2:  
			season = 겨울
		break;
		
		case 3,4,5:  
			season = 봄
		break;
		
		case 6,7,8:  
			season = 여름
		break;
		
		case 9,10,11:  
			season = 가을
		break;
		default:
		      season = "없음";
		break;
		 
		
		System.out.printf("%d월은 %d입니다.\n", month, season);
		 
		  
		  
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
}

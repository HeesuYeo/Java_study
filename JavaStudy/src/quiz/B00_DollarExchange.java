package quiz;

import java.util.Scanner;

public class B00_DollarExchange {
	/*
	  원을 입력받으면 달러로 얼마인지 계산해주는 프로그램  만들기
	  환율 구글링
	  
	 */
	

	public static void main(String[] args) {
		
		Scanner ex_rate = new Scanner(System.in);     		
		System.out.print("원(￦)을 입력하세요 >> ");
		
		double usa_money;
		int k_money;
		
		//소수점 
		k_money = ex_rate.nextInt();                                                                                             		 
		usa_money = (k_money / 1400);
	 	
	 	System.out.printf("달러는 %.3f$ 입니다.", usa_money);
	    //2fs 에서 2는 소숫점의 자리
	 	
	 	
	 	
	/*
	  int won;
	  dou dall;
	  
	   System.out.print(한국돈을입력>);
	   won = new scanner(system.in).nextInt();
	   
	  // 정수와 실수의 계산 결과는 실수가 된다
	  dallar = won / 1400.8  
	  
	  System.out.printf("%d원은  %.3f$ 입니다.", won, dallar);
	   
	  
	  
	  
	  
	  
	  
	  
	  
	 */

	}

}

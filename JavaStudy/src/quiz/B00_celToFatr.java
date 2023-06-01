package quiz;

import java.util.Scanner;

public class B00_celToFatr {

	public static void main(String[] args) {
		/*
		  사용자로 부터 섭씨(℃) 온도를 입력 받으면 화씨(℉)로 몇도인지 
		  알려주는 프로그램을 민들어보세요
		  (온도 변환 공식은 구글링 할 것)
		 */
		
		Scanner temp = new Scanner(System.in);     		
		System.out.print("섭씨를 입력하세요 >>");
		double ce_scale;
		double fa_scale;                              
		//소수점 
		ce_scale = temp.nextDouble();                                                                                             		 
	    fa_scale = (ce_scale * 9 / 5) + 32;                               // (0°C × 9/5) + 32 = 32°F
	 	 
	 	System.out.printf("섭씨 %.1f℃는 화씨 %.1f 입니다.", ce_scale, fa_scale);
	    
	    
	    
	    
	    
	    
	    		
	}

}

import java.util.Iterator;

public class B10_InnerLoop {

	public static void main(String[] args) {
		
		// 반복문 안에 반복문 사용
		for (int i =0; i<10; ++i) {
			
			System.out.println("==============================바깥 반복문" + i);
			
			for (int j =0; j< 5; ++j) {
				System.out.println("===========================안쪽반복문" + j);
			
				for (int k = 0; k<3; ++k) {
					System.out.println("++제일안쪽반복문" + k);
				
			}
		}
		
	}
/*
  	- 구구단은 2~9단 까지 있다
  	- 각 단 마다 x1 ~ x9가지 있다
  
  */
		

		

	/*	for (int dan = 1; dan <= 9; dan++) {
			System.out.println(da + "단");

			for (int time = 1; time <= 9; time++) {
				System.out.println(dan + " X " + time + " = " + dan * time);
*/
		
		
	}

	}

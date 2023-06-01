/*
 
 	사용자로 부터 숫자를 입력받으면
 	0부터 해당하는 숫자 사이에 존재하는 모든 5의 배수를 한 줄 에 10개씩 출력해보세요
 	(음수를 입력 받는 경우에도 올바르게 동작 해야합니다)
 
 
 
 */

package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {


	public static void main(String[] args) {

		Scanner mult = new Scanner(System.in);
		int input;
		System.out.println("수를 입력하세요");

		input = mult.nextInt();
		int abs = Math.abs(input);
		int count = 1;

		for (int i =1; i < abs  ; i++ ) {


			if( input > 0 && i % 5 == 0) {	
				System.out.printf("%d", i );
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
			else if( input < 0 && i % 5 == 0) {	
				System.out.printf("%-d", i );
				count++;

				if (count % 10 == 0) {
					System.out.println();


				}



			}	
		}
	}		
}


  /*
 		 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("아무 숫자나 입력 >> ");
      int num = sc.nextInt();
      
      System.out.printf("[0부터 %d까지 모든 5의 배수 목록]\n", num);
      
      if(num>=0) {
      for(int i = 0, cnt=1; i<num; i +=5, ++cnt) {
         System.out.printf("%5d", i);
         if(cnt%10==0) {
            System.out.println();
         }
         }
      }else {
         for(int i=0, cnt=1; i>num; i -=5, ++cnt) {
            System.out.printf("%5d", i);
            if(cnt%10==0) {
               System.out.println();
            }
         }
      }
      
      
   }
   
   
}
   
}
 
 
 
 
 
 */
 
 
 

 
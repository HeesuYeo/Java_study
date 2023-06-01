/*
   1. 1 ~ 45의 "중복 없는" 랜덤 숫자 6개를 생성하여 당첨 번호를 만들어보세요
 
 
   2. 당첨될때까지 랜덤 로또번호를 생성하여 몇 회 만에 당첨 되었는지 출력해보세요
 
다시뽑기 or 안뽑기
 */
package quiz;

import java.util.Arrays;
import java.util.Random;

public class B14_Lotto {

   public static void main(String[] args) {

      Random ran = new Random();
		/*
		  int[] number = new int[6]; 
		  int[] answer = new int[6]; int k = 0; int count =
		  0; 
		  int count1 = 0;
		  
		  for (int i = 0; i < 6; ++i) { // 당첨번호 answer[i] = ran.nextInt(45) + 1;
		  
		  for (int j = 0; j < i; ++j) { if (answer[i] == answer[j]) {
		  
		  --i;
		  
		  
		  
		  }
		   }
		    } 
		   System.out.printf("1등 번호 : %s %s %s %s %s %s\n", answer[0], answer[1],
		  answer[2], answer[3], answer[4], answer[5]);
		  
		  for (int i = 0; i < 6; ++i) { // 검사 number[i] = ran.nextInt(45) + 1;
		  
		  for (int j = 0; j < i; ++j) { if (number[i] == number[j]) {
		  
		  --i;
		  
		  } 
		  } 
		  } 
		  System.out.printf("뽑은 번호는 : %s %s %s %s %s %s\n", number[0], number[1],
		  number[2], number[3], number[4], number[5]);
		 */
   
      
      int[] lotto = new int[6];
      
      for (int i = 0; i < lotto.length; ++i) { 
    	  //i번재 랜덤 숫자 뽑음
    	  lotto[i] = (int)(Math.random() * 45 + 1);

    	  //System.out.println("방금 뽑은 숫자 : " + lotto[i]);
    	  
      // 이전의 숫자들 비교, 뽑았던 숫자가있다면 다시 뽑기
    	  		/*	
    	  		 	i =0 
    			  i = 1 / j = 0
    			  i = 2 / j = 0,1
    			  i = 3 / j = 0,1,2
    			  i = 4 / j = 0,1,2,3 
    			  i = 5 / j = 0,1,2,3,4
			  */ 
    	  for(int j =0; j < i; ++j) {
    		 System.out.printf("이전 숫자 %d : %d\n",j,lotto[j]);
    		 //
    		  if (lotto[i] == lotto[j]) {
    			  lotto[i] = (int)(Math.random() * 45 + 1);
    			  j = -1;
    			  System.out.println("다시 뽑은 숫자 :[ "+ lotto[i] + "]");
    			  System.out.println("i + 번째 중복발생 다시");

    			  
				}
			}
		}
      			//당첨
      			System.out.print("당첨번호 : ");
      			for (int i = 0; i< lotto.length; ++i) {
      				System.out.printf("%-2d " ,lotto[i]);
      				
      			}
      			long buycount = 0;
      			
      			while (true) {
      				int[] mylotto = new int[6];
      				
      				for (int i = 0; i <mylotto.length; ++i) {
      					mylotto[i] = (int)(Math.random() * 45 + 1);
      					
      						for (int j = 0; j<i; ++j) {
      							if (mylotto[i] == mylotto[j]) {
      								mylotto[i] = (int)(Math.random() * 45 + 1);
      								j = -1;
								}
							}
						}
      				++ buycount;
      				// lotto[] 와 mylotto[]가 같은지 비교
      				// => 당첨번호 6개가 mylotto[]에 포함되어 있는지 검사
      			   int winCount = 0;
      			  
      	          for (int i = 0; i < lotto.length; ++i) {
      	             for (int j = 0; j < mylotto.length; ++j) {
      	                if (lotto[i] == mylotto[j]) {
      	                   ++winCount;
      	                   break;
      	                }
      	             }
      	          }
      	          
      	          if (winCount == 6) {
      	             System.out.println(buycount +"만에 당첨!" + " 비용은 " + buycount * 1000 );
      	             break;
      	          } else if (winCount == 5) {
      	             System.out.println("2등! 아쉽다!");
      	             // java.util.Arrays.toString(arr) : 배열을 문자열로 변환
      	             System.out.println(Arrays.toString(mylotto));
      	          }

 
      						 }
   }
}
      					 
      				
      				 

/*
 * if (number == answer) { System.out.println("같습니다");
 * System.out.printf(" 회수는 %s  ", count1 + 1); break;
 * 
 * } else if (number != answer) { System.out.println("정답이 아닙니다"); ++count1;
 * 
 * } System.out.println("틀린회수는 : " + count1); }
 * 
 * System.out.println("정답은 :" + answer + " 입니다 ");
 */
/*
 * if (user < 1 || user > 999) 
 * {
 *  //System.out.println("잘못된 값입니다"); 
 * //--turn;
 * //continue;
 * 
 */
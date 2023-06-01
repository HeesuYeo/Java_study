/* 
 	1. 학생 100명의 점수(0~100)를 랜덤으로 생성하여 배열에 저장 
 	
 	2. 배열의 저장된 값을 한 줄에 10개식 출력
 	
 	3. 모든 학생들의 평균점수를 출력
 	
 	4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
 */
package quiz;

import java.util.Random;

public class B14_RandomScore {

	public static void main(String[] args) {
		Random ran = new Random();
		
		//1  학생 100명의 점수(0~100)를 랜덤으로 생성하여 배열에 저장
		
		int[] student = new int[100];
		for (int j = 0; j < student.length; ++j) {
			student[j] = ran.nextInt(101) + 0;

		// 0 ~ 99 적기
		
		//2 배열의 저장된 값을 한 줄에 10개식 출력
		
			for(int i = 0; i < student.length; ++i) {	
				System.out.printf("[%02d] : %-3d ", i, student[j]);
				System.out.print(student[i]+ " ");
				if(i % 10 == 9) {
					System.out.println();
				}
			}
			
			//3. 모든 학생들의 평균점수를 출력
			int a = 0;
			for(int k = 0; k < student.length; ++k) {	
				a += student[j];
				
			}		

			a += student[j];
			int sum = a/100;
			System.out.println("평균은 : " + sum);
			
			//4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
			int max = 0;
			//for (int i = 0; i < score.length; ++i ) {
				// 현재 max에 들어있는 값보다 더 크면 최대값을 교채한다
				
			}
	
	}
}
/*	
}

       1. 학생 100명의 점수(0 ~ 100)를 랜덤으로 생성하여 배열에 저장
      
      Random ran = new Random();
      
      int[] student = new int[100];
      
      for (int i = 0; i < 100; ++i) {
         student[i] = 100;
         System.out.println(student[i]);
      }
      int[] score = new int[100];
      
      for (int i = 0; i < score.length; ++i) {
         score[i] = (int)(Math.random() * 101);
      }
      
      // 2. 배열에 저장된 값을 한 줄에 10개씩 출력
      
      for (int i = 0; i < score.length; ++i) {
         System.out.printf("[%02d]: %-3d ", i, score[i]);
         if (i % 10 == 9) {
            System.out.println();
         }
      }
      
      // 3. 모든 학생들의 평균 점수를 출력 (소수 둘째 자리까지 출력)
      int sum = 0;
      for (int i = 0; i < score.length; ++i) {
         sum += score[i];
      }
      System.out.printf("총합: " + sum);
      System.out.printf("평균: %.2f\n", sum / (double)score.length);
      
      int sum = 0;
      double avr = 0;
      
      for (int i=0; i < 100; i++) {
         sum += student[i];
         avr = sum / 100;
         System.out.printf("모든 학생들의 평균 점수는 %-2f입니다", avr);
         }
      }
      
      // 4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
      
      int max = 0;
      int min = 100;
      
      for (int i = 0; i < score.length; ++i) {
         // 현재 max에 들어있는 값보다 더 크면 이제부터 너가 최대값이다!
         if (max < score[i]) {
            max = score[i];
         }
         if (min > score[i]) {
            min = score[i];
         }
      }
      System.out.printf("최대값은 %d이고, 최소값은 %d입니다", max, min);
      
      //최대값, 최소값 많이 쓰임***********
      
      int max = 0;
      int min = 0;

      for (int i = 0; i < 100; i++) {
         for (int j =1; j < 101; j++ ) {
            if (student[i] > student[j]) {
               max = student[i];
               i++;
               j++;
            }
         }
      }
      System.out.printf("학생들 중 가장 높은 점수는 ", max);
      **************************************
      for (int k = 0; k < 100; k++) {
         for (int l =1; l < 101; l++ ) {
            if (student[k] < student[l]) {
               min = student[k];
               k++;
               l++;
            }
         }
      }
      System.out.printf("학생들 중 가장 낮은 점수는 ", min);

      }
}
*/
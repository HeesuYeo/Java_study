/*
       국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에
       각 과목 점수, 평균 점수, 등급을 출력해주는 프로그램을 만들어보세요
       
        1. 90점 이상 A
          80점 이상 B
          70점 이상 C
          60점 이상 D
          그 외 F
        
        2. 유효한 점수 0 ~ 100점이다. (유효하지 않은 점수가 하나라도 있으면 F)
        
        3. 평균 점수는 소수 둘째 자리에서 반올림하여 저장
          
 */
package quiz;

import java.util.Scanner;

public class B03_answer {

   public static void main(String[] args) {
	   
      Scanner total = new Scanner(System.in);  // ctrl + shift + O -> import 실행시키기
      System.out.print("국어, 영어, 수학 점수를 입력해 주세요 >> ");
      
      double sum;
      int kor, eng, math;
      kor = total.nextInt();
      eng = total.nextInt();
      math = total.nextInt();
      
      //평균을 구한후 소수둘째자리까지 반올림
      sum = Math.round((kor + eng + math) / 3.0*100) / 100.0;
      //sum = ((kor + eng + math)/3);
      
      sum = Math.round(sum * 100) / 100.0;
      //1.234 1.23
      //123.4 123 1.23
      
      char grade;
      
      if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (math < 0 || math > 100)) {
         System.out.print("유효하지 않은 점수로 F 등급입니다");
         grade = 'F';
       } else if (sum >= 90) { 
         grade = 'A';
      } else if (sum >= 80) {
         grade = 'B';
      } else if (sum >= 70) {
         grade = 'C';
      } else if (sum >= 60) {
         grade = 'D';
      } else  {
         grade = 'F';
      }
      
      System.out.printf("국어 %d, 영어 %d, 수학 %d, 평균 %.1f, 등급 %c\n", kor, eng, math, sum, grade);
   }

}
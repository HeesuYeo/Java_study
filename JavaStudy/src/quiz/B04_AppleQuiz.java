package quiz;

import java.util.Scanner;

public class B04_AppleQuiz {

   /*
       사과를 10개씩 담을 수 있는 바구니가 있다
       
       사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
       바구니의 개수를 알려주는 프로그램을 만들어보세요.
    */
   public static void main(String[] args) {
      
      
//      Scanner sc3 = new Scanner(System.in);
//      
//      System.out.print("사과의 개수를 입력하세요 >> ");
//      
//      int apple2;
//      int bag;
//      
//      apple2 = sc3.nextInt();
//      
//      
//      if(apple2 < 10 || apple2 % 10 != 0) {
//         System.out.printf("바구니의 개수는 %d개입니다", (bag = apple2 / 10) +1);
//         
//      } else if(apple2 == 10) {
//         System.out.printf("바구니의 개수는 %d개입니다", bag = apple2 / 10);
//      }
//      
//         else if (apple2 > 10 || apple2 % 10 == 0) {
//         System.out.printf("바구니의 개수는 %d개입니다", bag = apple2 / 10);
//         
//      }
//
//   }
      Scanner sc = new Scanner(System.in);
      
      System.out.print("사과의 개수를 입력해주세요 >> ");
      
      int appleQty = sc.nextInt();
      int basketSize = 10;
      int answer;
      
      if(appleQty <= 0) {
    	  answer = 0;
      if (appleQty % basketSize > 0) {
         answer = appleQty / basketSize +1;
      } else {
         answer = appleQty / basketSize;
      }
      
      System.out.printf("필요한 바구니의 개수는 %d개 입니다.\n", answer);
}
}
}
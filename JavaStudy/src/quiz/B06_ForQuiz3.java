package quiz;

/*
  for 문을 사용해서 다음과 같이 숫자를 출력해 보세요 
 1. 0 3 6 9 12 ... 93 96 99
 2. -35 -28 -21 ... 0 7 23 ....35
 3. 100 200 300  ... 800 900 1000
 4. 100 99 98... 5 4 3 2 1 0 
 5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ...(30번)
 6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ...(30번)
 7. 7 77 777 7777 77777 .... 7777777777 
 */
public class B06_ForQuiz3 {

   public static void main(String[] args) {
	   
		// 1
		for (int i = 0; i < 100; i += 3) {
			System.out.printf("%s ", i);
		}
		System.out.println();

		// 2
		for (int i = -35; i <= 35; i += 7) {
			System.out.printf("%s ", i);
		}
		System.out.println();

		// 3
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 4
		for (int i = 100; i >= 0; i -= 1) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 5

		for (int i = 1; i <= 30; i += 1) {
			
			System.out.print("0 1 2 3 4 5 6 7 8 9 ");

			/*
			 for (int i = 0; i < 300; i ++ i) {
			 System.out.print(i % 10 + "");
			
			 for (int f = 1; f <= 30; f ++ i) 
			 for (int j = 0; f < 10; f ++ j)
			 System.out.printf("%3d",j);
			  */
		 }
		
		System.out.println();

	// 6

	for (int i = 1; i <= 30; i += 1) {
	
		System.out.print("10 9 8 7 6 5 4 3 2 1 ");

		/*
		for (int i = 0; i < 300; i ++ i) {
		System.out.print(10 - (i % 10) + "");
		
		// 숫자를 거꾸로 세는법
		for (int i = 0; i < 100; ++i) {
		System.out.print(100 - i + " ");
		*/
	}
	System.out.println();

	// 7
	for (int i = 1 ; i <= 1; i += 1) {
    System.out.print("7 77 777 7777 77777 777777 7777777 77777777 777777777 7777777777");
   
	}
	System.out.println();
   

   }
}
   // 최대값을 도달하면 - 가된다
   /*
    long num = 7;
    for (int i = 0; i < 15; i ++ i) {
		System.out.print("num + " ");
    	num = num * 10 +7;
    //
     String numStr = "7";
     
     for(int i = 0; i< 10; ++i)
     System.out.print(numStr + " ")
     numStr += "7";
         
     */
    
    

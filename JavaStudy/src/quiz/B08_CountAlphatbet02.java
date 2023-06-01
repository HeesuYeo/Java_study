/*
 	사용자가 문장과 검색할 문자를 입력하면 
 	해당 문장에 그 문자가 몇 회 등장하는지 알려주는 프로그램을 만들어보세요
 	(대/소문자 모두 세어야함, 대/소문자 모두 입력 가능
 	  
 	검색할 문장 >> I like ApplePie
 	문자 >> e
 	=> 'e'는 총 3회 등장 
 	
 	검색할문장 >> I like ApplePie
 	문자 >> E
 	=> 'e'는 총 3회등장
 */








package quiz;

import java.util.Scanner;

public class B08_CountAlphatbet02 {

	public static void main(String[] args) {

		Scanner alpab = new Scanner(System.in);
		
		System.out.println("문장을 입력하시오 : ");
		String text;
		text = alpab.nextLine();
		
		System.out.println("찾을 알파벳을 입력하시오 : ");
		String sent1;
		sent1 = alpab.next();
		
		int count = 0;
		
		
		
		for (int index = 0, len = text.length(); index < len; ++index) {
		if(text.charAt(index) == sent1.charAt(0) || text.charAt(index)  == sent1.charAt(0)) { 
		//String 을  charAt로 꺼내서 비교한다
		
		count++;  
		}
		System.out.printf("%d가  %d회 등장했습니다\n ",index);
		
	
	
		//System.out.printf("해당문장에서 %d은 %d회", sent1,count);
	}	
	}
	
}

	/*
	public class B08_CountAlphabetSol2 {
   
   /*
    사용자가 문장과 검색할 문자를 입력하면 해당 문장에 그 문자가 몇회 등장하는지
    알려주는 프로그램을 만들어보시오 (대 / 소문자 모두 세어야하고, 입력도 가능)
    
    
   /*
    * 답
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("검색할 문장 >> \n");
      String text = sc.nextLine(); 
      
      System.out.print("문자 >> \n");
      char keyword = sc.next().charAt(0);
      
      char keyword1 = 0, keyword2 = 0;
      
      // 검색어에 대한 검사
      // - 입력한 검색어가 소문자일때 -> 대문자도 키워드에 등록
      // - 입력한 검색어가 대문자일때 -> 소문자도 키워드에 등록
      if(keyword >= 'a' && keyword <= 'z') {
         keyword1 = keyword;
         keyword2 = (char)(keyword - 32);
         
      }else if(keyword >= 'A' && keyword <= 'Z') {
         keyword1 = (char)(keyword + 32);
         keyword2 = keyword;
      }
      
      int len = text.length();
      int count = 0;
      for(int i = 0; i < len; ++i) {
      //   System.out.printf("[%d번째 문자]%c, 검색어 - %s\n", i, text.charAt(i), keyword);
         
         char ch = text.charAt(i);
         
         if (ch == keyword1 || ch == keyword2) {
            ++count;
            

         }

      }
      System.out.printf("등장횟수: %d\n", count);
      
      
      
   }


}
		
	
	 
	 
	 }
	 
	} 
	 
	*/
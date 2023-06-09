package quiz;

import java.util.Scanner;

public class B08_02answer {
   /*
       사용자가 문장과 검색할 문자를 입력하면
       해당 문장에 그 문자가 몇 회 등장하는 지 알려주는 프로그램을 만들어보세요
       (대/소문자 모두 세어야 함, 대/소문자 모두 입력 가능)
       
       검색할 문장 >> I like ApplePie
       문자 >> e
       -> 'e'는 총 3회 등장
       
       검색할 문장 >> I like ApplePie
       문자 >> i
       -> 'i'는 총 2회 등장
          
    */
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
            
      System.out.println("검색할 문장을 입력해주세요 >> ");
      String text = sc.nextLine();
      
      // 입력받은 문자열의 첫 번째 글자가 검색어
      System.out.println("검색할 문자는 무엇입니까 >> ");
      char keyword = sc.next().charAt(0);
      
      char keyword1 = 0, keyword2 = 0;
      
      // 검색어에 대한 검사
      // - 입력한 검색어가 소문자일 때 -> 대문자도 키워드에 등록
      // - 입력한 검색어가 대문자일 때 -> 소문자도 키워드에 등록
      if (keyword >= 'a' && keyword <= 'z') {
         keyword1 = keyword;
         keyword2 = (char)(keyword - 32); // A : 65, a : 97
      } else if (keyword >= 'A' && keyword <= 'Z') {
         keyword1 = (char)(keyword + 32);
         keyword2 = keyword;
      } else {
         System.out.println("검색어가 알파벳이 아닙니다...");
      }
      
      // sc.next(); 단어 단위(공백, 탭)로 입력받음
      // sc.nextLine(); 줄 단위로(\n)
      
      // System.out.printf("문장 : %s, 검색어: %s\n", index, keyword);

      int len = text.length();
      int count = 0;
      
         for (int i = 0; i < len; ++i) {
            char ch = text.charAt(i); //이번에 검사할 문자
            
            if (ch == keyword1 || ch == keyword2) {
               System.out.printf("[%d번째 문자]%c, 검색어 - %s\n",
                     i, text.charAt(i), keyword);
               System.out.println("맞는 문자를 찾았습니다 (카운트 1증가)");
               ++count;
            }
            
         }
         System.out.printf("등장횟수 %d\n",count);
   }
}



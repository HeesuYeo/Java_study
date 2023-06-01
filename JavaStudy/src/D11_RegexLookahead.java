

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D11_RegexLookahead {
   /*
       # 정규표현식 Lookahead
       
        - 특정 정규표현식 앞에 있는 패턴을 잡아낼 수 있는 방식
        - 잘 응용하면 반드시 포함시키는 규칙을 만들어낼 수 있다
        
           apple(?=regex)  : regex 앞에 있는 apple을 찾아라
           apple(?!regex)  : regex 앞에 오지 않는 apple을 찾아라
           apple(?<=regex) : regex 뒤에 오는 apple을 찾아라
           apple(?<!regex) : regex 뒤에 오지 않는 apple을 찾아라
    */
   public static void main(String[] args) {
      
      // step 1
      String text = "apple@ @apple apple@ @apple apple@ @apple";
      
       Pattern frontApple = Pattern.compile("apple(?=@)");
      // Pattern frontApple = Pattern.compile("apple@");
      
      Matcher frontMatcher = frontApple.matcher(text);
      
      while (frontMatcher.find()) {
         System.out.println("found: " + frontMatcher.group());
         System.out.println("start: " + frontMatcher.start());
         System.out.println("end: " + frontMatcher.end());
      }
      
      // step 2
      String text2 = "apple";
      String frontRegex2 = "app(?=l)e"; // 안됨
      String frontRegex2_1 = "app(?=l)le"; //됨 검사와 다음 문자 찾는 것은 별개다
      
      System.out.println("# test2");
      System.out.println(Pattern.matches(frontRegex2, text2));
      
      // step 3
      String text3 = "Hello, agcd1234!!!";
      String frontRegex3 = "(?=\\d)2"; // 2는 자기 자신. 자기 자신이 2가 되어야 한다
      
      Pattern pattern3 = Pattern.compile(frontRegex3);
      
      Matcher matcher3 = pattern3.matcher(text3);
      
      System.out.println("# test3\n"); 
      while (matcher3.find()) {
         System.out.println("found: " + matcher3.group());
         System.out.println("start: " + matcher3.start());
         System.out.println("end: " + matcher3.end());
         System.out.println("------------------------------");
      }
   }
}
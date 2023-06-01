/*
 1.한문자씩 꺼내면서 숫자인지 검사
 2.긑가지 검사시 모두 숫자면 true
 3.중간에 숫자가 아닌것을 만나면 false
 */
package quiz_answer;

public class B09_numericanswer {

	public static void main(String[] args) {
		String test = "12345a";
		boolean numeric = true;
		
		for (int i = 0; i < test.length(); ++i) {
			char ch = test.charAt(i);
			
			if (ch < '0' || ch > '9') { 
			numeric = false;
			
				break;            
					
	}
		}
		  System.out.println("결과 : " + numeric );
}
}
            
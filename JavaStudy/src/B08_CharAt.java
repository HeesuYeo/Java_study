/*
 	 # "문자열" .chatAt(index);
 		
 	- 해당 문자열에서 원하는 인덱스의 문자를 char타입으로 꺼내는 함수
 	- 첫 번째 문자는 0번인덱스
 
 	 # "문자열" .length();
 
 	 - 해당 문자열이 몇 글자인지(길이가 얼마인지) int타입으로 알려주는 함수
 	 - 문자열의 마지막 인덱스는 '길이 -1' 이다
  
 
 */




public class B08_CharAt {

	public static void main(String[] args) {
		
		String msg = "Welcome to my homepage!!";
		System.out.println("글자의 길이" + msg.length());
		
		System.out.println(msg.charAt(0));
		System.out.println(msg.charAt(1));
		System.out.println(msg.charAt(2));
		System.out.println(msg.charAt(3));
		System.out.println(msg.charAt(4));
		System.out.println(msg.charAt(5));
		System.out.println(msg.charAt(6));
		
		
		// 길이 -1이 마지막 글자
		
		int len = msg.length();
		
		System.out.println(msg.charAt(len - 1));
		System.out.println(msg.charAt(len - 2));
		System.out.println(msg.charAt(len - 3));
		// for문을 통해 문자열의 모든 문자를 쉽게 꺼낼수있다
		
		for(int index = 0; index < msg.length(); ++index) {
			System.out.printf("%d번째 글자 :  %c\n", 
					index, msg.charAt(index));
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

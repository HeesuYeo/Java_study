
public class A01_escape {

	public static void main(String[] args) {
		
	/*
	 	#Escape 문자
	 	
	 	- 특수한 기능을 가진 문자
	 	
	 	- 그냥 출력하기에 문제가 있는 문자들을 표현하기 위한 방식
	 	
	 	- \와 하나의 문자가 합쳐져서 특수한 기능을 한다
	 	
	 	- \ 와 + 문자인 두 문자가 하나의 문자로 인식 된다 
	 	
	 	- 중괄호 안에들어오면Tap키를 1번씩 해준다
	 */
		
		
		// \n : 줄 바꿈의 기능을 가진 특수 문자
		
	System.out.println("안녕하세요 반갑습니다");
	System.out.println("안녕하세요 \n반갑습니다");
	
	// \t Tap기능을 가진 특수 문자 (그냥 넣어도 기능수행 하지만 스페이스바와 구별 힘듬)
	
	
	System.out.println("안녕하세요 \t반갑습니다");
		
	// \\ : Escape문자의 기능을 사용하지않고 
	//      그냥 역슬래시를 출력 하고 싶을 때 사용한다
	System.out.println("안녕하세요\\반갑습니다");
	System.out.println("C:\\JaveFullStack\\eclipse\\note");
	
	// \" : 그냥 큰따옴표를 출력 하고 싶을때 사용하는  특수 문자
	System.out.println("오늘 저녁은 \"피자\" 을 먹는다");
	
	//  \' : 그냥 작은 따옴표를 출력 하고 싶을때 사용하는  특수 문자
	System.out.println("오늘 저녁은 \'피자\' 을 먹는다");
	System.out.println('\'');
	//Ex
	System.out.println("A");
	System.out.println("   ");
	System.out.println("\n ");
	
}
}
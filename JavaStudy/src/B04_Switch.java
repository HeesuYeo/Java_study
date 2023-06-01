/*
	  switch_case 문
	  
	  - ()안에 연산 결과에 따라 실행할 코드를 결졍하는 문법
	  - ()안에 boolean 타입 대신 다른 타입을 사용해야한다
	  - if문으로 완벽하게 대체 가능하기때문에 자주 사용하는 편은 아니다
	  - break를 적지 않으면 다음 break를 만날때까지 
	   	밑에있는 모든 break를 실행한다
	  - default 는 if문의 else같은 역할을 한다
	  - ()안에 값에 해당하는 case가 없는 경우 default를 실행 
 */

public class B04_Switch {
	
	public static void main(String[] args) {

		int a = 0;
		// 최신 JDK버젼에서는 case에 , 을 사용할수있지만 옛날 JDK에선 불가능
		switch (a) {
		case 0:
			System.out.println("a가 0일때 실행되는 문장");
		case 1:
			System.out.println("a가1");

		case 3:
			System.out.println("a가2");

		case 4:
			System.out.println("a가3");
							
			
		/*
		 
		 
		 int a = 0;
		 
		최신 JDK버젼에서는 case에 , 을 사용할수있지만 옛날 JDK에선 불가능
		이런식으로사용
		switch (a) {
		case 0: case 13: case 50: ...
		System.out.println("a가 0일대 실행되는 문장");
		System.out.println("a가 0일대 실행되는 문장");
		System.out.println("a가 0일대 실행되는 문장");

		  
		  
		 */	
			
			
			
			
			
		}	
		
		String user_input = "qult";

		switch (user_input) {
		case "qult", "exit":
			System.out.println("종료");
			break;

		case "next", "play":
			System.out.println("진행");
			break;

		case "add":
			System.out.println("데이터 추가");
			break;

		default:
			System.out.println("명령어아님");
			break;

		}
	}
}

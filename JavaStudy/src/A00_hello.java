/*
      
	// # 주석 (comment)
	 
	 - 개발자가 하고 싶은 말을 적어 놓는 곳
	 - 컴파일시에 무시되기 때문에 프로그램 실행에 영향 미치지 x
	 - 언어별로 주석을 사용하는 방법이 다를 수 있다
	 - 한 즐 주석(//)과 여러 줄 주석 이 있다
	 /*여러 줄
	   주석
	 - 
	 # Windows 단축키
	 - [win] : 시작 
	 - [win] + E : 탐색기
	 - [win] + 방향키 : 창크기 조절
	 - [win] + Shift + s : 스샷 
	 - [Ctrl] + [+,-] = 글씨 크기 조절 
	 
	#Eclipse 단축키
	 - [Ctrl] + [+,-] 글자 크기조절
	 - [Ctrl] + M : 현재창 최대, 최소화
	 - [Ctrl] + f11 : 소스 코드 컴파일 및 실행 (빌드)
	 - [Alt] + 위,아래 : 줄 이동 
	 - [Tap] : 들여쓰기
	 - [Shift] + [Tap] : 거꾸로 들여스기
	 - [Ctrl] + Z : 방금 했던거 취소하기
	 - [Ctrl] + Y : 방금 취소 했던 것 다시하기 
	 - [Ctrl] + [Alt] + 방향키 : 현재줄 붙혀넣기
	 # 블록지정 단축키
	 
	 - home키 : 커서를 현재 줄 맨 앞으로 이동
	 - End키 : 현재 줄 맨 뒤로 이동
	 - Insert 키 : 커서의 모드를 수정/삽입(덮어쓰기) 모드로 전환
	 - p~up,p~down키 : 줄이동
	 - [Shift] + 방향키 : 커서를 이동하여 원하는 만큼 블록지정
	 - [Shift] + home : 현재 커서를 이동하여 원하는 만큼 블록지정
	 - [Shift] + End : 현재 커서 위치부터 멘 뒤까지 블록지정
	 - [Ctrl] + A : 전체 블록지정
 	 - [Ctrl] + c : 복사
	 - [Ctrl] + x : 잘라내기
	 - [Ctrl] + w : 복사,잘라낸것을 붙혀넣기
*/	 
public class A00_hello {
	// ※  public class 의 이름은 반드시 파일명과 같아야 한다
	//    Eclipse에서 빨간 줄이 생겼을 때(에러) 그곳에 커서를 두고 f2를 누르면
	//    해당 에러에 대한 해결책을 볼 수 있다 
	//    .Java 소스 코드 파일이다	
	public static void main(String[] args) {
		// - 프로그램 시작시 가장 먼저 도착하는 곳
		/*
		  # main() 함수
		- Java에서 어떤 단어 뒤에()가 있으면 함수{메서드}라고 한다
		- main() 함수는 프로그램의 시작 지점
		- 사용자가 프로그램을 실행하면 가장 먼저 main() 함수를 찾아서 실행한다
		- main() 함수가 종료되면 프로그램도 종료 된다
		- main() 함수에 오타가 있으면 프로그램 시작지점을 찾지 못한다
		- main() 함수의 범위는 {}로 지정한다
		 
		- # System.out.println () 함수
		- ()안에 전달한 데이터를 콘솔 화면에 출력하는 함수 
		*/
		System.out.println("Hello, world!");
		System.out.println("Hello, world!");
		System.out.println("Hello, world!");
		System.out.println(10 + "10");
		
		// 프로그램의 끝
		
		/*		
		 # 콘솔 (Console)
		  - 글자만 나오는 환경의 화면 (Command Line interface)
		    GUI : 그래픽 사용자 인터페이스(graphical user interface, GUI)
		    CLI : 명령줄 인터페이스 (command-line interface, CLI) ex)cmd
		    Eclipse 에서는 테스트용 콘솔을 제공해준다
		    
		  - 우리가 만든 프로그램은 실제 콘솔에서도 동일하게 동작한다
		    (cme, cd, java...)
		    
		  - 제작한 소스코드 (.java)의 컴파일 결과(.class)는
		    프로젝트 내부의 bin폴더에 저장된다
		    
		  # 세미콜론(;)
		  
		  - 한 명령어가 끝났음을 컴파일러에게 말하는 문자
           
           # 자바의 데이터 종류 (리터럴의 종류)
           
           1. " " 사이에 적는 것 : 문자열 (String), 문자를 여러개 적을 수 있다
           2. ' ' 사이에 적는 것 : 문자 (character) 문자를 하나 만 적을 수 있다
           3. 숫자를 적는 것 : 정수(integer); 계산 가능
           4. 소수를 적는 것 : 실수(Float, double) 계산가능
           5. true, false : 참/거짓 (boolean)
           
           // 문자열과 다른 타입을 + 하면 이어붙인다
              system.out.println(10 + 10); = 20
              system.out.println((10*10) + "원"); = 100원 * 괄호 먼저 계산한다
              system.out.println((10*10) + "원"); = 100원 * 괄호 먼저 계산한다
               
           // 
           
           
           
		  */
		  
	}
	
	
}

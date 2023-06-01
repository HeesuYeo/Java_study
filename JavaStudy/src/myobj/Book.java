package myobj;
// book 클래스 : 설계도 역할		
// public class의 이름은 .java 파일명과 같아야함

public class Book {
	// public : 다른 패키지에서도 사용 할 수 있게 함
	
	/*
	  	# 클래스의 인스턴스 변수 (aka 멤버변수,필드,속성,상태,컬럼...)
	 
	  	- 해당 클래스의 인스턴스가 생기면 각 인스턴스 마다 
	  	  다른 값을 가질 수 있는 변수들
	  	- 주로 해당 클래스의 상태를 표현하기 위해 사용한다    
	 */
	public int page;
	public int currPage;
	public int price;
	 /*
	  	 # 인스턴스 메서드
	  	 
	  	  	- 각 인스턴스에만 영향을 미칠 수 있는 메서드
	  	  	- 각자의 인스턴스 변수에 접근 할 수 있다
	  */
	public void nextPage() {
		currPage += 1; 
	}
	public void prePage() {
		currPage -= 1; 

	}
}


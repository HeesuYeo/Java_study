import myobj.Apple;
import myobj.Book;
import myobj.Car;
import myobj.Human;
import myobj.Subway;

/*
 	#	객체지향 프로그래밍 (Object Oriented Programming)
 		
 		- 변수와 함수들을 세상에 존재하는 개념으로 묶어서 사용하는 
 		  프로그래밍 방법론
 		  
 		- 변수와 함수들을 무분별하게 사용하는것보다 현실에 존재하는
 		  객체 단위로 묶어서 표현하는 것이 개발자들의 업무 효울을 높인다
 	
 		- 변수는 현실에 존재하는 객체의 상태를 나타낸다
 		  Ex) color, name, age ...
 		
 		- 해당 객체의 상태를 변화시킬 수 있는 객체 내부의 함수들을
 		  매서드라 부른다
 		  
 		  Ex) 책(book)
 		   		- 책의 상태 (변수)  : 전체 페이지, 현제 페이지, 눌림정도
 		   		  				  각페이지의 낙서여부, 각페이지의 메모 내용, 가치
 		   		                  원래 가격, 감가상각
 		   		  
 		   		- 책의 기능 (메서드) : 페이지를 넘기는 기능(몇 페이지 넘길지) 
 							      해당 페이지에 메모하는 기능
 							      형광펜을 칠하는 기능, ...
 							
	#   클래스 (class)
		
		- 객체지향 프로그래밍의 객체를 프로그래밍 언어로 표현한 문법
		
		- 클래스는 해당 객체의 설계도 역할을 한다
		
		- 클래스는 정의한 시점에서는 실체(인스턴스)가 없다 
		
		- 클래스라는 설계도를 통해 만들어내는 실제 객체를
		 '인스턴스(instance)' 라고 한다
		  클래스 인스턴스 new 클래스
		  
		- 클래스를 통해 인스턴스를 생성할 때 new를 사용한다
		
		- 같은 패키지 내부에는 같은 이름의 클래스를 정의 할 수 없다					
 */
public class C03_oop {

	public static void main(String[] args) {
		// new를 통해 인스턴스를 찍어낼수있다 
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.page = 350;
		book1.currPage = 10;
		book1.price = 35000;
		
		book1.nextPage();
		book2.nextPage();
		System.out.println(book1.price);
		System.out.println(book2.price);
		
		Human a = new Human(0,0,0);
		Human b = new Human(0,0,0);
		
		a.age = 123;
		a.height = 120;
		a.weight = 70;
		
		b.age = 123;
		b.height = 123;
		b.weight = 78;
		 //this는 누구를 타고 들어왔냐 (경로)에 따라 달라진다.
	
	      a.info1();
	      System.out.println("----------------");
	     
	      b.info1();
	      System.out.println("----------------");
	      
		System.out.println("사람의 나이는 : " + a.age );
		System.out.println("사람의 키는 : " + b.height);
	
		
		 Car truck = new Car();
	      
	      truck.weight = 3000;
	      truck.accSpeed = 5.2;
	      
	      truck.tackle("고라니");
	      
	      truck.acceleration();
	      truck.acceleration();
	      truck.acceleration();
	      
	      truck.tackle("고라니");
	      
	      Subway one = new Subway();
	      Subway two = new Subway();
	      
	      one.line = 1;
	      two.line = 2;
	      
	      // 배열의 메모리 할당이 되지 않아 사용할 수 없는 방식
	      // one.stations = {"시청", "종각", "종로3가"};
	      
	      // 배열의 메모리 할당과 초기화를 동시에 진행하는 방식
	      one.stations = new String[] {"시청", "종각", "종로3가", "종로5가"}; // new String[] 을 써줘야 한다
	      two.stations = new String[] {"당산", "합정", "홍대입구", "신촌", "이대"};
	      
	      two.rotate = true;
	      two.direction = true;
	    
	      
	      for (int i = 0; i < 10; ++i) {
	         one.information();
	         one.next();
	         
	      } // 시청에서 종로5가로 왔다갔다
 /*
	      one.information();
	      one.next();
	      one.information();
	      one.next();
	      one.information();
*/	   
		}
	}
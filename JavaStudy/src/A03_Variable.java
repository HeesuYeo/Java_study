/*
	  #  변수 (variable)
	  
		   - 프로그래밍 언어에서 데이터를 저장해 둘 수있는 공간
		   
		   - 자바에서 변수는 반드시 선언한 뒤에 사용 해야함
		   
		   - 값을 한번도 대입한적 없는 변수는 서용하려면 에러가 발생한다
		   
		   - "초기화"(initialization) 하지 않은 변수는 사용할 수 없다 *초기화 : 처음 변수값을 지정해주는것 *
		   
		   - 같은{} 내부에서 같은 이름의 변수를 여러번 선언 할 수 없다
	   
	   # 변수의 선언 (declare)
	   
		    - 타입 변수형;
		    
		   	- 타입 : 해당변수에 저장할 데이터의 타입을 지정한다
		   	
		   	- 해당 변수에 어떤 타입의 데이터만 저장 할 것 인지 결정하는 것
		   	 (Str-문자열, int - 정수... ect)
		   	 
		   	- 변수형 : 사용하고 싶은 변수의 이름을 저징힌다 
	   	
	   # 대입 연산 (=)
	   
	    - 원래 알고 있던 =의 의미: 왼쪽과 오른족의 값이 같다 (비교)
	    
	    - 프로그래밍 언어에서 = 의 의미 : 왼쪽의 변수에 오른쪽의 값을 넣어라 (대입)
	    
 */

public class A03_Variable {
	
	
	
	
	
	public static void main(String[] args) {
		
		// int : 이 변수에는 정수만 담을 수 있다	
		int age = 25;
		int price = 1350;
		String name = "아이언맨";
		
		// 변수의 값은 대입연산을 통해 바꿀 수 있다, 원래 있던 값은 무시한다
		
		age = 33;
		
		System.out.println(age);
		System.out.println(age + age);
		System.out.println(age * 3);
		System.out.println(name);
		System.out.println(price);
		//변수를 선언과 동시에 초기화
		int grape_price = 2000;

		
		//변수를 선언만하고 나중에 초기화
		int grape_qty;
		grape_qty = 8;
		//위에서 선언한 변수를 이용해 초기화
		int grape_total_price =  grape_price * grape_qty;
				
		System.out.println("포도의 개수 : " + grape_qty + "개 입니다");
		System.out.println("포도의 개당가격 : " + grape_price + "개 입니다");
		System.out.println("포도의 총가격 : " + grape_qty * grape_price +  "입니다");
		
		{
		// {} 내부에서 선언된 변수는 해당 {}를 벗어나면서 사라지게 된다
	    int apple = 100;
	    {
	    int orange = 30; 
	    
	    System.out.println(orange);
		}
	}
		//orange는 {}가 끝나면서 사라졌기 때문에 다시 선언할 수없다  
	    int orange = 123;
	    int apple = 123;
	    //apple는 {} 내부에 선언한 것이 아니기 때문에 이름이 겹친다
		//int apple = 123;
	}
}
	
	




public class A05_Varnaming {
	/*
	 	#우리가 변수를 사용하는 이유
	 	
	 	1. 가독성을 높일 수 있다
	 	
	 	2. 여러곳에서 사용되는 값을 한번에 변경 할 수있다
	 	
	 	
	 	#변수 작명 규칙
	 	
	 		(권장)
	 		1. 두 단어 이상 이어붙이 변수명을 사용할때 _를 사용한다 (snake_case)
	 		   ex)apple_case
	 		  
	 		2. 두 단어 이상을 이어붙인 변수명을 사용 할 때 대문자를 사용한다 (camel case)
	 		   ex) applePrice, appleWeight
	 		    
	 		3. 변수명의 첫 글자는 소문자를 사용해야 한다 상수 값에는 모두 대문자(변하지 않는 값)
	 		
	 		4. 프로그램 내에서 프로그램이 꺼질때 까지 변하지 않을 값은 모두 대문자를 사용한다
	 		   ex)MAX_WEIGHT, MAX_QTY, PI 
	 		
	 		5. 클래스 명은 첫 글자를 대문자를 사용한다 
	 		  (이름만으로 클래스와 변수를 구분하기 위한 장치)
	 		  
	 		6. 패키지 명은 모두 소문자를 사용한다  
	 		  (이름만으로 클래스와 변수를 구분하기 위한 장치)
	 		  
	 		7. 해당 변수의 목적이나 들어있는 값을 쉽게 파악 할 수있는 단어를
	 		   변수명으로 사용해야 한다
			
			(필수)
			
			1. 변수의 첫 번쨰 글자는 숫자를 사용 할 수 없다
			EX) 7eleven
			
			2. 변수명 사이에는 공백을 사용 할 수 없다
			
	 		3.특수문자는 _,$만 사용 할 수있다	
	 		  ex)$APPLE
	 		  
	 		4. 이미 자바에서 사용하고 있는 키워드(예약어)들은 변수명으로 사용 할 수 없다
	 		(Eclipse에서 예약어들은 보라색,주황색?으로 표시된다)
	 		Ex)piblic, boid, static, int, double...
	 		
	
	 */

	public static void main(String[] args) {
		int apple = 19;
		int	apple_price = 483;
		double apple_weight = 123.47;
		
		System.out.println("사과의 개수 : " + apple);
		System.out.println("사과의 총 가격(￦) " + apple * apple_price + "원");
		System.out.println("사과의 총 무게(g): " + apple * apple_weight + "g");
		System.out.println("사과의 g당 가격 : " + 
		(apple * apple_price) / (apple * apple_weight));
		
		//두번 이상 사용할 경우 변수를 쓰는것이 좋다
	}

}

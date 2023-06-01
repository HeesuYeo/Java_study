
public class B02_Operator02 {

	public static void main(String[] args) {
		
		/*
		  # 비교연산자
		  
		  - 두 값을 비교하는 연산
		  - 비교 연산자의 결과는 항상 참(true), 거짓(false)이다
		  	(비교 연산의 결과는 boolean 타입이다) 
		  - 산술,비교연산이 함께 있으면 산술연산 먼저 계산한다
		
		# 논리 연산자 
		 
		  - 두 boolean 타입 값을 연산
		  - && : 양 옆의 두 값이 모두 true [and]
		  - || : 둘 중 하나만 true여도 true [or]
		  - !  : true면 false, false면 true [not]
		  
		 */

		
		int a = 10, b = 7;
		
				
		System.out.println(a < b);
		System.out.println(a * b < a + b); //괄호 없어도 산술먼저
		
		System.out.println(a > b); //왼쪽 true
		System.out.println(a < b); // 오른족 true
		System.out.println(a >= b);//오른쪽 크거나 같으면 true
		System.out.println(a <= b);//왼쪽 크거나 같으면 true	
		System.out.println(a == b);// 같으면 true
		System.out.println(a != b);// 다르면 true

		System.out.println(a + 5 < 20);
		System.out.println(a % 3 == 0); // a가 3의 배수일 때 true 
		System.out.println(a % 3 != 0); // a가 3의 배수가 아닐때 true 
		
		System.out.println("###AND###");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("###OR###");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("###NOT###");
		System.out.println(true);
		System.out.println(false);
		
		
		
		a = 35;
		System.out.println(a < 100 && a % 5 == 0 );
		
	}

}

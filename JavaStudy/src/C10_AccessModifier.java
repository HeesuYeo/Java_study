/*
 	
 	# 접근 제어자 (AccessModifier)
 		
 		-다른 클래스에서 해당 자원을 사용하려고 할 때 허용 범위를 설정 
 	
 	# 종류
 		
 		- public	: 다른 패키지 에서도 자유롭게 접근 
 		
 		- protected	: 다른 패키지에서는 상속 받은경우	
 		
 		- default	: 다른 패키지에서는 접근 x
 		
 		- private	: 같은 클래스 내부에서만 접근 ㅇ
 		
 	# 용도
 	 
 		- 내가 만든 클래스에서 다른 패키지에서도 보였으면 하는자원과
 		
 		- 보이지 않았으면 하는 자원을 설정하여 
 		  해당 클래스를 원래 의도대로 사용 할 수 있게 한다
 */
public class C10_AccessModifier extends quiz.C10_AccessModifierTest {

	public C10_AccessModifier() {
		System.out.println(super.a);
		System.out.println(super.b);
		//defult는 상속받아도 다른 패키지에서 사용 불가능
		
		//System.out.println(super.c);
		
		//상속 받아도 private는 사용불가능
		//System.out.println(super.d);
	}
	
	
	
	public static void main(String[] args) {
		
		C10_AccessModifierTest test1 = new C10_AccessModifierTest();
		
		System.out.println(test1.a); // public 사용가능
		System.out.println(test1.b); // pretected 사용가능
		System.out.println(test1.c); // default 사용가능
		//System.out.println(test1.d); // private 사용불가능
		
		//다른 패키지의 다른 클래스를 가져다 사용하는 경우 
		quiz.C10_AccessModifierTest test2 = new quiz.C10_AccessModifierTest();
		
		System.out.println(test2.a); 	//public 사용가능
		//System.out.println(test2.b); 	//pretected 사용불가능
		//.out.println(test2.c); 		//default 사용불가능
		//System.out.println(test2.d); 	//private 사용불가능
		
		
		
	}
}

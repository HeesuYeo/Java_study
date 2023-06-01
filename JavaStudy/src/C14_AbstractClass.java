/*
	# 추상 클래스 (Abstract Class)
	
		- 클래스의 형태만 만들고 자세한 구현은 자식 클래스에게 미루는 클래스
		
		- 추상클래스를 상속받은 자식 클래스는 반드시 
		  내부에 추상메서드를 오버라이드 해 구현을 마무리 지어야 한다
			
		- 추상클래스는 인스턴스화 불가능(아직 미완성이기 때문)
 
	# 추상 메서드 (Abstract method) // myobj2
	
		- 선언만 해놓고 구현 내용은 없는 메서드
		
		- 자식 클래스에게 오버라이드를 강제 할 수 있음
 */
import myobj3.Animal;
import myobj3.Lion;
import myobj3.Shark;

public class C14_AbstractClass {

	public static void main(String[] args) {
		
		//Animal a1 = new Shark();
		Animal a2 = new Lion();
		
		//a1.bite();
		a2.bite();
	}

}

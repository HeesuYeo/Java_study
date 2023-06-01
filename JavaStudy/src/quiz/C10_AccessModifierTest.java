package quiz;

public class C10_AccessModifierTest {
	
	public int a = 10; // 다른 패키지에서도 접근가능
	
	protected int b = 11; // 이클래스를 상속받으면 다른패키지 에서도 접근 가능
	
	int c = 12; // default. 다른 패키지 에서는 접근 불가능 
				// 같은 패키지에서는 자유롭게 접근 가능
	
	private int d = 13; // 이클래스 내부에서만 사용가능

	public static void main(String[] args) {
		

	}

}

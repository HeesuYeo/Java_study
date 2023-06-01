/*
	# 인스턴스 생명주기
 
 		1. 해당 클래스 첫 실행시 스태틱 관련 자원들 메모리할당
 		
 		2. 인스턴스 관련 자원들 메모리 할등
 		
 		3. 생성자 실행
 */
public class C13_InstanceLifeCycle {

	static class TestClass {
		static String b = "abc";
		int a = 10;

		// 스태틱 블록
		static {
			System.out.println("스태틱 블록이 실행 되었습니다 " + b);
		}

		// 인스턴스 블록
		{
			System.out.println("인스턴스블록이 실행 되었습니다 " + a);
		}

		public TestClass() {
			System.out.println("생성자 실행");
		}

		void doSomething() {
			System.out.println("hello,world!");
		}
	}

	public static void main(String[] args) {
		// 스태틱 블록은 첫 인스턴스 생성시에만 실행

		TestClass test = new TestClass();
		TestClass test2 = new TestClass();

		TestClass instance = new TestClass();

		instance.doSomething();
	}

}

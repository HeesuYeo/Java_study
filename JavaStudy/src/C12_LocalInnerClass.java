/*
	# 지역 내부 클래스
	
 		- 메서드 내부에도 클래스를 만들 수 있다
 		
 		- 해당 메서드가 끝나고 나면 사용 할 수 없는 메서드 
 		
 		- 메서드 밖에서는 무슨짓을 해도 가져다 사용 할 수 없다
 		
 		
	# 익명 지역 내부 클래스
		
		- 메서드 내부에서 이미 존재하는 클래스를 바로 수정하며 사용하는 방식
		
		  (생성과 동시에 상속) 
 */
import myobj2.Electronics;

public class C12_LocalInnerClass {

	public static void main(String[] args) {
		// 일반적인 지역 내부 클래스
		class Grape {
			int qty;
			String grade;

			@Override
			public String toString() {
				return grade + "등급 포도";
			}
		}
		Grape g = new Grape();

		g.qty = 33;
		g.grade = "A+";

		System.out.println(g);

		// 익명 지역 내부 클래스 (한번 쓰고 버릴 1회용 클래스) * 업캐스팅에 많이 사용

		Electronics e = new Electronics("에어컨", 149);
		Electronics e2 = new Electronics("전자랜지", 123) {

			// Electronics 클래스를 마음대로 수정가능
			// => 즉시 상속받아서 오버라이딩이 가능
			@Override
			public void start() {
				System.out.println("안에 들어있는 것을 돌리기 시작합니다.");
			}
		};

		e.start();
		e2.start();
	}
}
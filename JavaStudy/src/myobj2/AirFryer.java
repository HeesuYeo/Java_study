package myobj2;

public class AirFryer extends Electronics {
   
	public AirFryer() {
		super("에어 프라이어", 45000);
	}

	public void start() { // 오버라이드
		System.out.println("음식을 뜨거운 바람으로 조리하기 시작했습니다");
	}

}
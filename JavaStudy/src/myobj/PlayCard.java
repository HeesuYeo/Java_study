package myobj;

public class PlayCard {
	// 각 인스턴스가 자기만의 공간을 가지고 사용한다 (인스턴스 영역)
	
	char suit;
	int num;
// 같은 클래스로 만들어진 모든 인스턴스가 함게 사용하는 공간(스태틱 영역)	
public static int width = 100;
public static int height = 200;
// static 메모리절약
//width너비 height높이
//바뀌지않는값 (정적)
	
	public PlayCard(char suit, int num ) {
		this.suit = suit;
		this.num = num;
		
	}
	//static 메서드에서는 인스턴스 영역의 자원을 사용 할 수 없다
	// -> static 메서드는 static 자원만 활용 할 수 있는 메서드를 의미
	// this도 현재 인스턴스를 뜻하기 때문에 사용 할 수 없다
	
	public static void changeCardSize(int width, int height ) {
		PlayCard.width = width;
		PlayCard.height = height;
	}
	public void info() {
		System.out.printf("[%c%d] w: %d, h:%d\n", 
				suit,num,width,height);
	}
	
	
	
	
}

/*
  	# static (정적 영역, 클래스 영역 <=> 인스턴스 영역)
  		
  		- 같은 클래스의 모든 인스턴스들이 함께 사용하는 공동 영역을
  		  정적영역 (클래스 영역) 이라함
  		  
  		- 앞에 static이 붙은 자원들은 모든 인스턴스가 함께 사용하는
  		  공동 자원이된다
  		  
  		- static 영역의 자원은 아무리 많은 인스턴스가 있어도
  		  클래스당 하나이기 때문에 클래스 이름에 . 을 찍고 사용 할 수 있다
  		  Ex) Math.pow(), Math.random())  
 */
import myobj.CoffeeBean;
import myobj.PlayCard;
import myobj.Truemanshow;

public class C05_Static {

	public static void main(String[] args) {
		
		System.out.println(PlayCard.width);
		System.out.println(PlayCard.height);
		
		System.out.printf("트루맨쇼의 온도는 : %d 구름개수는 %d 날씨는 %s ", Truemanshow.temp, Truemanshow.cloud,Truemanshow.weather);
		
		PlayCard.changeCardSize(200, 300);
		
		//다양한 방식 으로 인스턴스를 생성하여 활용 할 수 있다
		CoffeeBean.BRAZILIAN_ARABICA.info();
		CoffeeBean.COLOMBIAN_ROBUSTR.info();
		
		//CoffeeBean.myBean = new CoffeeBean(2, 3);
		//myBean.info();
		
		//익명 방식
		new CoffeeBean(2, 5).info();
		
		// 연습 Static 자원을 포함한 클래스를 하나 설계해보세요
/*		
		PlayCard h1 = new PlayCard('♥',1);
		PlayCard c5 = new PlayCard('♠',5);
		PlayCard c7 = new PlayCard('♠',7);
		PlayCard c10 = new PlayCard('♠',10);
		
		PlayCard.width = 500;
		
		h1.info();
		c5.info();
		c7.info();
		c10.info();
*/		
	}
}
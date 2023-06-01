/*
	# 클래스 상속
 	
 		- 이미 만들어져 있는 클래스를 물려받아 사용하는 문법
 		
 		- 자식 클래스는 부모 클래스의 모든 자원을 그대로 물려받는다
 		
 		- 부모 클래스에게 물려받은 기능을 고쳐서 사용 할수도 있다
 		
 		- 부모 클래스에게 없던 기능을 새로 추가하여 사용 할 수 있다
 		
 		- 자식 클래스는 반드시 부모의 생성자를 가장 먼저 호출해야한다
 		
 		
	# super
 		
 		 - 자식 클래스로 생성된 인스턴스는 두 부분으로 분류 할 수 있다
 		 
 		 - this는 현재 인스턴스 중 자식 클래스의 부분을 의미한다
 		 
 		 - super은 현재 인스턴스 중 부모클래스의 부분을 의미
 		 
 		 - this()는 현재 클래스의 다른 생성자
 		 
 		 - super()은 부모 클래스의 생성자
 		 
 	# 오버라이드 (@Override)
 	
 		 - 부모의 존재하는 메서드를 마음대로 알아서 사용 할 수 있다 
 */

import myobj.KindPerson;
import myobj.Person;
import myobj2.Music;
public class C07_EXtend {

	public static void main(String[] args) {
		KindPerson kp1 = new KindPerson("범수", 23);
		kp1.sayHi();

		Music msc = new Music("재즈", 69);
		Music msc1 = new Music("펑크", 180);
		Music msc2 = new Music("월드뮤직", 40);
		Music msc3 = new Music("아프로큐반", 125);

		msc.balladinfo();
		msc1.balladinfo();
		msc2.balladinfo();
		msc3.balladinfo();

		Person p1 = new Person("민수", 13);
		Person p2 = new Person("철수", 14);
		Person[] persons = new Person[3];

		persons[0] = p1;
		persons[1] = p2;
		persons[2] = new Person("추신수", 22);

		p1.sayHi();
		p2.sayHi();
		persons[2].sayHi();
	}
}
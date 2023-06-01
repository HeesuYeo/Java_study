/*
	# 인터페이스 (Interface)
 		
 		- 여러개 상속 받을 수 있는 추상 클래스
 		
 		- 인터페이스 내부는 구현 불가
 		
 		- 인터페이스 내부에 선언하는 메서드는 모두 자동으로 abstract public이 된다
 		
 		- 인터페이스 내부에 선언하는 모든 변수들은 자동으로 final static이 된다
 		
 		- 자바는 클래스 상속을 여러개 받을 수 없다 
 		  한 클래스가 더욱 다양한 형태를 지니기 위해서는 인터페이스를 사용해야함
 		  
 	# 인터페이스의 특징
 	
 		- 인스턴스화 불가능
 		
 		- 클래스처럼 타입역할 가능
 		
 		- 해당 인터페이스 타입으로 업캐스팅
 */

import myobj3.Running;
import myobj3.Shark;
import myobj3.Swimming;
import myobj3.Turtle;

public class C15_Interface {

	public static void main(String[] args) {

		Swimming s1 = new Shark(); 
		Swimming s2 = new Turtle();
		
		Running r1 = new Turtle();
		//Running r2 = new (Turtle)s2;
	}

}

/*
 	# 기본형 변수 타입
 		
 		- int, boolean, float, double 등 소문자로 시작하는타입
 		
 	  	  해당 타입 변수에는 "." 을 찍어 사용
 	  	
 	  	( "." 은 그 주소를 따라가서 참조한다는 뜻)
 	  
 	 # 참조형 변수 타입
 	 
 	 	- 우리가 민든 모든 클래스
 	 	
 	 	- String
 	 	
 	 	- 배열 
 	 	
 */
import java.util.Scanner;

import myobj.Apple;


// 클래스도 타입이기 때문에 매개변수로 활용가능 
public class C06_ReferencesDataTypes {
	static void appleTest(Apple apple) {
		apple.info();
	}
	
	public static void main(String[] args) {
		
		String str = "hello";
		int[] nums = {1,2,3,4};
		
		//클래스도 타입이다
		Scanner sc = new Scanner(System.in);
		Apple myapple = new Apple(10,11,"N Apple");
	
		//사과 타입을 매개변수로 가진 메서드에 사과 타입 인스턴스를 전달
		
		appleTest(myapple);
		appleTest(new Apple(8,8, "new Apple"));
	}
}
package quiz;
/*
1. int형 변수 a가 10보다 크고 20보다 작을대 true
2. int형 변수 b가 짝수일때 true 
3. int형 변수 c가 7의 배수일 때 true
4. int형 변수 d와 e의 차이가 30일 때 true 
5. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때 true
6. boolean형 변수 powerOn이 false일 때 true
7. 문자열 참조변수 str이 "yes"일 때 true
*/
public class B02_ConditionQuiz {

	public static void main(String[] args) {
		int a = 15;
		int b =  3; 
		int c =  49;
		int d = 70;
		int e = 40;
		int year = 404;
		boolean powerOn = false;
		
		
		
		 String str = new String();                                        // new...?
	     str = "yes";         
		 //str1 = : "yes";
		
		
		
		//1.
		System.out.println((a > 10) == (a < 20));
		
		// 답
        // boolean result1 = a > 10 && a < 20; /boolean 이므로
		// System.out.println("1번결과는" + result1);
		// 변수가 왼쪽에 있는게 좋다
		
		//2.
		boolean result2 = b % 2 == 0;	
		System.out.println("2번답은 : " + result2);
		
		
		
		
		
		//3.
		boolean result3 = c % 7 == 0;
		System.out.println("3번답은 : " + result3);
		//출력변수에 식을 적을때는 괄호를 사용한다 ex) System.out.println("3번결과 : " (c % 7 == 0));
		
		
		
		//4.
		boolean result4 = Math.abs(d - e) == 30;
		System.out.println("4번 결과는 : " + result4);
		
		
		
		
		//5.윤년 (2월이 하루 더 있나 없나를 알 수 있는 공식)
		//System.out.println((year % 400 == 0) || (year % 4 == 0 ) && (year % 100 != 0));
		
		boolean result5 = year % 400 == 0 || (year % 4 == 0  && year % 100 != 0);
		System.out.printf("5번%d년에는 2월이 하루 더 있나요 :  %s\n",year,result5 );
		
		
	
		//6. 
		boolean result6 = !powerOn;
		System.out.printf("6번지금 전원이 꺼져 있나요? : %s\n", result6);
		
		
		
		
		//7.
		//기본형(원시) 타입은 용량을 확보하고 값을 넣을 수 있지만
		
		// 데이터의 크기가 어떻게 될지 모르기 때문에                                                  *인자값 : 넘겨주는값*   
		// 참조형[OBJ] (String, ...) 타입은 값을 넣을수없고 값의 크기를 특정할수 없기 때문에 실제데이터는 데이터룰 유동적으로 저장하는곳 (힙)에 정의하고
		// 스택에는 실제 데이터의 경로(path)를 넣어야한다
		
		// * 참조형 변수끼리 == 를 통해 비교 하게 되면 주소를 비교한다 
		//   System.out.println(str1 == str2);
        // * 참조형 변수의 실제 내용을 통해 비교하기 위해서는 equals() 메서드를 사용해야한다 
		//   System.out.println(str.equals(str1));
		//
		boolean result7 = str == "yes";
		
		System.out.printf("7번답은 :  %s\n ", result7);
		
		
		
		
		
		
		
		  
		
		
		
		
		
		
		
		
		
		
	}

}

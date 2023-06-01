package quiz;

public class A04_Gldong {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		String tel = "010-1234-1234";
		//int시에 계산을 한다
		double key = 178.5;
		int body = 75;
		//몸무게는 소숫점이 많기때문에 double가 옳다 ***어떻게 변할수있는가를 생각해야한다***
		String rh = "o";
		// char 작은따옴표
		System.out.println("========== 출력 결과 ==========\n");
		System.out.println("이름\t:" + name );		
		System.out.println("나이\t:" + age);
		System.out.println("tel\t:" + tel );
		System.out.println("키\t:" + key );
		System.out.println("몸무게\t\t:" + body );
		System.out.println("혈액형\t\t:" + rh );
		
	// ***어떻게 변할수있는가를 생각해야한다***
	// 타입응용을 많이 해보자 rh에 char, body에 byte
	//	System.out.println("========== 출력결과 ==========\n" + "이름\t:" + name );
		
		
		
	}

}

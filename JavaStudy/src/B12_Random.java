import java.util.Random;

public class B12_Random {

	public static void main(String[] args) {

/*
 	무작위 숫자 생성하기
 	
 	1. Math. random() 함수
 	
 	2. jaa.util.Random 클래스
 
 */
		// # new Random()으로 새로운 랜덤 시드 생성
		// - 시드 여러 랜덤 숫자가 순서대로 저장되어 있는 것
		// - 같은 시드 번호로 설정하면 계속 같은 숫자가 순서대로 나오게 된다
		// - 원하는 타입을 선택하여 꺼낼 수 있다
		Random ran = new Random();
		// - nextInt()에 값을 전달해 랜덤 숫자의 범위를 설정할 수 있다
		// - 100을 전달하면 0부터 99가지의 정수를 반환 (100개)*
		// - 101을 전달하면 0부터 100가지의 정수를 반환 (101개)*
		
	
		System.out.println(ran.nextInt(10));
		System.out.println(ran.nextInt());
		//먼저 숫자의 개수를 정하고 숫자를 더하거나 빼서 숫자의 시작지점을 정할 수 있다(음수가 나오게 하려면 빼면된다)
		System.out.println(ran.nextInt(100) - 200); // -200~ - 101
		System.out.println(ran.nextInt(101) - 200); // -200~ - 100
		System.out.println(ran.nextInt(100));
		System.out.println(ran.nextInt(100));
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextBoolean());
		
		//
		
		// Math.Random() : 0 <= x <1 인 랜덤 소수 를 생성
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		//Math.random();을 사용해 원하는 범위의 정수 만들기
		
		//(1) 소수를 int로 변환하면 소수점 아래를 모두 버린다 (정수로 변환)
		System.out.println(Math.random());
		
		// (2) 0 <= x <= 1인 소수에 원하는 범위를 곱한 후 int로 변경하면 
		//		원하는 범위의 랜덤 정수를 생성 할 수 있다
		// ran.nextInt(int bound)에 범위를 설정하는것과 같음		
		// 0* 10 <= x < 1 * 10
		System.out.println((int)(Math.random() * 10));
		// 0 <= x < 100
		System.out.println((int)(Math.random() * 100));
		// 0 <= x < 1000
		System.out.println((int)(Math.random() * 1000));
		// 0 <= x < 85
		System.out.println((int)(Math.random() * 85)); 
		
		// (3) 만들어진 정수에 값을 더하거나 빼서 원하는 범위를 설정
		System.out.println((int)(Math.random() * 85) - 300); // -300 ~ -216
		System.out.println((int)(Math.random() * 85) + 100); //  100 ~ 184
		
		//연습 : 1~45의 랜덤 정수를 10개 출력
		
		System.out.println(ran.nextInt(45) + 1);
		System.out.println(ran.nextInt(45) + 1);
		System.out.println(ran.nextInt(45) + 1);
		System.out.println(ran.nextInt(45) + 1);
		System.out.println(ran.nextInt(45) + 1);
		System.out.println(ran.nextInt(45) + 1);
		System.out.println(ran.nextInt(45) + 1);
		System.out.println(ran.nextInt(45) + 1);
		System.out.println(ran.nextInt(45) + 1);
		System.out.println(ran.nextInt(45) + 1);
		
		//or
		System.out.println();
		
		for(int i = 0; i < 10; ++i) {
		System.out.println(ran.nextInt(45) + 1);	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
	}



	/*
	 	#대입연산자
	 	- = : 왼쪽에 변수에 오른족의 값을 대입한다
	 	
	 	
	 	#복합대입연산자
	 	- 왼족에 변수에 들어있는 값에 누적시키는 연산
	 	- += -= *= %= ...
	 	
	 	#단항 연산자
	 	- ++, --위치에 따라서 결과가 달라진다
	 	- ++, --를 뒤에 붙이면 해당 줄의 모든 명령을 실행한 후에 값이 변한다
	 	- ++, --를 앞에 붙이면 해당 줄에 명령을 실행하기전에 값이 변한다
	 
	 */
public class B05_Operator03 {

	public static void main(String[] args) {
		int a = 10;
		// = 은 변수에 원래 들어있던값을 덮어쓴다
		a = 20;
		System.out.println(a);
		
		// += 은  변수에 들어있는 값에 계산을 누적시킨다
		a += 20;
		System.out.println(a);
		
		// 복합 대입 연산자는 변수에 들어있는 값에 계산을 누적시킨다		
		a *= 2;
		System.out.println(a);
		
		a -= 13;
		System.out.println(a);
		
		//복합대입연산자를 풀어서 사용할 수있다
		a = 10;
		a = a + 5; // a += 5;
		System.out.println(a);
		a = a * 10; // a *= 10;
		System.out.println(a);
		
		//단항 연산자
		int num = 20;
		
		num++;
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		//단항연산자 후위 표기법 : 해당 줄의 연산을 모두 끝마친 후에 값이 변한다 (할거다하고 값이변한다) 
		int result;
		num = 20;		
		
		result = num++ + 10;
		System.out.println("result1" + result + ", num : " + num);
		
		//단항연산자 전위 표기법 : 해당 줄의 연산을 수행하기전에 값이 변한다 (값이 변하고 할거한다)
        num = 20;		
		result = ++num + 10;
		System.out.println("result2" + result + ", num : " + num);
		//복합대입연산자도 연산에 포함시킬 수 있다
		num = 20;
		result = (num += 3) +5;
		System.out.println("result3" + result + ", num : " + num);
		
		
		
		
		
		
	}

}

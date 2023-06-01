/*
  	# 삼항연산자
  	
  		- 간단한 if문을 한 줄로 사용할 수 있다
  		- 비교 ? 예 : 아니오;
  		- 비교 결과가 true면 : 왼쪽 값 사용 
  		- 비교 결과가 false면 : 오른쪽 값 사용 
 */
public class B13_Operator04 {

	public static void main(String[] args) {
		
		int a = 10;
		int apple = 20;
		String message = a % 2 == 0 ? "짝수입니다." : "홀수 입니다.";
		int result = a % 2 == 0 ? 7 : 99;
		boolean jjaksu = a % 2 == 0 ?  true : false;
		boolean holsu = a % 2 != 0;
		//boolean 타입일경우 안쓰는편이 낫다
		
		System.out.println(message);
		System.out.println(result);
		System.out.println(holsu);
		
		int basket = apple % 10 ==0 ? apple /10 : apple /10 +1;
		System.out.println("필요한 바구니의 개수 : " + basket);
		
	}

}

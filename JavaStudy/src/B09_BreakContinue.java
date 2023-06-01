
/*
 
 	# Break
 	
 	 - Switch case문에서 사용하면 해당 case를 탈출한다
 	 - 반복문 내부에서 사용하면 해당 반복문을 즉시 탈출한다
 	
 	
 	#Continue
 	- 반복문 내부에서 Continue를 만나면 다음 번 반복으로 바로 넘어간다
 	- Continue 아래에 있는 코드들은 모두 무시
 	
 
 
 
 */
public class B09_BreakContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; ++i) {
			System.out.println(i);

			if (i == 5) {
				break; // 반복문 내부에서 break를 만나면 해당 반복문을 탈출
			}
		}
		System.out.println("=================================");

		for (int i = 0; i < 20; ++i) {
			if (i % 3 == 0) {
			continue; // 해당하는수가 출력 무시됨 (3의 배수일때만 아래 출력문을 무시한다) 
		}
			System.out.println(i);
		}
		System.out.println("프로그램 끝");

	}

}

package quiz;

/*
  1. 1부터 2000 미만의 9의 배수를 모두 출력
  
  2. 100부터 300까지의 총합 (100,300포함)
  
  3. 1000부터 1500까지 10의 배수가 한줄에 7개식 출력
 */

public class B06_ForQuiz {

	public static void main(String[] args) {

		// 01

		int multiple;

		for (multiple = 9; multiple < 2000; multiple += 9) {
			System.out.println("9의배수 : " + multiple);

			/*
			 * int i; for(int i = 0; i< 2000; ++1) { if( i % 9 == 0) { sysout i
			 * 
			 * 
			 * 
			 */
		}

		// for(time=1; time<9; time++) {
		// System.out.println(da + " X " + time + " = " + da*time);

		// 9 18 27 36 45 54 63 72 81

		// 2
		// 총합을 구할때는 변수를 하나 만들어서 값을 계속 누적시킨다
		int num = 0;
		int sum = 0;

		for (num = 100; num <= 300; num++) {
			sum += num;
		}
		System.out.println("총합은 : " + sum + "입니다.");

		// 3

		int num1 = 0;
		int sum1 = 0;

		for (num1 = 1000; num1 <= 1500; num1++) {

			if (num1 % 10 == 0) {

				sum1 = num1;

			}
		}
		System.out.println("10의 배수는 : " + sum1 + "입니다.");

		// 답
		// 숫자가 7번에 한번씩 \n을 출력하면 된다

		for (int i = 1000, count = 0; i <= 1500; ++i) {

			if (i % 10 == 0) {
				System.out.printf("%d(%2d번째)", i, count);

				if (count % 7 == 0) {
					System.out.println(); // \n만 출력하는것과 같다
				}
				++count;

			}
		}
	}
}

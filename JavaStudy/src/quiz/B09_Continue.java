/*
 	1. 1부터 30까지 한 줄에 숫자 5개식 출력
 	2. 1부터 200까지의 수중 2의배수도 아니고 3의 배수도 아닌 수들의 총합을 출력
 */
package quiz;

public class B09_Continue {

	public static void main(String[] args) {
		// 1

		for (int i = 1; i <= 30; ++i) {
			String sp;

			if (i % 5 <= 0) {

				System.out.println(i);
			}
			if (i % 5 <= 0) {
				System.out.println();

			} else if (i <= 30) {
				System.out.print(i);

				// 답
				for (int q = 1; q <= 30; ++q) {
					System.out.print(q + "\t");

					if (q % 5 != 0) {
						continue;
					}
					System.out.println();

				}

				// 2

				for (int q = 2; q <= 200; ++q) {
					for (int j = 3; j <= 200; ++j) {

						// 답
						int sum = 0;
						for (int w = 1; w <= 200; ++w) {
							if (w % 2 == 0 || w % 3 == 0) {
								continue;
							}
							sum += w;
						}
						System.out.println("결과 : " + sum);

					}
				}
			}

		}

	}

}

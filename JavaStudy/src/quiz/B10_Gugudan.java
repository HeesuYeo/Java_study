/*
  99단 가로, 세로
  
  가로         세로
  2단 : 2x1 		2단	3단 	4단
  3단 : 3x3		2X2	2X2 2X2
  4단 : 4x4

 */

package quiz;

public class B10_Gugudan {

	public static void main(String[] args) {
		// 세로
		for (int line = 1; line <= 9; ++line) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (line == 0) {
					System.out.printf("%d단\t", dan);
				} else {

					System.out.printf("%dx%d=%d\t", dan, line, dan * line);

				}
			}
			System.out.println();
			// 가로
			/*for (int dan = 2; dan <= 9; ++dan) { //
				System.out.printf("%d단:", dan);

				for (int gop = 1; gop <= 9; ++gop) { //
					System.out.printf("%2dx%d=%-2d", dan, gop, dan * gop);

				}
				System.out.println();
*/			
		
		}
	}
}

		

	


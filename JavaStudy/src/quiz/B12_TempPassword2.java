/*
  대문자, 소문자, 특수문자, 숫자로 구성된 랜덤 비밀번호 6자리를 생성하여 출력
  
  ※ ! @ # $ ^ & *  - _ + = | : ; > <  @ [ ] ^  ~ \
 */
package quiz;

import java.util.Random;

public class B12_TempPassword2 {

	public static void main(String[] args) {
		Random ran = new Random();

		/*for (int i = 0; i < 6; ++i) {
			char ch = (char) (ran.nextInt(26) + 'A');
			char ch1 = (char) (ran.nextInt(26) + 'a');
			char ch2 = (char) (ran.nextInt(10) + '0');
			*/
			// 답
			for (int i = 0; i < 6; ++i) {

				switch (ran.nextInt(4)) {
				case 0:
					// 숫자
					System.out.print((char) (ran.nextInt(10) + '0'));
					break;

				case 1:
					System.out.print((char) (ran.nextInt(26) + 'a'));
					// 소문자
					break;

				case 2:
					System.out.print((char) (ran.nextInt(26) + 'A'));
					// 대문자
					break;

				case 3:
					// 특수문자
					String charset = "!@#$%^&*_+=|:;<>{}[]^{}~\\";
					System.out.print(charset.charAt(ran.nextInt(charset.length())));
					break;	
				}
			}
		}
	}
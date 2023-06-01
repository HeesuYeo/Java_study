/*
4자리의 비밀번호가 있을 때 비밀번호를 찾을 떄 까지 
모든 비밀번호를 대조하는 프로그램을 만들어보세요

	000000	
	000001	
	000002
	...
	해야하는것
	맞는 비밀번호 지정
	4자리 대조
	 
*/
package quiz;

import java.util.Random;

public class B12_BruteForce {

	public static void main(String[] args) {
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789"
				+ "!@#%^&**()_+|;:<>@[]^\\~";

		String password = "";
		Random ran = new Random();

		for (int i = 0; i < 4; ++i) {
			password += charset.charAt(ran.nextInt(charset.length()));
		}
		System.out.println("생성된 임시 비밀번호 : " + password);
		System.out.println();
		for (int i = 0; i < charset.length(); ++i) {
			for (int j = 0; j < charset.length(); ++j) {
				for (int k = 0; k < charset.length(); ++k) {
					for (int l = 0; l < charset.length(); ++l) {
						String brute = "" + charset.charAt(i) + charset.charAt(j) + charset.charAt(k)
								+ charset.charAt(l);

						if (brute.equals(password)) {
							System.out.println("비밀번호는 [" + brute + "]입니다.");

						}
					}
				}
			}
		}
	}
}
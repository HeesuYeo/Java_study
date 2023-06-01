/*
  	HashSet를 이용해 1 ~ 45 사이 중복없는 7개의 랜덤 숫자를 생성
 */

package quiz;

import java.util.HashSet;

public class D02_LottoSet {

	public static void main(String[] args) {

		HashSet<Integer> lotto = new HashSet<>();
		
		
// 내 답 
//		for (int i = 0; i <= 7; ++i) {
//			int random = (int) (Math.random() * 45 + 1);
//			lotto.add(random);
//			
//			if (lotto.size() == 7) {
//				lotto.add(random);
//				break;
//			}
//		}
//		System.out.println(lotto);
		
		while (lotto.size() != 7) {
			lotto.add((int) (Math.random() * 45 + 1));
		}
		System.out.println(lotto);
	}
}
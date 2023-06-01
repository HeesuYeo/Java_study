import java.util.Arrays;

import blackjack.Card;
import myobj.Apple;

public class C16_Null {
	static boolean abc;
	static int ab;
	
	static Apple apple;
	static Card[] cards = new Card[52];
	
	public static void main(String[] args) {
		
		// 기본형 타입 초기화 -0, flase
		
		int a = 0;
		System.out.println(a);
		System.out.println(ab);
		System.out.println(abc);
		
		// 참조형 타입 초기화 - null
		String str = null;
		
		System.out.println(str);
		System.out.println(apple);
		System.out.println(Arrays.toString(cards));

		cards[0] = new Card(0, 0);
		cards[1] = new Card(0, 1);
		cards[2] = new Card(0, 2);
		
		for( int i = 0; i < cards.length && cards[i] != null; ++i) {//참조형 배열의 기본 값은 null
			cards[i].hide();
			System.out.println(cards[i]);
		}
	}
}
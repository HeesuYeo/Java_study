package blackjack;

public class Deck {

	Card[] cards;

	int cursor = 0;

	public Deck() {
		this(1); // this () :  내 클래스의 다른 생성자
	}

	
	// 카드를 여러번 사용하고 싶을 경우
	public Deck(int size) {
		int slen = Card.shapes.length;
		int rlen = Card.ranks.length;

		cards = new Card[rlen * slen * size]; //총 카드 개수만큼 배열생성

		for (int i = 0; i < size; ++i) {// 덱이 몇개냐
			int index = i * slen * rlen;  // 전에 있던덱
			// 카드 종류별로 구성
			for (int shape = 0; shape < slen; ++shape) { // card class 
				for (int rank = 0; rank < rlen; ++rank) {
					//전에 있던덱 + 모양 + 랭크길이 + 랭크
					cards[index + shape * rlen + rank] = new Card(shape, rank);
					/*
					 shape 가  1번돌고( rlen13) rank0인 a 부터 시작
					 2번돌면 2 * 13  + 0 RANK(0~12)까지돌고
					 SHAPE2 부터 반복  
					 */
				}
			}
		}
		shuffle();
	}
	public void shuffle() {
		for (int i = 0; i < cards.length * 2; ++i) {
			int ran = (int) (Math.random() * cards.length);
			Card tmp = cards[0];
			cards[0] = cards[ran];
			cards[ran] = tmp;
		}
	}
	//셔플 에서 섞은카드를 draw로 뽑고 커서는 덱의 인덱스번호를 1씩 올린다(다음거 뽑)
	public Card draw() {
		if (cursor == cards.length) {
			cursor = 0;
			shuffle();
		}
		return cards[cursor++];
	}
}

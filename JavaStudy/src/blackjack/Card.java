package blackjack;



public class Card {
	
	// 숫자 A 2 3 4 5 6 7 8 9 10 J,Q,K
	// 모양 ◆ ♥ ♣ ♠
	// 규칙을 정할 수 있다
	// static = 공동자원
	
	static String[] ranks = { "A", "2", "3", "4", "5",
			"6", "7", "8", "9",
			"10", "J", "Q", "K" };
	static char[] shapes = { '♠', '♥', '♣', '◆' };
	
	boolean hidden;

	int shape;
	int rank;
	public void hide() {
		hidden = true;
	}
	
	public void open() {
		hidden = false;
	}
	
	
	public Card(int shape, int rank) {
		
		this.shape = shape;
		this.rank = rank;
		
	}
	
	@Override
	public String toString() {
		return String.format("%c%s", shapes[shape], ranks[rank]);
//		if(hidden) {
//			return  "┌──────┐\n│  ??  │\n└──────┘";
//			
//		}else {
//		return String.format(
//							 "┌──────┐\n"
//				+			 "│  %c%-2s │\n"       
//				+			 "└──────┘",
//				shapes[shape], ranks[rank]);
	//}
}
}
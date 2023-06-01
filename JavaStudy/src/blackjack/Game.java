package blackjack;

import java.util.Scanner;

public class Game {

	public static void gameInfo(Card[] user, Card[] dealer) {

		System.out.println("- User - ");
		for (int i = 0; i < user.length && user[i] != null; ++i) {
			Card c = user[i];
			System.out.printf("[%c%s] ", Card.shapes[c.shape], Card.ranks[c.rank]);
		}
		System.out.printf("(%d)",BlackJack.getValue(user));
		System.out.println();
		System.out.println();

		System.out.println("- Dealer - ");
		for (int i = 0; i < dealer.length && dealer[i] != null; ++i) {
			Card c = dealer[i];

			if (!c.hidden) {
				System.out.printf("[%c%s] ", Card.shapes[c.shape], Card.ranks[c.rank]);
			} else {
				System.out.print("[XX]");

			}
		}
	}

	public static void main(String[] args) {

		Deck d = new Deck(3);

		// A가 21개
		Card[] user = new Card[21];
		Card[] dealer = new Card[21];

		System.out.println("유저에게 2장");
		user[0] = d.draw();
		user[1] = d.draw();

		System.out.println("딜러에게 2장");
		dealer[0] = d.draw();
		Card c = d.draw();
		c.hide();
		dealer[1] = c;

		Scanner sc = new Scanner(System.in);
		int userIndex = 2;
		int dealerIndex = 2;

		while (true) {
			gameInfo(user, dealer);

			System.out.println("\n1.hit\t2.stand");
			int hit = sc.nextInt();

			if (hit == 1) {
				user[userIndex++] = d.draw();

				if (BlackJack.getValue(user) > 21) {
					gameInfo(user, dealer);
					System.out.println("\n플레이어 버스트로 패배");
					return;
				} else if (BlackJack.getValue(user) == 21) {
					dealer[1].open();
					while (BlackJack.getValue(user) < 16) {
						dealer[dealerIndex++] = d.draw();
					}
					break;
				}
			} else if (hit == 2) {
				dealer[1].open();
				while (BlackJack.getValue(dealer) < 16) {
					dealer[dealerIndex++] = d.draw();
				}
				break;

			} else {
				continue;
				
			}

		}
		int userValue = BlackJack.getValue(user);
		int dealerValue = BlackJack.getValue(dealer);
		
		gameInfo(user, dealer);

		
		if (dealerValue > 21) {
			System.out.println("%d(user) vs %d(dealer)딜러의 버스트로 유저승");
		
		}else if(userValue == dealerValue) {
			System.out.printf("\n%d(user) vs %d(dealer)로 비김",
					userValue,dealerValue);
			
		}else if(userValue > dealerValue) {
			System.out.printf("\n%d(user) vs %d(dealer)로 유저승",
					userValue,dealerValue);
		}else {
			System.out.printf("\n%d(user) vs %d(dealer)로 딜러 승",
					userValue,dealerValue);
		}
			
	}
}

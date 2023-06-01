package game31;

import java.util.Scanner;

public class C10_31Game {

	Scanner sc = new Scanner(System.in);
	Player_[] players;
	
	public C10_31Game() {
	int playerN;

	System.out.print("플레이어는 몇 명? ");
	playerN = sc.nextInt();

	players = new Player_[playerN];

	for(int i = 0; i < playerN; ++i) {
		System.out.print("플레이어" + (i + 1) + "의 이름을 입력: ");
		players[i] = new Player_(sc.next());
	}
	System.out.println("게임 설정 완료..");

}
}
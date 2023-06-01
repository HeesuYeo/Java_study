/*
 	# updown 게임을 만들어 보세요
 	
 		1. 프로그램이 시작되면 1 ~ 200 사이의 랜덤 숫자를 정답으로 선택한다
 		
 		2. 사용자가 숫자를 입력하면 up인지 down인지 알려준다
 			(잘못된 숫자가 입력되면 다시입력)
 		
 		3.사용자가 정답을 맞추면 몇번만에 맞췄는지 출력해주고 
 		  	프로그램 종료
 		  	
 		4. 5번 안에 못맞추면 정답이 뭐였는지 출력해주고 프로그램을 종료 	
 */
package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_Updown {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int answer = ran.nextInt(200) + 1;
		System.out.println(answer);
		System.out.println("숫자를 입력하세요");

		for (int i = 0, count = 0; i < 5; ++i) {
			int number =Math.abs(sc.nextInt());

			if (number == answer) {
				System.out.println("정답입니다");
				System.out.printf(" 회수는 %s  ", count + 1);
				break;

			} else if (number < answer) {
				System.out.println("정답이 아닙니다 Up");
				++count;
				
			} else if (number > answer) {
				System.out.println("정답이 아닙니다 Down");
				++count;
			
			}
			System.out.println("틀린회수는 : " + count);
		}
		System.out.println("정답은 :" + answer + " 입니다 ");
		/*
		boolean win = false;
		int num = ran.nextInt(200) + 1;
		System.out.println(num);
		// while문의 무한반복
		//while(true) {
		for(int turn = 0; turn < 5; ++turn) {
			System.out.print(turn + 1 + "번째 입력 : ");
			int user = sc.nextInt();
				//답
			    //중요 잘못 된거 걸러주는 로직.      								
			    // 이걸 먼저하는 것이 무조건 좋다                                      	
				if (user < 1 || user > 999) {      		
				System.out.println("잘못된 값입니다");
				--turn;
				continue;
				//코드의 관심사 별로 분류를 잘해야한다 
			}
			if(user < num) {
				System.out.println("up");
			}else if(user < num) {
				System.out.println("down");
			}else {
				System.out.println(turn + 1 +"회 만에 정답");
				win = true;
				break;
			}
			}
		if(!win) {
			System.out.println("정답" + num );
		}
		System.out.println("프로그램 끝");
		*/
	}
}

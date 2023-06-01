/*
    (1) 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든후
    
    (2) 프로그램 종료시 전적을 파일을 저장하고 
    
    (3) 프로그램 실행시에는 파일에 저장된 전적 데이터를 읽어
       예전 전적이 그대로 이어지도록 만들어보세요
 */
// 디폴트 E04_FileInputStream 참조

package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E04_Save {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int com = (int) (Math.random() * 3 + 1);
		int user = 0;
		int com_wincount = 0;
		int user_wincount = 0;
		int drawcount = 0;

		try {
			FileInputStream in = new FileInputStream("myFiles/match_history.txt");

			byte[] allData = in.readAllBytes();

			System.out.println(new String(allData));

			in.close();

		} catch (Exception e) {
			System.out.println("뭔가 문제 생김");
		}

		while (true) {

			System.out.println(com);
			System.out.println("가위바위보 시작");
			System.out.println("당신의 수를 입력 1.가위 2.바위 3.보");

			user = sc.nextInt();

			if (user == 0 | user >= 4) {
				System.out.println("다시");
				continue;

			} else if (user - com == 0) {
				System.out.println("비겼습니다");
				drawcount += 1;

			} else if (user - com == -1 | user - com == 2) {
				System.out.println("컴퓨터 승");
				com_wincount += 1;

			} else if (user - com == -2 | user - com == 1) {
				System.out.println("user 승");
				user_wincount += 1;

			} else if (user == 0 | user > 4) {
				System.out.println("다시");
				continue;
			}
			System.out.println("프로그램 종료");
			break;
		}

		try {
			FileOutputStream out = new FileOutputStream("myFiles/match_history.txt");

			String match = "com의 전적 : " ;
			out.write(match.getBytes());

			out.write(("win\t" + com_wincount).getBytes());
			out.write(("\tlose\t" + user_wincount).getBytes());
			out.write(("\tdraw\t" + drawcount).getBytes());

			out.close();

		} catch (FileNotFoundException e) {
			System.out.println("해당 경로을 못찾음..");
			return;

		} catch (IOException e) {
			System.out.println("쓰기 도중 에러 발생..");
			return;
		}

	}
}
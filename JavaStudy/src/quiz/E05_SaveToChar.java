/*
 	가위바위보 전적을 FileReader과 FileWriter을 사용해 저장
 	(가위바위보 로직은 반드시 만들었던 것을 재활용하시오)
 	
 */
package quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import quiz_answer.Saveanswer;

public class E05_SaveToChar {

	public static void main(String[] args) {
		int[] record = new int[3];

		try {
			FileReader in = new FileReader("myFiles/record2.save");
			//칸만들기
			char[] buffer = new char[1000];
			//불러오기
			int len = in.read(buffer);
			//0~ lan 만큼 문자열로 만듬  버퍼 = 크기
			String recordData = new String(buffer, 0, len);
			
			// Pattern.complie("(\\d+),(\\d+),(||d+)");

			String[] split = recordData.split(",");
			
			//점단위로 쪼개서 배열

			for (int i = 0; i < split.length; ++i) {
				//문자열을 정수로 변환
				record[i] = Integer.parseInt(split[i]);
			}

			in.close();

		} catch (FileNotFoundException e) {
			System.out.println("세이브 파일을 찾지 못했습니다 새로시작합니다");
		
		} catch (IOException e) {
			System.out.println("읽기도중 문제발생");
		}

		System.out.println("시작전적 : " + Arrays.toString(record));
		
		for (int i = 0; i < 10000; ++i) {
			int result = Saveanswer.game();
			System.out.println("결과 : " + result);
			record[result] += 1;
		}
		System.out.println("종료전적 : " + Arrays.toString(record));
		
		try {
			FileWriter out = new FileWriter("myFiles/record2.save");
			//문자열로 반환
			out.write(String.format("%d,%d,%d", record[0], record[1], record[2]));

			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("저장 완료.");
	}
}

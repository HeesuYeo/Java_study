package quiz;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/* 
국어, 영어, 수학 점수를 차례대로 입력	받아 평균 점수를 구한후에 
각 과목점수 ,평균점수, 등급을 출력해주는 프로그램읗 만들어보세여
     90이상A
     80이상B
     70이상C
     60이상D
     그외 F
2. 유효한 점수는 0 ~ 100점이다 (유효하지 않은 숫자가 하나라도 있으면 F 
3. 평균점수는 소수 둘째 자리에서 반올림 하여 저장

*/
public class B03_ScoreToGrade {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		String str = "3과목 점수를 입력하세요";
		
		System.out.println(str);
		
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();

		double avr= Math.round((kor+eng+math) / 3.0 * 100) / 100.0;   
		
		avr = (Math.round(avr * 100) / 100.0);
		avr = (Math.abs(avr));                                               
		char grade;
		System.out.println("평균점수는: " + avr + "입니다"); 
		
		
		if((kor < 0 || kor > 100) || (eng < 0 || eng > 100)|| (math < 0 || math > 100 )) {
			System.out.println("유효하지 않은 점수");
			
		if(avr>=90) {
			System.out.println("등급은 A입니다.");
			
		}else if(avr>=80) {
			System.out.println("등급은 B입니다.");
			
		}else if (avr>=70) {
			System.out.println("등급은 C입니다.");

		}else if (avr >= 60) {
			System.out.println("등급은 D입니다.");

		//} else (avr <= 59 {
			//System.out.println("등급은 F입니다.");
			
			
		}
		}
	}
}


package school;

import java.util.Random;

public class Subject {

	protected static Random ran = new Random();

	public int[] getSubjectScores() {
		System.out.println("과목별 점수를 배열로 만들어 리턴해줄 예정");
		return null;
	}

	public double getAvg() {

		System.out.println("과목의 평균을 구해줄 예정");
		return 0.0;
	}

	public int getTotal() {
		System.out.println("과목의 총점을 구해줄 예정");
		return 0;
	}

	public char getGrade() {
		System.out.println("과목의 등급을 구해줄 예정");
		return 'F';
	}

	public String[] getSubjectNames() {
		System.out.println("과목별 이름 목록을 리턴해줄 예정");
		return null;
	}
}

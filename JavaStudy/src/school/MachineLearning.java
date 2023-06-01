package school;

public class MachineLearning extends Subject {
	int kor;
	int eng;
	int math;
	int statistics;
	int programmingLanguage;
	int sql;



	public MachineLearning(int kor, int eng, int math, int statistics, int programmingLanguage, int sql) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.statistics = statistics;
		this.programmingLanguage = programmingLanguage;
		this.sql = sql;

	}
	public MachineLearning() {
		kor = ran.nextInt(101);
		eng = ran.nextInt(101);
		math = ran.nextInt(101);
		statistics = ran.nextInt(101);
		programmingLanguage = ran.nextInt(101);
		sql = ran.nextInt(101);
	}
	@Override
	public double getAvg() {
		return getTotal() / 100;
	}
	@Override
	public char getGrade() {
		double avg = getAvg();
		if(avg >= 70) {
			return 'A';
		} else if (avg >= 60) {
			return 'B';
		} else if (avg >= 50) {
			return 'C';
		} else if (avg >= 40) {
			return 'D';
		} else
			return 'F';
	}
	//@override
	public String[] getSubjectNames() {
		return new String[] {"국어", "영어", "수학","통계학","프로그래밍 언어","NO-SQL"};
	}
	@Override
	public int getTotal() {
		return kor + eng + math + statistics + programmingLanguage + sql;
	}
	@Override
	public int[] getSubjectScores() {
		return new int[] {kor,
				eng,
				math,
				statistics,
				programmingLanguage,
				sql
		};

	}
}

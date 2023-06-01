package school;

public class Network extends Subject {
	int kor;
	int eng;
	int linux;
	int network;
	int ccna;
	



	public Network(int kor, int eng, int linux, int network, int ccna) {
		this.kor = kor;
		this.eng = eng;
		this.linux = linux;
		this.network = network;
		this.ccna = ccna;
		

	}
	public Network() {
		kor = ran.nextInt(101);
		eng = ran.nextInt(101);
		linux = ran.nextInt(101);
		network = ran.nextInt(101);
		ccna = ran.nextInt(101);
	
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
		return new String[] {"국어", "영어", "리눅스","네트워크","CCNA"};
	}
	@Override
	public int getTotal() {
		return kor + eng + linux + network + ccna;
	}
	@Override
	public int[] getSubjectScores() {
		return new int[] {kor,
				eng,
				linux,
				network,
				ccna,
		};

	}
}

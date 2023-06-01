package myobj2;

public class Music extends Genre {

	String ballad;
	int bpm;

	public Music(String ballad, int bpm) {

		super(ballad, bpm);
	}

	@Override
	public void balladinfo() {
		System.out.printf(" 음악장르는 %s." + "템포는 %d bpm 입니다 \n", super.ballad, super.bpm);
	}

	public static void main(String[] args) {

	}

}

package myobj2;

public class Genre {

	String ballad;
	int bpm;

	public Genre(String ballad, int bpm) {

		this.ballad = ballad;
		this.bpm = bpm;
	}

	public void balladinfo() {
		System.out.printf("%s ." + "%d ", ballad, bpm);

	}

	public static void main(String[] args) {

	}

}

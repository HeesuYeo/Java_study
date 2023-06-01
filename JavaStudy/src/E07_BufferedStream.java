import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 		# Buffer
 		
 		- 데이터를 한 개씩 여러번 입출력 하는것보다
 		
 		  모아서 한꺼번에 입출력하는 방식이 훨씬 처리 속도가 빠르다
 		
 		- 버퍼 기능이 미리 구현된 스트림 클래스들은 앞에 Buffered라는 이름이 붙는다
 		
 		- BufferedInputStream, BufferedreadWriter,BufferedReader ... 

 */
public class E07_BufferedStream {

	private static String allText = read2();

	// 한글자씩 쓰기
	public static void write0() {

		FileWriter out = null;

		try {

			out = new FileWriter("./writetest/write0.txt");

			int len = allText.length();
			for (int i = 0; i < len; ++i) {
				out.write(allText.charAt(i));
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (out != null)
					out.close();
			} catch (Exception e) {

			}
		}

	}

	// 직접구현한 버퍼방식으로 쓰기
	public static void write1() {
		// AutoClose 방식의try - catch, () 내부에 선언한 autoCloseable 타입의
		// 인스턴스들은 자동으로 close() 호출

		try (FileWriter out = new FileWriter("./writetest/write1.txt")
		) {
			StringBuilder sb = new StringBuilder(allText);

			int len = allText.length();
			//2048개씩 쓰면서 가다가 글자가 부족해지면 남아있는 개수만큼 쓰기
			for (int i = 0; i < len; i+= 2048) {
				out.write(allText, i, i + 2048 > len ? len -i : 2048);
			}

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	// BufferedWriter로 쓰기
	public static void write2() {
	      try (
	         FileWriter fout = new FileWriter("./writetest/write2.txt");
	         BufferedWriter out = new BufferedWriter(fout);
	      ) {
	         out.write(allText);
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
	
	// 한글자씩 읽기
	public static void read0() {

		File book = new File("myFiles/frankenstein.txt");

		try {
			FileReader fin = new FileReader(book);
			BufferedReader in = new BufferedReader(fin);

			StringBuilder sb = new StringBuilder();
			String line;

			int ch;

			while ((ch = in.read()) != -1) {
				sb.append((char) ch);
			}

			in.close();
			fin.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	// 직접 구현한 버퍼 방식으로 읽기 (FileReader)
	public static void read1() {
		File book = new File("myFiles/frankenstein.txt");
		StringBuilder sb = new StringBuilder();

		try {
			FileReader in = new FileReader(book);

			// 한개씩 출력하는거보다 모아서 한번에 출력하는편이 훨씬 빠르다
			char[] cbuf = new char[2048];

			int len;
			while ((len = in.read(cbuf)) != -1) {
				sb.append(cbuf, 0, len);

			}
//			int ch;
//			while ((ch = in.read()) != -1) {
//				sb.append((char)ch);
//		}
			in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String read2() {

		File book = new File("myFiles/frankenstein.txt");
		StringBuilder sb = new StringBuilder();

		try {
			FileReader fin = new FileReader(book);
			BufferedReader in = new BufferedReader(fin);

			// readLine() : BufferedReader 추가된 한 줄씩 읽는 기능
			String line;
			while ((line = in.readLine()) != null) {
				sb.append(line);
				sb.append('\n');
			}

			// System.out.println(sb);

			// 최근에 열었던 순으로 닫는다
			in.close();
			fin.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
		return sb.toString();
	}

	public static void checkTime(long StartTime) {
		System.out.println("소요 시간 : " + (System.currentTimeMillis() - StartTime) + "ms");

	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		write0();
		checkTime(startTime);

		read0();
		checkTime(startTime);

		read1();
		checkTime(startTime);

		startTime = System.currentTimeMillis();
		read2();
		checkTime(startTime);
		
		startTime = System.currentTimeMillis();
		write1();
		checkTime(startTime);
		
		
		write2();
		checkTime(startTime);
	}

}

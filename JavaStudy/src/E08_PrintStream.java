import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

/*
 		# PrintStream, PrintWriter
 		
	 		- 좀 더 편리하게 출력하기 위한 기능들을 스트림에 추가해주는 클래스
	 			
	 		- print(), printf(), print(), ...	
	 		
	 		- BufferedWriter, Stream 	=> 기존 스트림에 성능 추가
	 		
	 		- PrintStream 				=> 기존 스트림에 편리 기능 추가 
	 		
	 		- PrintWriter 				=> 기존 Writer에 편리기능 추가
	 		  
 			
 
 
 
 
 
 */
public class E08_PrintStream {

	public static void main(String[] args) {
		try (
				FileWriter fout = new FileWriter(
						new File("myFiles/print_test.txt"), true);
				
				PrintWriter out = new PrintWriter(fout);
				
				FileOutputStream fout2 = new FileOutputStream(
						new File("myFiles/print_test2.txt"), true);
				
				BufferedOutputStream bout2 =
						new BufferedOutputStream(fout2, 2048);
						
				PrintStream out2 =new PrintStream(bout2);
		){
			out.printf("%d.%d.%d.%d\n", 123, 255, 101, 55);
			out.println("Hello world!");
			
			out2.println(" /)/)");
			out2.println("(  ..)");
			out2.println("(  >$)");
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		System.out.println("프로그램 종료");
	}

}

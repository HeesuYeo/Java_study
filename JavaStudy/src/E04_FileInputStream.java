import java.io.FileInputStream;

public class E04_FileInputStream {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream in = new FileInputStream("myFiles/test2.txt"); 
			
			//FileoutputStream 의 두번재 매개변수를 true로하면 
			//("myFiles/test2.txt"true); true로하면 append(누적)이된다 
			
			//read() : 데이터를 한 바이트씩 읽는다. 더 이상 읽을게 없는 경우 -1을 리턴. (EOF)
			//		   한 바이트씩 읽기 떄문에 한글 등의 2바이트 문자를 읽기가 힘들다
			
//			int result = 0;
//			
//			while(result != -1) {
//				result = in.read();
//				if(result == -1) {
//					break;
//				}
//				System.out.println((char)result);
//			}
			//파일의 모든내용을 한번에 byte[]로 읽기
			byte[] allData = in.readAllBytes();
			
			//byte[]을 요구하는 문자열 생성자로 재구성하기
		    System.out.println(new String(allData));
			
			
			// 더 이상 안쓸거라면 close
			in.close();
			
		}catch(Exception e) {
			System.out.println("뭔가 문제 생김");
		}
		System.out.println();
		System.out.println("끝");
		
	}

}

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

/*
		# throw
		
		 	- 원하는 예외를 발생시킨다
		 
		 	- 예외를 발생시키면 예외처리가 되어있는 경우에는 해당 처리를 따르고 
		   	  예외 처리가 없는 경우에는 프로그램을 강제 종료 한다
		 
		 # throws
		 
		 	- 해당 메서드 실행 도중 발생할 위험이 있는 예외들을 모두 명시 해놓은 것
		 	
		 	- 해당 메서드를 호출하는 곳에서 throws를 보고 예외처리를 구현해 놓을 수 있다
		 	
		 	- 메서드에 throws를 설정해놓으면 예외 처리에 대한 책임을 다른곳으로 미룰 수 있다
		 	
		 # 꼭 처리하지 않아도 되는 예외(RuntimeException)
		 
		 	- RuntimeException 클래스를 상속받은 예외들은 예외처리를 하지 않아도
		 	  컴파일에러가 발생하지 않음
		 	 
		 	- 반드시 처리할 필요가 없는 예외다
		 	
		 	ex) IndexoutBoundsException ...
		 	
	 	 # 반드시 예외 처리를 해놔야 하는 예외 (Exception)
       
        - Exception 클래스를 상속받은 예외들은 반드시 예외처리를 해야한다
        
        - 예외처리가 존재하지 않을 시 컴파일이 불가능하다
        
        - 해당 예외가 발생한 메서드에서 처리하고 싶지 않은 경우
          throws를 통해 예외 처리를 전가할 수 있다 (호출하는 곳으로 미룸)
    */

public class E02_Throw {

	  public static void dangerousMethoud() throws FileAlreadyExistsException, FileNotFoundException, ClassNotFoundException {
	      switch ((int)(Math.random() * 3)) {
	      case 0:
	         throw new FileAlreadyExistsException("0이 나와서 발생시킨 예외");
	      case 1:
	         throw new FileNotFoundException("1이 나와서 발생시킨 예외");
	      case 2:
	         throw new ClassNotFoundException("2이 나와서 발생시킨 예외");
	      }
	   }

	   
	   public static void main(String[] args) {
	      try {
	         dangerousMethoud();
	      } catch (FileAlreadyExistsException e) {
	         e.printStackTrace();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }
	   }
	}
//	      Scanner sc = new Scanner(System.in);
//	      int a = 10;
//	      if (a % 2 == 0) {
//	         throw new Exception("짝수는 안됩니다");
//	      }
//	      
//	      throw new InputMismatchException("그냥 맘에 안들어서 예외 발생시킴");
	//   }
	//}
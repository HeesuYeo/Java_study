/*
    사용자로부터 다운로드 시간을 초 단위로 입력받으면 
    x일 x시간 x분 x초 남았는지 환산하여 출력
    (필요 없는 단위는 출력 x)
    >>600
    ->10분 0초
    
    >>66656 
    -0일 18시간 30분 56초
 */
package quiz;

import java.util.Scanner;

public class B12_Downloadtime {

	public static void main(String[] args) {

		System.out.println("초를 입력해주세요 : ");

		Scanner sc = new Scanner(System.in);
		double second = sc.nextDouble();
		//반올림...?
		
		double day = Math.floor(second / 86400);
		double time = Math.floor((second % 86400) / (60 * 60));
		double min = Math.floor((second % 86400) % (60 * 60) / (60));
		double sec = Math.floor((second % 86400) % (60 * 60) % (60) / (1));

		System.out.printf("%.0f일 %.0f시간 %.0f분 %.0f초 ", day, time, min, sec);

		
	}

}
/*
  //답
 Scanner sc = new Scanner(System.in);
 
 System.out.println("초를 입력해주세요 : ");	
 int downloadTime = sc.nextInt();
 
 //영원히 변하지 않는 수는 대문자로 지정(final을 붙혀주면 변수대입 x 수정불가)
  * 못배운 개발자가 이상한 변수로 바꿀떄 
final int MIN = 60;
final int HOUR = MIN * 60;
final int DAY = HOUR * 24;
 
 
 
 if(downloadTime >= DAY) {
 System.out.printf("%d일 %d시간 %%d분 %%d초 \n", 
 downloadTime/DAY, downloadTime % DAY /HOUR, 
 downloadTime % HOUR/ MINUTE,downloadTime % MIN );
 	
 
 }else if(downloadTime > HOUR) {
 	System.out.printf("%d시간 %%d분 %d초\n", 
 	downloadTime/3600, downloadTime % 3600 /60, downloadTime % 60);
 	
 }else if(dowmloadTime >= MINUTE){	
 System.out.printf("%d분 %d초\n ", 
 downloadTime / 60, downloadTime % 60);
 
 }else{
 ("%d초\n ", downloadTime);
 */

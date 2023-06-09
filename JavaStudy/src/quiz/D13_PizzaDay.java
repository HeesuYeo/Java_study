/*
 	실행하면 오늘로부터 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어보세요
 	
 	파파스데이 : 매월 18일
 	파파프라이데이 : 홀수 번째 금요일
 	
 	※ 이벤트 날짜가 겹치는 경우 둘 모두 적용됨을 알려줘야함
 	
 */
package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D13_PizzaDay {

	public static boolean checkPapasDay(Calendar toCheck) {
		return toCheck.get(Calendar.DATE) == 18;
	}
	
	public static void printEventDays(Calendar start) {
		
		//Calendar event = start; = 얕은 복사
		Calendar event = (Calendar) start.clone(); //깊은복사
		SimpleDateFormat eventDayFormat = new SimpleDateFormat("yy -- MM -- dd E");
		
		for(int i = 0; i < 365; ++i) {
			event.add(Calendar.DATE,  1);
			System.out.print(eventDayFormat.format(event.getTime()) + " - ");
			
			boolean otherEventExist = false;
			boolean eventExist = false;
			
			if (event.get(Calendar.DATE) == 18) {
				System.out.print("파파스데이");
				eventExist = true;
				otherEventExist = true;
			}
			if(event.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY &&
				event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1) {
				if (otherEventExist) {
					System.out.print(", 파파프라이데이");			
				}else {
					System.out.println("파파프라이데이");
				}
				eventExist = true;
			}
			if (!eventExist) {
				
			}
		}
	}
	public static void main(String[] args) {
		
	}
}

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/*
 		# java.time.*
 			
 			- Calendar의 여러가지 단점을 보완한 시간을 다루는 클래스
 			
 			- set(), add()를 통해 원본 인스턴스를 변경하는 방식이 아니라
 			  새로운 시간 인스턴스를 반환하는 방식을 사용한다	
 			
 			- LocalDate(날짜만), LocalTime(시간만), LocalDateTime(날짜와 시간)
 			
 */

public class D14_Time {

	public static void main(String[] args) {

		// now() : 현재 시간의 인스턴스를 반환하는 메서드
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		// of() : 원하는 시간의 인스턴스를 반환하는 메서드
		LocalDate date;
		LocalTime time;
		System.out.println(date = LocalDate.of(1988, 8, 15));
		System.out.println(time = LocalTime.of(19, 38, 55, 123456789));
		System.out.println(LocalDateTime.of(date, time));

		// minusXXX() : 해당 항목을 원하는 만큼 더한 인스턴스를 반환
		// plusXXX() : 해당 항목을 원하는 만큼 더한 인스턴스를 반환

		LocalDate today = LocalDate.now();
		LocalDate before100days = today.minusDays(100);
		LocalDate after100Days = today.plusDays(100);
		LocalDate after100Years = today.plusYears(100); 

		System.out.println(today);
		System.out.println(before100days);
		System.out.println(after100Days);
		System.out.println(after100Years);

		// isAfter(), isBefore()로 인스턴스간 시점 비교가 가능
		
		System.out.println(after100Days.isAfter(after100Years));
		System.out.println(after100Days.isBefore(after100Years));

		// getxxx()으로 원하는 필드만 꺼내는것도 가능
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());

		// getDayOfWeek()는 int가 아닌 DayOfWeek 타입 인스턴스를 반환

		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println(dayOfWeek);
		System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		System.out.println(dayOfWeek.getValue());

		// TemporalAdjusters 클래스 : 날짜 조정 기능들이 모여있는 클래스
		// 메서드를 실행하면 temporalAdjuster을 반환
		TemporalAdjuster ta1 = TemporalAdjusters.dayOfWeekInMonth(3, dayOfWeek.WEDNESDAY);
		TemporalAdjuster ta2 = TemporalAdjusters.lastDayOfMonth();
		TemporalAdjuster ta3 = TemporalAdjusters.next(DayOfWeek.THURSDAY);
		TemporalAdjuster ta4 = TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY);

		// with(날짜조정기) : 해당 날짜로부터 날짜 조정기에 설정된 날짜 인스턴스를 반환
		LocalDate 세번째수요일 = today.with(ta1);
		System.out.println(세번째수요일);

		LocalDate 이번달마지막날 = today.with(ta2);
		System.out.println(이번달마지막날);

		LocalDate 돌아오는목요일 = today.with(ta3);
		System.out.println(돌아오는목요일);

		LocalDate 돌아오는목요일오늘포함 = today.with(ta4);
		System.out.println(돌아오는목요일오늘포함);

		System.out.println(today.with(ChronoField.DAY_OF_MONTH, 30));
		System.out.println(today.with(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH, 4));
	}

}

package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import myobj2.parking.Car;
import myobj2.parking.CarType;

public class D14_ParkingSystem {

	public static String checkRestricted(Car car, LocalDate date) {
		if (car.getType() == CarType.DISABLED) {
			return String.format("[%s] 장애인 차량은 차량5부제 제외차량입니다.", car,
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if (car.getType() == CarType.KID) {
			return String.format("[%s] 유아동승 차량은 차량5부제 제외차량입니다.", car,
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if (car.getType() == CarType.LIGHTCAR) {
			return String.format("[%s] 경차는 차량5부제 제외차량입니다.", car,
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		}

		// return String.format("[%s]는 %s에 출입금지입니다.", car,
		// date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));

		char lastNum = car.getNumber().charAt(car.getNumber().length() - 1);

		// ※ &&는 ||보다 먼저 연산되므로 주의해야 한다
		if ((lastNum == '1' || lastNum == '6') && date.getDayOfWeek() == DayOfWeek.MONDAY) {
			return String.format("[%s]는 %s에 출입금지입니다.", car,
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '2' || lastNum == '7') && date.getDayOfWeek() == DayOfWeek.TUESDAY) {
			return String.format("[%s]는 %s에 출입금지입니다.", car,
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '3' || lastNum == '8') && date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
			return String.format("[%s]는 %s에 출입금지입니다.", car,
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '4' || lastNum == '9') && date.getDayOfWeek() == DayOfWeek.THURSDAY) {
			return String.format("[%s]는 %s에 출입금지입니다.", car,
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '5' || lastNum == '0') && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
			return String.format("[%s]는 %s에 출입금지입니다.", car,
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else {
			return String.format("[%s] 주차 가능합니다.", car,
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		}

	}

	public static void main(String[] args) {

		List<Car> cars = new ArrayList<>(100);

		for (int i = 0; i < 10; ++i) {
			cars.add(new Car());

		}
		LocalDate checkDay = LocalDate.now();
		final int WEEK = 7;

		for (int i = 0; i < WEEK; ++i) {	// 여기다 7이라고 쓰는 것도 안 좋음. 처음보는 사람은 모름

			checkDay = checkDay.plusDays(1);
			System.out.println(checkDay.getDayOfWeek());// + "TEST:");


			// test
			for (Car car : cars) {
				String result = checkRestricted(car, checkDay);
				System.out.println("\t" + result);
			}
		}

	}

}

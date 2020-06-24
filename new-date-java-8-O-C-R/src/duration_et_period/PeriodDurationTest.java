package duration_et_period;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationTest {

	public static void main(String[] args) {

		// Toujours notre 25 Décembre 2018 a 13H37
		LocalDateTime ldt = LocalDateTime.of(2018, Month.DECEMBER, 25, 13, 37, 0);
		System.out.println("ldt : " + ldt);

		LocalDateTime ldt2 = ldt.plus(3, ChronoUnit.YEARS);
		System.out.println("ldt2 : " + ldt2);

		LocalDateTime ldt3 = ldt.minusMinutes(1337);
		System.out.println("ldt3 : " + ldt3);

		Period p = Period.between(ldt.toLocalDate(), ldt2.toLocalDate());
		System.out.println("Période : " + p);

		Duration d = Duration.between(ldt.toLocalTime(), ldt3.toLocalTime());
		// difference du temp des dates 1 hour, 43 minutes and 0 seconds,6180 seconds
		System.out.println("Durée : " + d.getSeconds());

		// difference des jours
		System.out.println("Ecart en jour : " + ChronoUnit.DAYS.between(ldt, ldt2));

	}
}
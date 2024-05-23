import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		DateSorter dateSorter = new DateSorter();
		List<LocalDate> dates = List.of(
				LocalDate.of(2004, 7, 1),
				LocalDate.of(2005, 1, 2),
				LocalDate.of(2007, 1, 1),
				LocalDate.of(2032, 5, 3)
		);
		dateSorter.sortDates(dates)
				.forEach(System.out::println);

	}
}

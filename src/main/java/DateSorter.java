import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DateSorter {
	private final String SORTING_LETTER = "r";

	public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
		List<LocalDate> withSortingLetter = unsortedDates.stream()
				.filter(this::existsLetterInMonth)
				.sorted(Comparator.naturalOrder())
				.toList();

		List<LocalDate> withoutSortingLetter = unsortedDates.stream()
				.filter(date -> !existsLetterInMonth(date))
				.sorted(Comparator.reverseOrder())
				.toList();

		List<LocalDate> sortedDates = new ArrayList<>();
		sortedDates.addAll(withSortingLetter);
		sortedDates.addAll(withoutSortingLetter);

		return sortedDates;

	}

	private boolean existsLetterInMonth(LocalDate date) {
		String monthName = date.getMonth().name().toLowerCase();
		return monthName.contains(SORTING_LETTER);
	}

}

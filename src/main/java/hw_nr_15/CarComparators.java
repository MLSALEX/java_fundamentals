package hw_nr_15;

import java.util.Comparator;

public enum CarComparators {
    BY_YEAR_MADE(Comparator.comparing(car -> car.yearMade)),
    BY_NAME(Comparator.comparing(car -> car.name));
    private final Comparator<Car> comparator;


    CarComparators(Comparator<Car> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Car> getComparator() {
        return comparator;
    }
}

package hw_nr_15;

import java.util.*;

public class Car implements Comparable<Car>{
    public static int globalId = 0;
    int id;
    public int yearMade;
    public String name;

    public Car(int yearMade, String name) {
        globalId++;
        this.id = globalId;
        this.yearMade = yearMade;
        this.name = name;
    }

    @Override
    public int compareTo(Car o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", yearMade=" + yearMade +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car c1 = new Car(2023, "BMW");
        Car c2 = new Car(2016, "Skoda");
        Car c3 = new Car(2015, "Audi");
        Car c4 = new Car(2019, "Opel");

        Set<Car> cars = new HashSet<>(
                Arrays.asList(c1, c2, c4,c3)
        );
        Set<Car> carsTreeSet = new TreeSet<>(
                Arrays.asList(c1, c2, c4,c3)
        );

        cars.forEach(e -> System.out.println(e));
        System.out.println("--------------------");
        carsTreeSet.forEach(e -> System.out.println(e));

        System.out.println("-------cars sorted by year descending-------");
        cars.stream()
                .sorted(CarComparators.BY_YEAR_MADE.getComparator().reversed())
                .forEach(e -> System.out.println(e));
        System.out.println("-------cars sorted by name-------");

        Comparator<Car> comparingByName = Comparator.comparing(car -> car.name);
        carsTreeSet.stream()
                .sorted(comparingByName)
                .forEach(car -> System.out.println(car));

//        carsTreeSet.stream()
//                .sorted(CarComparators.BY_NAME.getComparator())
//                .forEach(e -> System.out.println(e));
    }


}

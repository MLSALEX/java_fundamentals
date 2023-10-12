package homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Andrei", "Rusev", 35, true);
        Person p2 = new Person("Alexey", "Soloviov", 30, true);
        Person p3 = new Person("Maria", "Sharapova", 25, false);
        Person p4 = new Person("Serghei", "Panaitov", 38, false);
        Person p5 = new Person("Anna", "Snatkina", 28, true);
        Person p6 = new Person("Elena", "Prekrasnaia", 40, false);
        Person p7 = new Person("Dmitrii", "Naghiev", 48, false);
        Person p8 = new Person("Max", "Boiko", 34, true);
        Person p9 = new Person("Serghei", "Rusev", 37, true);
        Person p10 = new Person("Anatolii", "Arabadji", 35, false);

        List<Person> personList = new ArrayList<>(
                Arrays.asList(
                        p1, p2, p3, p4, p5, p6, p7, p8, p9, p10
                )
        );

        System.out.println("----5 workers: aged >25, payed hourly ----");
        List<Person> workers = personList.stream()
                .filter(person -> person.getAge() >25)
                .filter(person -> person.isPayedByHour)
                .limit(5)
                .toList();
        workers.forEach(person-> System.out.println(person.getName() + " " + person.getSurname()));

        System.out.println("----aged > 30, name starts with A-----");
        List<Person> workers2 = personList.stream()
                .filter(person ->person.getAge() >30)
                .filter(person -> person.surname.startsWith("A"))
                .toList();
        workers2.forEach(person-> System.out.println(person.getName() + " " + person.getSurname()));

        System.out.println("----first worker aged 37----");
        Optional<Person> workerAged37 = personList.stream()
                .filter(person -> person.getAge() == 37)
                .findFirst();
                if(workerAged37.isPresent()){
                    System.out.println(workerAged37.get().name);
                }


    }
}

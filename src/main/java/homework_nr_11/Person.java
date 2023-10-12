package homework_nr_11;

public class Person {
    String name;
    String surname;
    Integer age;
    boolean isPayedByHour;

    public Person(String name, String surname, Integer age, boolean isPayedByHour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isPayedByHour() {
        return isPayedByHour;
    }
}







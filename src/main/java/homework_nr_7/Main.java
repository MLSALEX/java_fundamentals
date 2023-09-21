package homework_nr_7;

public class Main {
  

    public static void main(String[] args) {
        Manager m1 = new Manager("Alex", "Blunt", "Point", 5, "Spring");
        Programmer p1 = new Programmer("Vitalii", "Semionov", "Point", "Java", 2);

        m1.printMyName();
        m1.work();
        p1.printMyName();
        p1.work();

        Person[] person = new Person[]{m1, p1};

    }
}
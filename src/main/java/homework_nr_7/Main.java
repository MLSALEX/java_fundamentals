package homework_nr_7;

public class Main {
  

    public static void main(String[] args) {
        Manager m1 = new Manager("Alex", "Blunt", "Point", 5, "Spring");
        Programmer p1 = new Programmer("Vitalii", "Semionov", "Point", "Java", 2);

        m1.printMyName();
        m1.work();
        p1.printMyName();
        p1.work();

        System.out.println("-----------");
        Person[] person = new Person[]{m1, p1};
        for(int i= 0; i!= person.length; i++){
            if(person[i] instanceof Manager){
                ((Manager) person[i]).work();
            }
        }

    }
}
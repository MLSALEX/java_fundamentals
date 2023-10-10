package homework_nr_10;

import java.util.List;
import java.util.function.Predicate;

public class Employee {
    String name;
    String surname;
    Integer age;
    String department;
    public Employee(String name, String surname, Integer age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }
    public static void testEmployee (List<Employee>inputList, Predicate<Employee>testMethod){
        for (Employee employee:
                inputList) {
            if(testMethod.test(employee))
                System.out.println(employee.name + " " + employee.surname);
        }
    }
}

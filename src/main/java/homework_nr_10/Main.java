package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static homework_nr_10.Employee.testEmployee;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Bob", "Black", 25, "Software Engineering"));
        employeeList.add(new Employee("Alex", "Brown", 20, "Mobile Development"));
        employeeList.add(new Employee("Max", "Buga", 30, "Web Development"));
        employeeList.add(new Employee("David", "Rusev", 32, "Design Graphic"));

        System.out.println("---Employee working in Software Department----");
        Predicate<Employee> ifEmployeeWorksForSoftwareEng = employee -> employee.department.equals("Software Engineering");
        testEmployee(employeeList, ifEmployeeWorksForSoftwareEng);

        System.out.println("---Employee over 20----");
        Predicate<Employee> ifEmployeeAgedOver20 = employee -> (employee.age >20);
        testEmployee(employeeList, ifEmployeeAgedOver20);

        System.out.println("---Employee whose name starts with A----");
        Predicate<Employee> ifNameStartsWithA = employee -> (employee.name.startsWith("A"));
        testEmployee(employeeList, ifNameStartsWithA);
    }
}

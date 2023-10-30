package hw_nr_16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person{
    public String name;
    public  int age;
    public double grade;

    public Person(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> people = new ArrayList<Person>();
        double sum = 0.0;
        int youngestAge = Integer.MAX_VALUE;
        int oldestAge = Integer.MIN_VALUE;
        String youngestName= "";
        String oldestName = "";
        File f1 = new File("src/main/java/hw_nr_16/input.txt");
        Scanner scanner = new Scanner(f1);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            double grade = Double.parseDouble(parts[2]);

            Person person = new Person(name, age, grade);
            people.add(person);
            sum += grade;
            if (age < youngestAge){
                youngestAge = age;
                youngestName = name;
            }
            if (age > oldestAge){
                oldestAge = age;
                oldestName = name;
            }
        }
        scanner.close();

        double averageGrade = sum/people.size();

        FileWriter fw = new FileWriter("src/main/java/hw_nr_16/output.txt");
        fw.write("Average grade is: " + averageGrade + "\n");
        fw.write("The youngest person: " + youngestName + " (age:" + youngestAge +")"  + "\n");
        fw.write("The oldest person: " + oldestName + " (age:" + oldestAge +")"  + "\n");
        fw.close();

    }
}

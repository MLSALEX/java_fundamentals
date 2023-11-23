package hw_nr_21;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String connectionString = "jdbc:postgresql://localhost/students?user=postgres&password=postgres";

    public static void main(String[] args) {

        addNewStudent();
        refreshGrade();
        deleteStudent();
        displayStudents();
    }
    public static void addNewStudent(){
        try (Connection c = DriverManager.getConnection(connectionString)) {
            PreparedStatement preparedStatement = c.prepareStatement(SQLQueries.INSERT_NEW_STUDENT.query);
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Enter student's name");
            String name = scanner.nextLine();
            preparedStatement.setString(1, name);
            System.out.println("Enter student's age");
            int age = scanner.nextInt();
            preparedStatement.setInt(2, age);
            System.out.println("Enter student's grade");
            int grade = scanner.nextInt();
            preparedStatement.setInt(3, grade);
            preparedStatement.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void refreshGrade(){
        try (Connection c = DriverManager.getConnection(connectionString)) {
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Enter student's id");
            int id = scanner.nextInt();
            System.out.print("Enter new grade: ");
            int grade = scanner.nextInt();
            PreparedStatement preparedStatement = c.prepareStatement(SQLQueries.REFRESH_GRADE.query);
            preparedStatement.setInt(2, id);
            preparedStatement.setInt(1, grade);
            preparedStatement.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteStudent(){
        try (Connection c = DriverManager.getConnection(connectionString)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student's id");
            int id = scanner.nextInt();
            PreparedStatement preparedStatement = c.prepareStatement(SQLQueries.DELETE_STUDENT.query);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void displayStudents(){
        try (Connection c = DriverManager.getConnection(connectionString)) {
            PreparedStatement preparedStatement = c.prepareStatement(SQLQueries.SHOW_ALL_STUDENTS.query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("ID \t name \t age \t grade");
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name =  resultSet.getString("name");
                int age  = resultSet.getInt("age");
                int grade = resultSet.getInt("grade");
                System.out.println(id + " \t " + name + " \t " + age + " \t " + grade + " \t ");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}

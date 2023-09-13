package homework_nr_4;

public class Circle {
    int radius;
    public static void main(String[] args) {
        calculateArea(3);
        Circle.calculateArea(5);
    }

    public static void calculateArea(int radius){
        float a = 3.14f*radius*radius;
        System.out.println(a);
    }

    public Circle(int radius){

    }

}

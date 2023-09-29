package homework_nr_4;

public class Circle {
    float radius;

    public Circle(float radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI * radius*radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(2);

        System.out.println(c1.calculateArea());
    }
}

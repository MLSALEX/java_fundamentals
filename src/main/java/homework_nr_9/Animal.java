package homework_nr_9;

public interface Animal {
    static void breathOxigen() {
        System.out.println("Animal breathes oxigen using lungs");
    }

    void sleep();

    void move();

    default void makeSound() {
    }

}

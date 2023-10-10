package homework_nr_9;

public class Elephant extends Herbivore implements Animal {
    @Override
    public void sleep() {
        System.out.println("Elephant sleeps 2 hours per day");
    }

    @Override
    public void move() {
        System.out.println("Elephant walks");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets when it's scared");
    }

    @Override
    public void eatPlants() {
        System.out.println("Elephant eats plants");
    }
}

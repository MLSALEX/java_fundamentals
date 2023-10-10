package homework_nr_9;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        elephant.sleep();
        elephant.move();
        elephant.makeSound();
        Animal.breathOxigen();
        Herbivore elephant2 = new Elephant();
        elephant2.eatPlants();
        elephant2.eatFruits();
    }
}

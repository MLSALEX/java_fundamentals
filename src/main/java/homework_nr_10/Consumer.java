package homework_nr_10;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        List<String> listOfItems = new ArrayList<>();
        listOfItems.add("apple");
        listOfItems.add("juice");
        listOfItems.add("bread");

        java.util.function.Consumer<String> printAllItems = item -> System.out.println(item);
        listOfItems.forEach(printAllItems);
//        printItem(listOfItems, printAllItems);
    }
//    public static void printItem(List<String>listOfItems, Consumer<String> consumer){
//        for(String item:listOfItems){
//            consumer.accept(item);
//        }
//    }
}

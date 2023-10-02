package homework_nr_10;

import java.util.function.Supplier;
public class SupplierFunc {
    public static void main(String[] args) {
        Supplier<Double> returnRandom = () -> Math.random();
        System.out.println(Math.round(returnRandom.get()*10));
    }
}

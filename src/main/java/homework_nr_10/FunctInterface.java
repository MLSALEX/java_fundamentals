package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctInterface {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for(int i = 0; i<=10; i++) {
            intList.add(i);
        }
        Function<Integer,Integer> returnNmbrMultipliedBy2 = number -> number*2;
        applyForEacElement(intList,returnNmbrMultipliedBy2);
    }
    public static void applyForEacElement(List<Integer> intList, Function<Integer,Integer> inputFunction){
        for (Integer number:
             intList) {
            System.out.println(inputFunction.apply(number));
        }
    }
}

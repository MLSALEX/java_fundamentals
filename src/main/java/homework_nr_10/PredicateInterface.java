package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for(int i = 0; i<=20; i++) {
            intList.add(i);
        }
        Predicate<Integer> testForOddNmbr = (Integer i) ->i % 2 ==1;
        testList(intList,testForOddNmbr);
    }
    public static void testList(List<Integer>inputList, Predicate<Integer> testMethod){
        for(Integer element:inputList){
            if(testMethod.test(element))
                System.out.println(element);
        }
    }
}

package homework_nr_12;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Month[] allMonths = Month.values();
        for (Month element:
             allMonths) {
            System.out.println(element);
        }

        System.out.println("-------------------");
        System.out.println(FuelTypes.CNG + " is liquid fuel: " + FuelTypes.CNG.isLiquidFuel());
        System.out.println(FuelTypes.DIESEL + " is liquid fuel: " +FuelTypes.DIESEL.isLiquidFuel());

        System.out.println("-------------------");
        int i = 3;
        printResult(3, CheckInteger.CHECK_IF_NEGATIVE);
    }
    public static void printResult(int i, CheckInteger checkInteger){
        System.out.println("the result of checking nr " + i
                + " for " + checkInteger  + " is: " + checkInteger.getCheckInteger().test(i));
    }
}

package homework_nr_3;

public class HomeworkNr3 {
    public static void main(String[] args) {

        // nr4
        int month = 3;

        switch(month){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }

        //Nr5
        for (int i=100; i<=1000; i++){
            if (i%5==0) {
                System.out.print(i+",");
            }
        }


        System.out.println();
        //Nr6
        double sum= 0;
        for( double i = 1; i<=98; i+=2){
            double j =i+2;
            sum += i/j;
            System.out.printf(i+"/"+j+"+");
        }
        System.out.println();
        System.out.println("sum = " + sum);

//        System.out.println();
//
//        int sum= 0;
//        for( int i = 1; i<=98; i+=2){
//            int j =i+2;
//            sum += i/j;
//            System.out.printf(i+"/"+j+"+");
//        }
//        System.out.println();
//        System.out.println("sum = " + sum);
    }
}
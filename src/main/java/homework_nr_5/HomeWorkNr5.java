package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int [100];
        for(int index = 0;index< numbers.length; index++){
            numbers[index]=index;
            System.out.println(numbers[index]);
        }

        // Nr6
        int sum =0;
        long multiply = 1;
        for(int index = 1;index< numbers.length; index++){
            if(numbers[index]%2==0){
                sum+= numbers[index];
            } else {
                multiply *= numbers[index];
            }
        }
        System.out.println("The sum of even numbers = " + sum);
        System.out.println("The multiplication of odd numbers = " + multiply);

        //Nr7
        System.out.println("copyNumbers :");
        int [] copyNumbers = new int[100];
        System.arraycopy(numbers, 0, copyNumbers, 0, 100);

        for(int index = 0;index< copyNumbers.length; index++){
            copyNumbers[index]=index;
            System.out.println(copyNumbers[index]);
        }
    }

}

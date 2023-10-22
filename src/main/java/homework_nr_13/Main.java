package homework_nr_13;

public class Main {
    public static void main(String[] args) throws InvalidRangeException {
        System.out.println(countDivisibleBy7Numbers(240, 85));
    }
    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Inferior limit cannot be greater than the superior one");
        }

        int amountOfNumbers = 0;
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0)
                amountOfNumbers++;
        }
        return amountOfNumbers;
    }
}

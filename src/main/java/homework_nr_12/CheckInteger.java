package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD (i -> i %2 !=0),
    CHECK_IF_EVEN(i -> i % 2==0),
    CHECK_IF_NEGATIVE(i -> i < 0),
    CHECK_IF_POSITIVE(i -> i >= 0);
    private Predicate <Integer> checkInteger;
    CheckInteger (Predicate<Integer> checkInteger) {
        this.checkInteger = checkInteger;
    }

    public Predicate<Integer> getCheckInteger() {
        return checkInteger;
    }
}

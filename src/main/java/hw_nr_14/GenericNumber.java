package hw_nr_14;

import java.io.Serializable;

public class GenericNumber<T extends Number & Serializable>{
    public T value;

    public GenericNumber(T value) {
        this.value = value;
    }

}

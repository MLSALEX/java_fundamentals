package homework_nr_12;

public enum FuelTypes {
    GASOLINE,
    DIESEL,
    CNG,
    LPG,
    ELECTRIC;

    public boolean isLiquidFuel(){
        return this == GASOLINE || this == DIESEL;
    }
}

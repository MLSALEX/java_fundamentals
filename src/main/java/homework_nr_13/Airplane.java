package homework_nr_13;

public class Airplane {
   public String manufacturer;
   public String model;
   public int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) throws AirplaneExceptions {
        if(manufacturer==null || manufacturer.isEmpty())
            throw new InvalidManufacturerException("Invalid manufacturer");
        this.manufacturer = manufacturer;

        if(model==null || model.isEmpty())
            throw new InvalidModelException("Invalid model");
        this.model = model;

        if(nrOfEngines == 0 || nrOfEngines % 2 !=0)
            throw new InvalidNrOfEnginesException("Invalid number of engines");
        this.nrOfEngines = nrOfEngines;
    }

    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) throws AirplaneExceptions {
        if(manufacturer==null || manufacturer.isEmpty()) {
            System.out.println("Invalid manufacturer");
            return null;
        }
        if(model==null || model.isEmpty()) {
            System.out.println("Invalid model");
            return null;
        }
        if(nrOfEngines == 0 || nrOfEngines % 2 !=0){
            System.out.println("Invalid number of engines");
            return null;
        }
        return new Airplane(manufacturer, model, nrOfEngines);
    }

    public static Airplane createAirplaneEAFP (String manufacturer, String model, int nrOfEngines) {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (AirplaneExceptions e) {
            e.printStackTrace();

        }
        return null;
    }

    public static Airplane createAirplaneEAFP_2 (String manufacturer, String model, int nrOfEngines) throws AirplaneExceptions{
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (InvalidManufacturerException e) {
            System.out.println("Failed to create a new airplane. Invalid manufacturer");
        } catch (InvalidModelException e) {
            System.out.println("Failed to create a new airplane. Invalid model");
        } catch (InvalidNrOfEnginesException e) {
            System.out.println("Failed to create a new airplane. Invalid number of engines");
        }
        return null;
    }
}

class AirplaneMain{
    public static void main(String[] args) throws AirplaneExceptions {

        Airplane airbus = new Airplane("Airbus", "357", 2);
        Airplane boeing = new Airplane("Boeing", "735", 2);

        airbus.createAirplaneLBYL("Airbus", "357", 1);
        System.out.println("-----------------------");
        airbus.createAirplaneEAFP("Airbus", "", 2);
        boeing.createAirplaneEAFP_2("", "448", 2);
    }
}

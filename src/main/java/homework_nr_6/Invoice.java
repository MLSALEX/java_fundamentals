package homework_nr_6;

public class Invoice {
    String deviceModel;
    String productDescription;
    int nrProductsPurchased;
    double price;

    public Invoice(String deviceModel, String productDescription, int nrProductsPurchased, double price) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.nrProductsPurchased = nrProductsPurchased;
        this.price = price;
    }

    public static void main(String[] args) {
        Invoice i1 = new Invoice("P2500W", "printer", 2, 2900);

        System.out.println(i1.getAmount());
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getNrProductsPurchased() {
        return nrProductsPurchased;
    }

    public void setNrProductsPurchased(int nrProductsPurchased) {
        this.nrProductsPurchased = nrProductsPurchased;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        if (nrProductsPurchased < 0) {
            nrProductsPurchased = 0;
        }
        if (price < 0) {
            price = 0.0;
        }
        return nrProductsPurchased * price;
    }
}

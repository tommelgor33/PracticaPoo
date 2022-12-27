package JavaYolo;

public class UberVan extends Car {
    String brand, model;

    public UberVan(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
        }
}
package JavaYolo;

public class UberX extends Car {
        String brand, model;

        public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
        }
    
}

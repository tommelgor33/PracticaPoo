package JavaYolo;

 class Car {
    Integer id;
    String license;
    String driver;
    Integer passegenger;

public Car(String license, Account driver){
    this.license = license;
    this.driver = driver.name;
}

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public Integer getPassegenger() {
        return passegenger;
    }
    public void setPassegenger(Integer passegenger) {
        if (passegenger== 4){
        this.passegenger = passegenger;
            }else{
                System.out.println("Necesitas asigar 4 Pajeros");
            }
    }

}

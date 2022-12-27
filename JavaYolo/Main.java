package JavaYolo;

public class Main{
    public static void main(String[] args){
        System.out.println("Hola mundo!");

        Car car = new Car("amq123", new Account("manolo de las nieves", 030345));
        car.setPassegenger(4);
        System.out.println(car.getDriver() + " Conduce el: " + car.getLicense());


    }
}
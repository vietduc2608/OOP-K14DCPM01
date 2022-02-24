package oo.Day_6;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarColor("Black");
        car.setCarPrice(0);
        System.out.println("Car color: " + car.getCarColor());
        System.out.println("Car price: " + car.getCarPrice());
    }
    
}

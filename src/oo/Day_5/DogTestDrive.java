package oo.Day_5;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSize(4); //= -1;
        System.out.println("Dog size: " + dog.getSize());

        dog.name = "zzz";
    }
}

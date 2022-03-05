package oo.Day_6;

public class Cat extends Animal {
    @Override
    protected void eat() {
        System.out.println("Cat Eating...");
    }
    @Override
    protected void makeNoise() {
        System.out.println("Cat Make Noise...");
    }
    public void chaseCat(){
        System.out.println("Cat Chasing ...");
    }
}

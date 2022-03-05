package oo.Day_6;

public class Dog extends Animal {
    @Override
    protected void eat() {
        System.out.println("Dog Eating...");
    }
    @Override
    protected void makeNoise() {
        System.out.println("Gau gau ...");
    }
    public void tailWagging(){
        System.out.println("Dog Tailling Wagging ");
    }
}

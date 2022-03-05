package oo.Day_6;

public class Lion extends Animal{
    @Override
    protected void makeNoise() {
        System.out.println("Lion Making Noise...");
    }

    @Override
    protected void eat() {
        System.out.println("Lion Eating...");
    }
}

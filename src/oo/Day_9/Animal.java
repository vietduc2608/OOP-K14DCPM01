package oo.Day_9;

public class Animal{
    private String picture, food;
    private int hunger;
    

    //method - behavior
    protected void makeNoise(){
        System.out.println("Making noise ....");
    }
    protected void eat(){
        System.out.println("Eating ...");
    }
    protected void sleep(){
        System.out.println("Sleeping ...");
    }
    protected void roam(){
        System.out.println("Roaming ...");
    }
}

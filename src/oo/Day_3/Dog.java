package oo.Day_3;

public class Dog {
    String breed, name;
    int size;
    
    public Dog(){}

    public Dog(String breed, String name, int size) {
        this.breed = breed;
        this.name = name;
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    
    public void bark(){
        if(size < 14){
            System.out.println("Ruff! Ruff!");
        }
        else{
            System.out.println("Wroff! Wroff!");
        }
    }

    public void setBigger()
    {
        size += 5;
    }
    
    public void run()
    {
        System.out.println("Running...");
        this.bark();
    }
}

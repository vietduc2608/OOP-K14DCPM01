package oo.Day_6;

public class Circle extends Shape {
    @Override
    public void rotate(){
        System.out.println("Xoay hình tròn 360 độ!");
    }
    
    @Override
    public void playSound(){
        System.out.println("Play sound: " +this.getSoundFile() + " music");
    }
}

package oo.Day_2;

public class TamGiac {
    String sound;

    public TamGiac(String sound) {
        this.sound = sound;
    }
    
    public String getSound() {
        return sound;
    }


    public void setSound(String sound) {
        this.sound = sound;
    }

    public TamGiac(){}

    public void TamGiac(){
        System.out.println("    *    ");
        System.out.println(" *     * ");
        System.out.println("*********");
    }

    public void rotateTG(){
        System.out.println("Xoay hình tam giác 360 độ!");
    }

    public void playTG(){
        System.out.println("gâu...gâu....gâu....");
    }   
}

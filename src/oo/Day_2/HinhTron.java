package oo.Day_2;

public class HinhTron {
    String sound;
   
    public HinhTron(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public HinhTron(){}

    public void HinhTron(){
        System.out.println("   -------   ");
        System.out.println(" -         - ");
        System.out.println("-           -");
        System.out.println(" -         - ");
        System.out.println("   -------   ");
    }

    public void rotateHT(){
        System.out.println("Xoay hình tròn 360 độ!");
    }

    public void playsoundHT(){
        System.out.println("shiba.....shiba.....");
    }
}

package oo.Day_2;

public class HinhVuong {
    String sound;

    public HinhVuong(String sound) {
        this.sound = sound;
    }
    

    public String getSound() {
        return sound;
    }


    public void setSound(String sound) {
        this.sound = sound;
    }

    public HinhVuong(){}

    public void HinhVuong(){
        System.out.println("------");
        System.out.println("-    -");
        System.out.println("------");
    }

    public void rotateHV(){
        System.out.println("Xoay hình vuông 360 độ!");
    }

    public void playHV(){
        System.out.println("cục tác...cục tác....");
    }

}

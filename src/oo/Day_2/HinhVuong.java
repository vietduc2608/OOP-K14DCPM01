package oo.Day_2;

public class HinhVuong {
    String soundFile;

 
    public HinhVuong(String soundFile) {
        this.soundFile = soundFile;
    }

    public String getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public HinhVuong(){}

    // public void HinhVuong(){
    //     System.out.println("------");
    //     System.out.println("-    -");
    //     System.out.println("------");
    // }

    public void rotateHV(){
        System.out.println("Xoay hình vuông 360 độ!");
    }

    public void playsoundHV(){
        System.out.println("Play sound: " +this.soundFile);
    }

}

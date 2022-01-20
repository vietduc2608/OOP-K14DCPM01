package oo.Day_2;

public class HinhTron {
    String soundFile;
   
    public HinhTron(String soundFile) {
        this.soundFile = soundFile;
    }

    public String getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public HinhTron(){}

    // public void HinhTron(){
    //     System.out.println("   -------   ");
    //     System.out.println(" -         - ");
    //     System.out.println("-           -");
    //     System.out.println(" -         - ");
    //     System.out.println("   -------   ");
    // }

    public void rotateHT(){
        System.out.println("Xoay hình tròn 360 độ!");
    }

    public void playsoundHT(){
        System.out.println("Play sound: " +this.soundFile);
    }
}

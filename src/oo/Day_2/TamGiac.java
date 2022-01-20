package oo.Day_2;

public class TamGiac {
    String soundFile;

    public TamGiac(String soundFile) {
        this.soundFile = soundFile;
    }

    public String getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public TamGiac(){}

    // public void TamGiac(){
    //     System.out.println("    *    ");
    //     System.out.println(" *     * ");
    //     System.out.println("*********");
    // }

    public void rotateTG(){
        System.out.println("Xoay hình tam giác 360 độ!");
    }

    public void playsoundTG(){
        System.out.println("Play sound: " +this.soundFile + " music");
    }   
}

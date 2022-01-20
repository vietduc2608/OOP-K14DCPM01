package oo.Day_2;

public class Amoeba {
    String soundFile;

    public Amoeba(String soundFile) {
        this.soundFile = soundFile;
    }

    public String getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Rotating 360 ...");
    }

    void playSound(){
        System.out.println("Play file sound: " +this.soundFile + " music");
    }
}

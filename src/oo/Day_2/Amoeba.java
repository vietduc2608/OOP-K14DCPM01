package oo.Day_2;

public class Amoeba {
    private String soundFile;
    private double xPoint, yPoint;

    public Amoeba(String soundFile, double xPoint, double yPoint) {
        this.soundFile = soundFile;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public String getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public double getxPoint() {
        return xPoint;
    }

    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public double getyPoint() {
        return yPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    public Amoeba(){

    }

    void rotate(){
        System.out.println("Rotating 360 ... at xPoint: " +this.xPoint + "at yPoint: " + this.yPoint);
    }

    void playSound(){
        System.out.println("Play file sound: " +this.soundFile + " music");
    }
}

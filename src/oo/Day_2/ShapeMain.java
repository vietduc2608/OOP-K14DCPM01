package oo.Day_2;

public class ShapeMain {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        hv.rotateHV();
        hv.playsoundHV();

        HinhTron ht = new HinhTron();
        ht.rotateHT();
        ht.playsoundHT();
        
        TamGiac tg = new TamGiac();
        tg.rotateTG();
        tg.playsoundTG();

    }
}

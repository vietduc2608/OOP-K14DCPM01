package oo.Day_2;

public class ShapeMain {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong("hinhVuong.aif");
        hv.rotateHV();
        hv.playsoundHV();

        HinhTron ht = new HinhTron("hinhTrong.aif");
        ht.rotateHT();
        ht.playsoundHT();
        
        TamGiac tg = new TamGiac("tamGiac.aif");
        tg.rotateTG();
        tg.playsoundTG();

    }
}

package oo.Day_2;

public class ShapeMain {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong("hinhVuong.aif");
        hv.HinhVuong();
        hv.rotateHV();
        hv.playsoundHV();

        HinhTron ht = new HinhTron("hinhTrong.aif");
        ht.HinhTron();
        ht.rotateHT();
        ht.playsoundHT();
        
        TamGiac tg = new TamGiac("tamGiac.aif");
        tg.TamGiac();
        tg.rotateTG();
        tg.playsoundTG();

    }
}

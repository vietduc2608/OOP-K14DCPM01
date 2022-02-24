package oo.Day_6;

public class SinhVien {
    private int maSv;
    private String hoTen;
    private float diemLt , diemTh ;

    public SinhVien(){}

    public int getMaSv() {
        return maSv;
    }
    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public float getDiemLt() {
        return diemLt;
    }
    public void setDiemLt(float diemLt) {
        this.diemLt = diemLt;
    }
    public float getDiemTh() {
        return diemTh;
    }
    public void setDiemTh(float diemTh) {
        this.diemTh = diemTh;
    }

    public SinhVien(int maSv, String hoTen, float diemLt, float diemTh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diemLt = diemLt;
        this.diemTh = diemTh;
    }

    private float tinhDiemTb(){
       float tb = (this.diemLt + this.diemTh) / 2;
       return tb;
    }

    @Override
    public String toString() {
        return "SinhVien \nhoTen=" + hoTen + " \nmaSv=" + maSv + " \ndiemLt=" + diemLt + ", \ndiemTh=" + diemTh + " \ndiemTB=" + tinhDiemTb();
    }

   
}

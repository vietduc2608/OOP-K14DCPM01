package oo;

public class SinhVienGDU {
    private int maSV;
    private String hoTen;
    private String diaChi;
 
    public SinhVienGDU() {}
    
    public SinhVienGDU(int maSV, String hoTen, String diaChi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    //--------------begin getter and setter--------------------
    public int getMaSV() {
        return maSV;
    }
 
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
 
    public String getHoten() {
        return hoTen;
    }
 
    public void setHoten(String hoten) {
        this.hoTen = hoten;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    //--------------end getter and setter--------------------


    public void show(){
        System.out.println("======Thông Tin Sinh Viên======");
        System.out.println("Mã Sinh Viên: "+maSV  +"Họ Tên: "+hoTen +"Địa chỉ: "+diaChi);
        System.out.printf("%-5d %-20s %-15s\n", maSV, hoTen, diaChi);
    }
    

}

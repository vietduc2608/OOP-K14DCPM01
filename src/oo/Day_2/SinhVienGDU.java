package oo.Day_2;

public class SinhVienGDU {
    private int maSV;
    private String hoTen;
    private String gioiTinh;
    private float tuoi;
    private String Khoa;
    private double diemTB;

    
    
    public SinhVienGDU(int maSV, String hoTen, String gioiTinh, float tuoi, String khoa, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        Khoa = khoa;
        this.diemTB = diemTB;
    }

    public SinhVienGDU() {}
    
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getTuoi() {
        return tuoi;
    }

    public void setTuoi(float tuoi) {
        this.tuoi = tuoi;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String khoa) {
        Khoa = khoa;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    //--------------begin getter and setter--------------------

    public void show(){
        System.out.println("======Thông Tin Sinh Viên======");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-45S\n", "Mã Sinh Viên", "Họ Tên", "Giới Tính", "Tuổi", "Khoa", "Điểm Trung Bình");
        System.out.printf("%-5d %-20s %-15s %-20s %-20s %-20s\n", maSV, hoTen, gioiTinh, tuoi, Khoa, diemTB);
    }
    
}

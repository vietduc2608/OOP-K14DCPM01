package oo.Day_2;

public class SinhVienGDU {
    int maSV;
    String hoTen;
    String gioiTinh;
    float tuoi;
    String Khoa;
    double diemTB;

    // attribute (thuộc tính) - data - state (trạng thái)
    // method (phương thức) - functions - behavior (hành vi)
    
    public SinhVienGDU(String hoTen, float tuoi){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public SinhVienGDU(int maSV, String hoTen, String gioiTinh, float tuoi, String khoa, double diemTB) {
        this(hoTen, tuoi); // phải được đặt ở dòng đầu tiên
        this.maSV = maSV;
        // this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        // this.tuoi = tuoi;
        this.Khoa = khoa;
        this.diemTB = diemTB;
    }

    public SinhVienGDU() {}
    
    // public int getMaSV() {
    //     return maSV;
    // }

    // public void setMaSV(int maSV) {
    //     this.maSV = maSV;
    // }

    // public String getHoTen() {
    //     return hoTen;
    // }

    // public void setHoTen(String hoTen) {
    //     this.hoTen = hoTen;
    // }

    // public String getGioiTinh() {
    //     return gioiTinh;
    // }

    // public void setGioiTinh(String gioiTinh) {
    //     this.gioiTinh = gioiTinh;
    // }

    // public float getTuoi() {
    //     return tuoi;
    // }

    // public void setTuoi(float tuoi) {
    //     this.tuoi = tuoi;
    // }

    // public String getKhoa() {
    //     return Khoa;
    // }

    // public void setKhoa(String khoa) {
    //     Khoa = khoa;
    // }

    // public double getDiemTB() {
    //     return diemTB;
    // }

    // public void setDiemTB(double diemTB) {
    //     this.diemTB = diemTB;
    // }

    // //--------------begin getter and setter--------------------
    // void hoc(){
    //     System.out.println("Hoc.....");
    // }

    // void thi(){
    //     System.out.println("Thi.....");
    // }

    void dangKyMonHoc(){
        System.out.println("Đăng Ký Môn......");
    }
    
    public void showData(){
        System.out.println("============================================Thông Tin Sinh Viên===============================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-45S\n", "Mã Sinh Viên", "Họ Tên", "Giới Tính", "Tuổi", "Khoa", "Điểm Trung Bình");
    }

    public void show(){
        System.out.printf("%-5d %-20s %-15s %-20s %-20s %-20s\n", this.maSV, this.hoTen, this.gioiTinh, this.tuoi, this.Khoa, this.diemTB);
    }
}

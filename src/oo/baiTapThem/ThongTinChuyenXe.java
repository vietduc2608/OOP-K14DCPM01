package oo.baiTapThem;

import java.util.Scanner;

public class ThongTinChuyenXe {
    private int maSoChuyenXe, soXe, soTuyen;
    private String hoTenTaiXe, noiDen;
    private double doanhThu, soKmDiDuoc, soNgayDiDuoc;
    public Scanner sc = new Scanner(System.in);

    public ThongTinChuyenXe(){}

    public ThongTinChuyenXe(int maSoChuyenXe, int soXe, int soTuyen, String hoTenTaiXe, double doanhThu,
            double soKmDiDuoc) {
        this.maSoChuyenXe = maSoChuyenXe;
        this.soXe = soXe;
        this.soTuyen = soTuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.doanhThu = doanhThu;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public ThongTinChuyenXe(int maSoChuyenXe, int soXe, String hoTenTaiXe, String noiDen, double doanhThu,
            double soNgayDiDuoc) {
        this.maSoChuyenXe = maSoChuyenXe;
        this.soXe = soXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.noiDen = noiDen;
        this.doanhThu = doanhThu;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    

    public int getMaSoChuyenXe() {
        return maSoChuyenXe;
    }

    public void setMaSoChuyenXe(int maSoChuyenXe) {
        this.maSoChuyenXe = maSoChuyenXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public double getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(double soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    private double tongDoanhThuNoiThanh(){
        // double tdt = this.doanhThu;
        // tdt += doanhThu;
        // return tdt;
        double tdt = this.doanhThu * this.soTuyen;
        return tdt;
    }

    private double tongDoanhThuNgoaiThanh(){
        double tdt = this.doanhThu * this.soNgayDiDuoc;
        // tdt += doanhThu;
        return tdt;
    }
    
    protected void nhapNoiThanh(){
        System.out.println("Nhap ma so chuyen xe: ");
        maSoChuyenXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten tai xe: ");
        hoTenTaiXe = sc.nextLine();
        System.out.println("So xe: ");
        soXe = sc.nextInt();
        sc.nextLine();
        System.out.println("So tuyen: ");
        soTuyen = sc.nextInt();
        sc.nextLine();
        System.out.println("So km di duoc: ");
        soKmDiDuoc = sc.nextInt();
        sc.nextLine();
        System.out.println("Doanh thu: ");
        doanhThu = sc.nextDouble();
    }

    protected void nhapNgoaiThanh(){
        System.out.println("Nhap ma so chuyen xe: ");
        maSoChuyenXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten tai xe: ");
        hoTenTaiXe = sc.nextLine();
        System.out.println("So xe: ");
        soXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Noi den: ");
        noiDen = sc.nextLine();
        System.out.println("So ngay di duoc: ");
        soNgayDiDuoc = sc.nextInt();
        sc.nextLine();
        System.out.println("Doanh thu: ");
        doanhThu = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Thong Tin Chuyen Xe: [Doanh Thu: " + doanhThu + ", Ho Ten Tai Xe: " + hoTenTaiXe + ", Ma So Chuyen Xe: "
                + maSoChuyenXe + ", Noi Den: " + noiDen + ", So Km Di Duoc: " + soKmDiDuoc + ", So Ngay Di Duoc: " + soNgayDiDuoc
                + ", So Tuyen: " + soTuyen + ", So Xe: " + soXe  + ", Tong Doanh Thu Noi Thanh: " + tongDoanhThuNoiThanh() + ", Tong Doanh Thu Ngoai Thanh: " + tongDoanhThuNgoaiThanh()+ "]";
    }


    // protected void xuatNoiThanh(){
    //     System.out.println("======Thong Tin Chuyen Xe======");
    //     System.out.println("Ma So Chuyen Xe: " +maSoChuyenXe);
    //     System.out.println("Ho Ten Tai Xe: " +hoTenTaiXe);
    //     System.out.println("So Xe: " +soXe);
    //     System.out.println("So Tuyen: " +soTuyen);
    //     System.out.println("So Km Di Duoc: " +soKmDiDuoc);
    //     System.out.println("Doanh Thu: " +doanhThu);
    //     System.out.println("Tong Danh Thu: " +tongDoanhThuNoiThanh());
    // }

    // protected void xuatNgoaiThanh(){
    //     System.out.println("======Thong Tin Chuyen Xe======");
    //     System.out.println("Ma So Chuyen Xe: " +maSoChuyenXe);
    //     System.out.println("Ho Ten Tai Xe: " +hoTenTaiXe);
    //     System.out.println("So Xe: " +soXe);
    //     System.out.println("Noi Den: " +noiDen);
    //     System.out.println("So Ngay Di Duoc:" +soNgayDiDuoc);
    //     System.out.println("Doanh Thu: " +doanhThu);
    // }
}

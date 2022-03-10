package oo.baiTapThem;

import java.util.Scanner;

public class ThongTinChuyenXe {
    private int maSoChuyenXe, soXe;
    private String hoTenTaiXe;
    private double doanhThu;
    public Scanner sc = new Scanner(System.in);

    public ThongTinChuyenXe(){}


    public ThongTinChuyenXe(int maSoChuyenXe, int soXe, String hoTenTaiXe, double doanhThu, Scanner sc) {
        this.maSoChuyenXe = maSoChuyenXe;
        this.soXe = soXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.doanhThu = doanhThu;
        this.sc = sc;
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

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhap(){
        System.out.println("Nhap ma so chuyen xe: ");
        maSoChuyenXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Ho ten tai xe: ");
        hoTenTaiXe = sc.nextLine();
        System.out.println("Nhap so xe: ");
        soXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap doanh thu: ");
        doanhThu = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "ThongTinChuyenXe [Doanh Thu=: " + doanhThu + ", Ho Ten Tai Xe: " + hoTenTaiXe + ", Ma So Chuyen Xe: "
                + maSoChuyenXe + ", So Xe: " + soXe  + "]";
    }
}

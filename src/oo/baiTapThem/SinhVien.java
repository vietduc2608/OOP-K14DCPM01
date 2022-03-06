package oo.baiTapThem;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
    ArrayList<SinhVien> sViens = new ArrayList<>();
    private int maSinhVien;
    private String hoTen, diaChi;
    private double sDT;

    private static int autoMaSinhVien = 1;

    Scanner sc = new Scanner(System.in);

    public int getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public double getsDT() {
        return sDT;
    }
    public void setsDT(double sDT) {
        this.sDT = sDT;
    }

    public SinhVien(){}

    public SinhVien(String hoTen, String diaChi, double sDT) {
        this.maSinhVien = autoMaSinhVien++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sDT = sDT;
    }

    public void nhapThongTin(){
        System.out.println("Ten Sinh Vien: ");
        hoTen = sc.nextLine();
        // System.out.println("Ma Sinh Vien: ");
        // maSinhVien = sc.nextInt();
        // sc.nextLine();
        System.out.println("Dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("So Dien Thoai: ");
        sDT = sc.nextDouble();
        this.setDiaChi(diaChi);
        this.setHoTen(hoTen);
        this.setsDT(sDT);
    }
    public void xuat(){
        System.out.println("===================");
        System.out.println("%20S %20S %20S %20S");
        System.out.printf("%20S %20S %20d %20f",this.getHoTen(), this.getDiaChi(), this.getMaSinhVien(), this.getsDT());
    }
    public void xuatNhieu(){
        System.out.println("In danh sách sinh vien");
        for (SinhVien sinhVien0 : sViens) {
            // System.out.println(sinhVien0.toString());
            sinhVien0.xuat();
        }
    }
    

    @Override
    public String toString() {
        return "SinhVien [diaChi=" + diaChi + ", hoTen=" + hoTen + ", maSinhVien=" + maSinhVien + ", sDT=" + sDT + "]";
    }
    

}

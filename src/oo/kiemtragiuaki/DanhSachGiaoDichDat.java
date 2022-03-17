package oo.kiemtragiuaki;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public abstract class DanhSachGiaoDichDat {
    private int maGiaoDich;
    private double donGia, dienTich;
    private Date ngayGiaoDich;

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    protected abstract double tinhTienDat();
    protected abstract double tinhTienNha();
    protected abstract int nhapSoGiaoDich();

    List<GiaoDichDat> listDat = new ArrayList<>();
    List<GiaoDichNha> listNha = new ArrayList<>();

    public DanhSachGiaoDichDat(){

    }
    
    public DanhSachGiaoDichDat(int maGiaoDich, double donGia, double dienTich, Date ngayGiaoDich) {
        this.maGiaoDich = maGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.ngayGiaoDich = ngayGiaoDich;
    }
    
    public int getMaGiaoDich() {
        return maGiaoDich;
    }
    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public void nhap(){
        System.out.println("Nhap Ma Giao Dich: ");
        maGiaoDich = sc.nextInt();
        sc.nextLine();
        try {
            System.out.println("Nhap Ngay Giao Dich: ");
            ngayGiaoDich = df.parse(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Ngay Khong Hop Le");
        }
        System.out.println("Nhap Don Gia: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap Dien Tich : ");
        dienTich = sc.nextDouble();
    }
    

    @Override
    public String toString() {
        return "DanhSachGiaoDichDat [Dien Tich: " + dienTich + ", Don Gia: " + donGia + ", Ma Giao Dich: " + maGiaoDich
                + ", Ngay Giao Dich: " + ngayGiaoDich + "]";
    }

    
    

}

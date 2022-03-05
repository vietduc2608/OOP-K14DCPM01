package oo.baiTapThem;

import java.util.Date;
import java.util.Scanner;

public class Book {
    private int maSach, soLuong;
    private String nhaXuatBan;
    private double donGia;
    // private Date date;

    public Scanner sc = new Scanner(System.in);

    public Book(){}

    public Book(int maSach, int soLuong, String nhaXuatBan, double donGia) {
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
       
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }



    protected void nhap(){
        System.out.println("Nhap Ma Sach: ");
        maSach = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap Nha Xuat Ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.println("Nhap Don Gia: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap So Luong: ");
        soLuong = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Book [date="  + ", donGia=" + donGia + ", maSach=" + maSach + ", nhaXuatBan=" + nhaXuatBan
                + ", soLuong=" + soLuong + "]";
    }

  

    
}

package oo.baiTapThem;

import java.util.ArrayList;
import java.util.Scanner;


public class BookTestDrive {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Book book = new Book();
        SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
        sachGiaoKhoa.tinhTrangSach();
        // System.out.println("=======THONG TIN SACH GIAO KHOA======");
        // SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
        // System.out.println("Nhap so luong sach muon them: ");
        // int n = sc.nextInt();
        // System.out.println("Nhap thong tin sach giao khoa:" );
        // for (int i = 0; i < n; i++) {
        //     System.out.println("Sach Giao Khoa Thu: " +(i+1));
        //     SachGiaoKhoa sGiaoKhoa = new SachGiaoKhoa();
        //     sGiaoKhoa.nhap();
        //     sGiaoKhoa.tinhTrangSach(); 
        //     arrayList.add(sGiaoKhoa);
        //     System.out.println(sachGiaoKhoa.toString());

        // }



    //     System.out.println("======THONG TIN SACH THAM KHAO======");
    //     SachThamKhao sachThamKhao = new SachThamKhao();
    //     sachThamKhao.nhapSTK();
    //     System.out.println(sachThamKhao.toString());
    }
    
}

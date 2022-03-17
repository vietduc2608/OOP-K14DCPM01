package oo.kiemtragiuaki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachGiaoDichDat danhSachGiaoDichDat = new GiaoDichDat();
        danhSachGiaoDichDat.nhap();
        danhSachGiaoDichDat.tinhTienDat();
        System.out.println(danhSachGiaoDichDat);

        DanhSachGiaoDichDat danhSachGiaoDichDat2 = new GiaoDichNha();
        danhSachGiaoDichDat2.nhap();
        danhSachGiaoDichDat2.tinhTienNha();
        System.out.println(danhSachGiaoDichDat2);
        Scanner sc = new Scanner(System.in);
        List<GiaoDichNha> listNha = new ArrayList<>();
        List<GiaoDichDat> listDat = new ArrayList<>();
  
      
       
        
    }
}

package oo.baiTapThem;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien("Le Viet Duc", "3123", 8768987);
        SinhVien sinhVien1 = new SinhVien("Le Viet Duc", "3123", 8768987);
        System.out.println(sinhVien.toString());
        System.out.println(sinhVien1.toString());

        // SinhVien[] dSSinhVien = new SinhVien[2];
        ArrayList<SinhVien> sViens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("========THONG TIN SINH VIEN========");
   
        System.out.println("Nhập vào danh sách sinh viên");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu: " +(i+1));
            SinhVien sinhVien0 = new SinhVien();
            sinhVien0.nhapThongTin();
            sViens.add(sinhVien0);
           
        }

        // System.out.println("In danh sách sinh vien");
        // for (SinhVien sinhVien0 : sViens) {
        //     System.out.println(sinhVien0.toString());
        // }
       
    }


    //     for(int i = 0; i < sinhViens.length; i++){
    //     System.out.println("Nhập sinh viên thứ " + (i+1));
    //     System.out.println("Tên sinh viên: ");
    //     String tenSinhVien = nhapSV.nextLine();
    //     System.out.println("Mã sinh viên: ");
    //     String maSSV = sc.nextLine();
    //     System.out.println("Tuổi: ");
    //     int tuoi = nhapSV.nextInt();
    //     sc.nextLine();
    //     System.out.println("Quê quán: ");
    //     String queQuan = nhapSV.nextLine();
    //     dSSinhVien[i] = new 
    // }
      
}

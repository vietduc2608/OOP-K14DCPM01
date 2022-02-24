package oo.Day_6;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(1, "Vu Hoang Tuan Anh", 7, 8);
        SinhVien sv2 = new SinhVien(2, "Nguyen Dinh Khiem", 6, 7);
        SinhVien sv3 = new SinhVien();
        


        System.out.println("Nhập Mã Sinh Viên: ");
        int maSv = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Họ Tên Sinh Viên: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập Điểm Thực Hành Sinh Viên: ");
        float diemTh = sc.nextFloat();
        System.out.println("Nhập Điểm Lý Thuyết Sinh Viên: ");
        float diemLt = sc.nextFloat();
        sv3.setMaSv(maSv);
        sv3.setHoTen(hoTen);
        sv3.setDiemTh(diemTh);
        sv3.setDiemLt(diemLt);
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        }

}


package oo.baiTapThem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double doanhThuNoiTHanh = 0, doanhThuNgoaiThanh = 0;

        System.out.println("=====CHUYEN XE NGOAI THANH=====");
        ArrayList<ThongTinChuyenXe> chuyenXeNgoaiThanh = new ArrayList<>();
        System.out.println("Nhap so luong xe: ");
        int n = sc.nextInt();
        System.out.println("Nhap thong tin xe: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Chuyen xe thu: " +(i+1));
            ChuyenXeNgoaiThanh cXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            cXeNgoaiThanh.nhapNgoaiThanh();
            doanhThuNgoaiThanh += cXeNgoaiThanh.getDoanhThu();
            chuyenXeNgoaiThanh.add(cXeNgoaiThanh);
            System.out.println(chuyenXeNgoaiThanh.toString());
        }


        System.out.println("=====CHUYEN XE NOI THANH=====");
        ArrayList<ThongTinChuyenXe> chuyenXeNoiThanh = new ArrayList<>();
        System.out.println("Nhap so luong xe: ");
        int k = sc.nextInt();
        System.out.println("Nhap thong tin xe: ");
        for (int i = 0; i < k; i++) {
            System.out.println("Chuyen xe thu: " +(i+1));
        ChuyenXeNoiThanh chuyenXeNoiThanhs = new ChuyenXeNoiThanh();
        chuyenXeNoiThanhs.nhapNoiThanh();
        doanhThuNoiTHanh += chuyenXeNoiThanhs.getDoanhThu();
        chuyenXeNoiThanh.add(chuyenXeNoiThanhs);
        System.out.println(chuyenXeNoiThanh.toString());
        }

        System.out.println("=======DOANH THU TUNG CHUYEN XE========");
        System.out.println("Danh thu ngoai thanh: " + doanhThuNgoaiThanh);
        System.out.println("Doanh thu noi thanh: " + doanhThuNoiTHanh);
    }

    
}

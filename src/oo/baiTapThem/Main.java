package oo.baiTapThem;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====CHUYEN XE NGOAI THANH=====");
        ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
        chuyenXeNgoaiThanh.nhapNgoaiThanh();
        System.out.println(chuyenXeNgoaiThanh.toString());


        System.out.println("=====CHUYEN XE NOI THANH=====");
        ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
        chuyenXeNoiThanh.nhapNoiThanh();
        System.out.println(chuyenXeNoiThanh.toString());
    }
}

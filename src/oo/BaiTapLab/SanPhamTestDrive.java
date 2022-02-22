package oo.BaiTapLab;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        sp1.inThongTin();
        sp1.xuat();
        sp2.xuat();
        sp.nhap();
        sp.xuat();
        sp.NhapThem();
        sp.xuatThongTin();
    }
}

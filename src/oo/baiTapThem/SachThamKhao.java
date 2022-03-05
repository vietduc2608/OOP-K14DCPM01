package oo.baiTapThem;

public class SachThamKhao extends Book {
    private double thue, thanhTien;
 
    public SachThamKhao() {}
 
    public SachThamKhao(double thue) {
        this.thue = thue;
    }
 
    public double getThue() {
        return thue;
    }
 
    public void setThue(double thue) {
        this.thue = thue;
    }
 
    public void nhapSach() {
        System.out.print("Nhap thue: ");
        thue = sc.nextDouble();
    }

    // private double thanhTien(){
    //     thanhTien = this.getSoLuong() * this.getDonGia();
    //     return thanhTien;
    // }

    @Override
    public String toString() {
        return "SachThamKhao [thanhTien=" + thanhTien + ", thue=" + thue + "]";
    }
     
    
}

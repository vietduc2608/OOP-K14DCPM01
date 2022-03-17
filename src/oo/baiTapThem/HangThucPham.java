package oo.baiTapThem;

import java.io.Serializable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham implements Serializable{
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySX;
    private Date ngayHH;

    public String getMaHang() {
        return maHang;
    }

    private void setMaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        }else{
            System.out.println("Ma hang ko duoc rong");
            this.maHang = "DEFAULT";
        }
      
    }

    public void setTenHang(String tenHang){
        //code rang buoc
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten ko de rong");
            this.tenHang = "XXXXXX";
        }
    }

    public void setDonGia(double donGia){
        if(donGia > 0){
            this.donGia = donGia;
        }else{
            System.out.println("Don gia > 0 !!!");

        }
    }

    public void setNgayHetHan(Date ngayHetHan){
        if(ngayHetHan != null){
            // this.ngayHH = ngayHetHan;

            if(ngayHetHan.after(this.ngaySX)){
                this.ngayHH = ngayHetHan;
            }else{
                System.out.println("Ngay het han phai sau ngay san xuat!");
                this.ngayHH = new Date();//ngay hien tai  
            }  
        }else{
            System.out.println("Ngay het han ko duoc rong!");
            this.ngayHH = new Date();
        }
    }
    
    public boolean kiemTraHSD(){
        boolean isHetHan = false; // con han

        if(this.ngayHH.before(new Date())){
            isHetHan = true;
        }
        return isHetHan;
    }


    public Date getNgayHH() {
        return ngayHH;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

     // public HangThucPham(){

    // }

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHH) {
        this.setMaHang(maHang);;
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySX(ngaySX);
        this.setNgayHetHan(ngayHH);
    }

    public HangThucPham(String maHang) {
        this.setMaHang(maHang);
    }

    @Override
    public String toString() {

        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(localeVN);
        
        return "HangThucPham [donGia=" + tienVietNam.format(donGia) + ", maHang=" + maHang + ", ngayHH=" + ngayVietNam.format(ngayHH) + ", ngaySX=" + ngayVietNam.format(ngaySX)
                + ", tenHang=" + tenHang + "]";
    }

    
    
}

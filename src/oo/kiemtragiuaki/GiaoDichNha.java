package oo.kiemtragiuaki;

import java.util.Date;


public  class GiaoDichNha extends DanhSachGiaoDichDat{
    private String loaiNha, diaChi;

  
    
    public GiaoDichNha(){

    }

    public GiaoDichNha(int maGiaoDich, double donGia, double dienTich, Date ngayGiaoDich, String loaiNha,
            String diaChi) {
        super(maGiaoDich, donGia, dienTich, ngayGiaoDich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public void nhap() {
        System.out.println("Nhập thông tin giao dịch nhà:");
        int soGiaoDichNha = 0;
        for (int i = 0; i < soGiaoDichNha; i++) {
            System.out.println("Nhập thông tin giao dịch nhà thứ " + (i + 1) + ":");
            GiaoDichNha giaoDichNha = new GiaoDichNha();
            giaoDichNha.nhap();
            listNha.add(giaoDichNha);
        }
        sc.nextLine();
        super.nhap();
    }

    @Override
    public String toString() {
        System.out.println("---Thông tin các giao dịch nhà---");
        for (int i = 0; i < listNha.size(); i++) {
            System.out.println(listNha.get(i).toString());
        }
        String loaiNha = "Loai Nha ";
        String diaChi = "Dia Chi ";
        return super.toString() + loaiNha + this.loaiNha + diaChi + this.diaChi;
    }

    @Override
    protected double tinhTienDat() {
        return 0;
    }

    @Override
    protected double tinhTienNha() {
        double thanhTien = 0;
        if(this.loaiNha.equals("Cao Cap")){
            thanhTien = this.getDienTich()*this.getDonGia();
        }
        if(this.loaiNha.equals("Thuong")){
            thanhTien = this.getDienTich()*this.getDonGia()* 0.9;
        }
        System.out.println("Thanh Tien Giao Dich Nha: " +thanhTien);
        return thanhTien;
    }


    @Override
    protected int nhapSoGiaoDich() {
        int soGiaoDichNha = 0;
        System.out.println("Nhap So Giao Dich Nha: ");
        soGiaoDichNha = sc.nextInt();
        return soGiaoDichNha;
    }


    
}

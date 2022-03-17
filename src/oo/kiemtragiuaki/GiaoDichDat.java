package oo.kiemtragiuaki;

import java.util.Date;


public class GiaoDichDat extends DanhSachGiaoDichDat {
    private String loaiDat;

 
    public GiaoDichDat() {

    }

    public GiaoDichDat(int maGiaoDich, double donGia, double dienTich, Date ngayGiaoDich, String loaiDat) {
        super(maGiaoDich, donGia, dienTich, ngayGiaoDich);
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public void nhap() {
        System.out.println("======Nhap thong tin giao dich dat=======");
       
        int soGiaoDichDat = 0;
        System.out.println("Nhap so luong muon nhap");
        soGiaoDichDat = sc.nextInt();
        
        for (int i = 0; i < soGiaoDichDat; i++) {
            System.out.println("Nhap thong tin giao dich dat thu " + (i + 1) + ":");
            GiaoDichDat giaoDichDat = new GiaoDichDat();
            super.nhap();
            listDat.add(giaoDichDat);
        }
    }

    @Override
    public String toString() {
        System.out.println("---Thông tin các giao dịch đất---");
        for (int i = 0; i < listDat.size(); i++) {
            System.out.println(listDat.get(i).toString());
        }
        String loaiDat = "Loai Dat: ";
        return super.toString() + loaiDat + this.loaiDat;
    }
 

    @Override
    protected double tinhTienDat() {
        this.nhap();
        double thanhTien = 0;
        for (int i = 0; i < listDat.size(); i++) {
            if (listDat.get(i).getLoaiDat().equalsIgnoreCase("A")) {
                thanhTien += listDat.get(i).getDienTich() * 
                    listDat.get(i).getDonGia() * 1.5;
            } else if (listDat.get(i).getLoaiDat().equalsIgnoreCase("B") || 
                    listDat.get(i).getLoaiDat().equalsIgnoreCase("C")) {
                thanhTien += listDat.get(i).getDienTich() * 
                    listDat.get(i).getDonGia();
            }
        }
        // if(this.loaiDat.equals("A")){
        //     thanhTien = this.getDienTich()*this.getDonGia()*1.5;
        // }
        // if(this.loaiDat.equals("B")|| this.loaiDat.equals("C")){
        //     thanhTien = this.getDienTich()*this.getDonGia();
        // }
        // System.out.println("Thanh Tien Giao Dich Dat: " + thanhTien);
        return thanhTien;
    }

    @Override
    protected double tinhTienNha() {
        // TODO Auto-generated method stub
        return 0;
    }

    

    @Override
    protected int nhapSoGiaoDich() {
        int soGiaoDichDat = 0;
        System.out.println("Nhap So Giao Dich Dat: ");
        soGiaoDichDat = sc.nextInt();
        for (int i = 0; i < soGiaoDichDat; i++) {
            System.out.println("Nhập thông tin giao dịch đất thứ " + (i + 1) + ":");
            GiaoDichDat giaoDichDat = new GiaoDichDat();
            giaoDichDat.nhap();
            listDat.add(giaoDichDat);
        }
        return soGiaoDichDat;
    }

    

}

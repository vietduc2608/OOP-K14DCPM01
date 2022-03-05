package oo.baiTapThem;

public class SachGiaoKhoa extends Book {
    private String tinhTrang;
    private double thanhTien;
    private int n;
    
    public SachGiaoKhoa() {
        super();
    }
 
    public SachGiaoKhoa(String tinhTrang, double thanhTien) {
        this.tinhTrang = tinhTrang;
        this.thanhTien = thanhTien;
    }


    public String getTinhTrang() {
        return tinhTrang;
    }


    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }


    public double getThanhTien() {
        return thanhTien;
    }


    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    

    public void tinhTrangSach() {
        Book book = new Book();
        SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
        book.nhap();
        System.out.println("Nhap Tinh Trang Cua Sach");
        this.tinhTrang = sc.nextLine();
        if(this.tinhTrang.equals("Cu")){
            this.thanhTien = this.getSoLuong() * this.getDonGia() * 0.5;
        }else if(this.tinhTrang.equals("Moi")){
            this.thanhTien = this.getSoLuong() * this.getDonGia();
        }
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa [thanhTien=" + thanhTien + ", tinhTrang=" + tinhTrang + "]";
    }




    // public String tinhTrangSach(int x) {
    //     switch (n) {
    //         case 0:
    //             tinhTrang = "cũ";
    //             break;
    //         case 1:
    //             tinhTrang = "mới";
    //             break;
    //         default:
    //             break;
    //     }
    //     return tinhTrang;
    // }
     
    // public void nhapSach() {
    //     super.nhap();
    //     System.out.print("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
    //     n = sc.nextInt();
    // }


    
   
}

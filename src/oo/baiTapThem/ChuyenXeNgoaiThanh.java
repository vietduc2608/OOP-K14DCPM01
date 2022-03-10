package oo.baiTapThem;


public class ChuyenXeNgoaiThanh extends ThongTinChuyenXe{
    private String noiDen;
    private double soNgayDiDuoc;
 
    public ChuyenXeNgoaiThanh(){
        super();
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(double soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }


    public void nhapNgoaiThanh(){
        super.nhap();
        sc.nextLine();
        System.out.println("Noi den: ");
        noiDen = sc.nextLine();
        System.out.println("So ngay di duoc: ");
        soNgayDiDuoc = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh [Noi Den: " + noiDen + ", So Ngay Di Duoc: " + soNgayDiDuoc + "]" + " " + super.toString() + "]";
    }
    

}

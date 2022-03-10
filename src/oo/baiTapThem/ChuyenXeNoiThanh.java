package oo.baiTapThem;

public class ChuyenXeNoiThanh extends ThongTinChuyenXe{
    private int soTuyen;
    private double soKmDiDuoc;

    public ChuyenXeNoiThanh(){
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }
    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }
    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }
    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public void nhapNoiThanh(){
        super.nhap();
        sc.nextLine();
        System.out.println("So tuyen: ");
        this.soTuyen = sc.nextInt();
        sc.nextLine();
        System.out.println("So km di duoc: ");
        soKmDiDuoc = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh [soKmDiDuoc=" + soKmDiDuoc + ", soTuyen=" + soTuyen  + "]" + " " + super.toString() + "]";
    }
    
}


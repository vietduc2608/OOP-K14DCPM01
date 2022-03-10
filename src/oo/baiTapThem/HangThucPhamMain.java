package oo.baiTapThem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPhamMain {
    public static void main(String[] args) throws ParseException {
        // HangThucPham htp = new HangThucPham();
        // System.out.println(htp);
        //ko chinh sua
        //co quyen truy cap
        // htp.setMaHang("TP09");
        // System.out.println(htp);

        // System.out.println("MH " +htp.getMaHang());

        // HangThucPham htp2 = new HangThucPham(null);
        // System.out.println(htp2);

        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySX = "10/03/2022";
        String ngayHH = "10/09/2022";


        HangThucPham htp3 = new HangThucPham("TP03", "Mi Hao Hao", 5000, ngayVietNam.parse(ngaySX), ngayVietNam.parse(ngayHH));
        System.out.println(htp3);
        if(htp3.kiemTraHSD()){
            System.out.println("Hen han roi! Dung an");
        }else{
            System.out.println("Con Han Su Dung");
        }
        System.out.println("Ngay Hien Tai: " + new Date());
    } 

        
}

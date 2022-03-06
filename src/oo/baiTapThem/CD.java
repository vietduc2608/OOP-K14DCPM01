// package oo.baiTapThem;

// import java.util.Scanner;

// public class CD {
//     private int maCD, soBaiHat;
//     private double giaThanh;
//     private String tuaCD, singer;

//     Scanner sc = new Scanner(System.in);

//     public int getMaCD() {
//         return maCD;
//     }
//     public void setMaCD(int maCD) {
//         this.maCD = maCD;
//     }
//     public int getSoBaiHat() {
//         return soBaiHat;
//     }
//     public void setSoBaiHat(int soBaiHat) {
//         this.soBaiHat = soBaiHat;
//     }
//     public double getGiaThanh() {
//         return giaThanh;
//     }
//     public void setGiaThanh(double giaThanh) {
//         this.giaThanh = giaThanh;
//     }
//     public String getTuaCD() {
//         return tuaCD;
//     }
//     public void setTuaCD(String tuaCD) {
//         this.tuaCD = tuaCD;
//     }
//     public String getSinger() {
//         return singer;
//     }
//     public void setSinger(String singer) {
//         this.singer = singer;
//     }

//     public CD(){

//     }
    
//     public CD(int maCD, int soBaiHat, double giaThanh, String tuaCD, String singer) {
//         this.maCD = maCD;
//         this.soBaiHat = soBaiHat;
//         this.giaThanh = giaThanh;
//         this.tuaCD = tuaCD;
//         this.singer = singer;
//     }

//     @Override
//     public String toString() {
//         return "CD [giaThanh=" + giaThanh + ", maCD=" + maCD + ", singer=" + singer + ", soBaiHat=" + soBaiHat
//                 + ", tuaCD=" + tuaCD + "]";
//     }
    
//     public void nhap(){
//         System.out.print("Nhập mã CD: ");
//         maCD = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Nhập tên CD : ");
//         tuaCD = sc.nextLine();
//         System.out.print("Nhập tên ca sĩ : ");
//         singer = sc.nextLine();
//         System.out.print("Nhập số lượng bài hát : ");
//         soBaiHat = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Nhập giá thành : ");
//         giaThanh = sc.nextDouble();
//     }
    
//     public void hienThi(){
//         System.out.println("%-10d %-20s %-20s %-10d %-20.1f \n",maCD,singer,tuaCD,soBaiHat,giaThanh);
//     }


// }

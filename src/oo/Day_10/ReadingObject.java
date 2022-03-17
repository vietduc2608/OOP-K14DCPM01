package oo.Day_10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import oo.baiTapThem.HangThucPham;

public class ReadingObject {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        //1.
        FileInputStream inFile = new FileInputStream("data.dat");

        //2.
        ObjectInputStream objIn = new ObjectInputStream(inFile);

        //3. Read Object Stream
        // HangThucPham htp =  (HangThucPham)objIn.readObject(); // ép kiểu
        // HangThucPham htp2 = (HangThucPham)objIn.readObject();
        // List<HangThucPham> list = (List)objIn.readObject();
        // for (HangThucPham hangThucPham : list) {
        //     if(hangThucPham.get)
        //     System.out.println(HangThucPham);
                
            
        // }
        // // System.out.println(htp);
        // // System.out.println(htp2);
        
        // objIn.close();

    }
}

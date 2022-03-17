package oo.Day_10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oo.baiTapThem.HangThucPham;

public class WrittingObject {
    public static void main(String[] args) throws IOException{
        //1.
        FileOutputStream outFile = new FileOutputStream("data.dat");

        //2.
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        //Hang thuc pham
        HangThucPham htp = new HangThucPham("HTP01", "Mi Hao Hao", 10000, new Date(), new Date());

        HangThucPham htp2 = new HangThucPham("HTP02", "Mi 3 Mien", 5000, new Date(), new Date());
        
        //code voi abstract
        List<HangThucPham> list = new ArrayList<>();
        list.add(htp);
        list.add(htp2);
        
        //3.
        objOut.writeObject(htp);
        objOut.writeObject(htp2);

        System.out.println(htp);
        
        //4.
        objOut.close();
    }
}
 
   

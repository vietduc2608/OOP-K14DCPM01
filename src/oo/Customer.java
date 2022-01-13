package oo;
import java.util.Scanner;

public class Customer {
    int customer_id;
    String name, address;

    Scanner input = new Scanner(System.in); 


    void Nhap(){
        System.out.println("Nhap id Khach Hang");
        customer_id = input.nextInt();
        System.out.println("Nhap Ten Khach Hang: ");
        name = input.nextLine();
        System.out.println("Nhap dia chi: ");
        address = input.nextLine();
    }

    void show() {
        System.out.println("thong tin tai khoan");
        System.out.println("Account id: " + customer_id);
        System.out.println("Account name: " +name);
        System.out.println("Account address: "+address);
    }
}

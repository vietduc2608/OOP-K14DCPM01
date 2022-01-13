package oo;
import java.util.Scanner;

public class Customer {
    int customer_id = 1234567;
    int customer_banlance = 0;

    Scanner input = new Scanner(System.in); 
    Account account = new Account();
    

    void withdraw() {
        System.out.print("Nhap vao so tien can rut > ");
        int withdrawAmount = input.nextInt();
        customer_banlance -= withdrawAmount;// thao tac len data
        // account_banlance = account_banlance - withdrawAmount;
    }

    void depoist() {
        // gui tien: deposit
        System.out.print("Nhap vao so tien gui > ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        customer_banlance += depositAmount;// thao tac len data
    }

    void show() {
        System.out.println("thong tin tai khoan");
        System.out.println("Account number: " + customer_id);
        System.out.println("Account balance: " + customer_banlance);
    }
}

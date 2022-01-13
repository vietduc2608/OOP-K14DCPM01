package oo;

import java.util.Scanner;

public class Employee {
    int employee_id = 123456;
    int employee_banlance = 0;

    Scanner input = new Scanner(System.in);

    void withdraw() {
        System.out.print("Nhap vao so tien can rut > ");
        int withdrawAmount = input.nextInt();
        employee_banlance -= withdrawAmount;// thao tac len data
        // account_banlance = account_banlance - withdrawAmount;
    }

    void depoist() {
        // gui tien: deposit
        System.out.print("Nhap vao so tien gui > ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        employee_banlance += depositAmount;// thao tac len data
    }

    void show() {
        System.out.println("thong tin tai khoan");
        System.out.println("Account number: " + employee_id);
        System.out.println("Account balance: " + employee_banlance);
    }
}

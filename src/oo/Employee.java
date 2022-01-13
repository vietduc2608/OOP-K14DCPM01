package oo;

import java.util.Scanner;

public class Employee {
    int employee_id;
    String nameEmployee, addressEmployee;

    Scanner input = new Scanner(System.in);

    void Nhap(){
        System.out.println("Nhap id Nhan Vien");
        employee_id = input.nextInt();
        System.out.println("Nhap Ten Nhan Vien: ");
        nameEmployee = input.nextLine();
        System.out.println("Nhap dia chi: ");
        addressEmployee = input.nextLine();
    }

    void show() {
        System.out.println("=========Thong Tin Tai Khoan==========");
        System.out.println("Account id: " + employee_id);
        System.out.println("Account name: " +nameEmployee);
        System.out.println("Account address: "+addressEmployee);
    }
}

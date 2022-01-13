package oo.Day_1;
import java.util.Scanner;

public class Employee {
    int employee_id;
    String nameEmployee, addressEmployee;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

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

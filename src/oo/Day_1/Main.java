package oo.Day_1;

public class Main {
    public static void main(String[] args) {
         //Bien tham chieu doi tuong
         Account account = new Account();
 
         account.show();
         account.depoist();
         account.show();
 
         account.withdraw();
         account.show();


         Customer customer = new Customer();
         customer.show();


         Employee employee = new Employee();
         employee.show();
    }
}

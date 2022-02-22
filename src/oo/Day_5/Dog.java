package oo.Day_5;

public class Dog {
    //attribute - data
    private int size;
    /**default*/String name;//interface
    /**default*/String bread;//interface

    //method - behavior
    //interface
    public void setSize(int size){
        if(size > 0){
            this.size = size;
        }else{
            System.out.println("Khong hop le!!");
        }
    }

    //interface
    public int getSize(){
        return this.size;
    }
}

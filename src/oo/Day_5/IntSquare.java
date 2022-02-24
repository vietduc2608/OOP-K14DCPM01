package oo.Day_5;

public class IntSquare {
    private double squareValue; //implementation

    //interface
    public double getSquareMath(int value){ 
        //implementation - thuật toán
        this.calculateSquare(value);
        return this.squareValue;
    }

    //implementation
    private void calculateSquare(int value){
        this.squareValue = value; //Math
    }

}

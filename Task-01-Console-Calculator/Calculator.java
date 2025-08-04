import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;
    Calculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int addition(){
        return num1+num2;
    }
    public int subtraction(){
        return num1-num2;
    }
    public int multiplication(){
        return num1*num2;
    }

    public double division(){
        if(num2==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double)num1/num2;
    }
}

package com.mycompany.test;
import java.util.Scanner;
public class Test {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int i1,i2,i3=0;
        i1=s.nextInt();
        i2=s.nextInt();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter Option: ");
        int option;
        option=s.nextInt();
        switch(option){
            case 1:
                i3=i1+i2;
                break;
            case 2:
                i3=i1-i2;
                break;
            case 3:
                i3=i1*i2;
                break;
            case 4:
                i3=i1/i2;
                break;           
        }
        System.out.println("Result: "+i3);
        s.close();
    }
}

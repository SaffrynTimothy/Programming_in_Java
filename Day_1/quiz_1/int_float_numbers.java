package com.mycompany.test;
import java.util.Scanner;
public class Test {
    public static void main(String[]args){
        int option;
        Scanner s=new Scanner(System.in);
        System.out.println("1. Display Integer\n2.Average of two floating numbers");
        System.out.println("Enter option: ");
        option=s.nextInt();
        if(option==1){
            System.out.println("Enter an Integer: ");
            int i=s.nextInt();
            System.out.println("Entered Integer: "+i);
        }
        else if(option==2){
            System.out.println("Enter 1st Float Number: ");
            float i1=s.nextFloat();
            System.out.println("Enter 2nd Float Number: ");
            float i2=s.nextFloat();
            float avg=(i1+i2)/2;
            System.out.println("Average: "+avg);
        }
        s.close();
    }
}

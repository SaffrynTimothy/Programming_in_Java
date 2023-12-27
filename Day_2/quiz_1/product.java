package com.mycompany.test;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of Elements in the array: ");
        int n=s.nextInt(),sum=1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter ELement "+i+": ");
            arr[i]=s.nextInt();
        }
        int newarr[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    sum*=arr[j];
                }
            }
            System.out.println(sum);
            newarr[i]=sum;
            sum=1;
        }
        System.out.println("Product: ");
        for(int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}

package com.mycompany.test;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n=s.nextInt();
        int myArray[]= new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            myArray[i]=s.nextInt();
        }
        generatePermutations(myArray, 0);
    }

    private static void generatePermutations(int[] arr, int index) {
        if (index == arr.length - 1) {
            printArray(arr);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1);
            swap(arr, index, i); // backtrack to restore the original order
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

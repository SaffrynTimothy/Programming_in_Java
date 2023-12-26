package com.mycompany.test;
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number to check if Number is Happy: ");
        int n = s.nextInt();
        boolean result = isHappy(n);
        System.out.println(result);
    }
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;
        while (slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return slow == 1;
    }
    private static int getNext(int n){
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}

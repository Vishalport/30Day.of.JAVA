package com.vishal;
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("add the number till number end at :");
        System.out.print("Like [ 1+2+3+4+5.......n] = ");
        int n = input.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("Till number "+i+" = : "+sum);
            sum = sum+i;
        }
        System.out.println("Total = "+sum);
    }
}

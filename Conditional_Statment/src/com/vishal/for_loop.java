package com.vishal;
import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input :");
        int variable = input.nextInt();

        for(int i =0; i<=variable; i++) {
            System.out.println("this is "+i+", where loop is colling..!!");
        }
    }
}

package com.vishal;
import java.util.Scanner;

public class Do_while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input : ");
        int var = input.nextInt();

        int count = 0;
        do {
            System.out.println("this is "+count+" time loop is calling..!!");
            count++;
        }while (count<var);
    }
}


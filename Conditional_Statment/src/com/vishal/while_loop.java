package com.vishal;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input : ");
        int condition = input.nextInt();

        int count=0;
        while(count < condition){
            System.out.println("this is loop "+count+" is Calling..!!");
            count++;
        }
    }
}

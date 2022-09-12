package com.vishal;
import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number % 2 == 0) {
            System.out.println(number+" is even");
        }
        else {
            System.out.println(number+" number is odd");
        }
    }
}

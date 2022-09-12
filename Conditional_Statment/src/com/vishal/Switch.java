package com.vishal;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int button = input.nextInt();

        switch (button) {
            case 1 -> {
                System.out.println("1st case is working..!!");
            }
            case 2 -> {
                System.out.println("2nd case is working..!!");
            }
            case 3 -> {
                System.out.println("3rd case is working..!!");
            }
            default -> {
                System.out.println("default case is working..!!");
            }
        }
    }
}

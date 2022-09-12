// Q. print the * with row and colum by user input ?
package com.vishal;
import java.util.Scanner;

public class Nested_forLoop {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Input Row : ");
        int row = input.nextInt();
        System.out.print("Input Colum : ");
        int col = input.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }

            System.out.println("*");
        }
    }
}

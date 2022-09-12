// Q. print the pattern as Hollow rectangle, where row colum is 4 : 10.
package com.vishal;

public class Nested_ForLoop_2 {
    public static void main(String[] args) {
        int row = 5;
        int col = 10;
        // outer line
        for (int i = 1; i <=row ; i++) {
            // inner line
            for (int j = 1; j <=col ; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

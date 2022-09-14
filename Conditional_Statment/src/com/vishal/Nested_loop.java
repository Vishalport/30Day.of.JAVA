/*
    print the pattern look line...
    4 4 4 4 4 4 4
    4 3 3 3 3 3 4
    4 3 2 2 2 3 4
    4 3 2 1 2 3 4
    4 3 2 2 2 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4

    * * * * * *
    * # # # # *
    * # # # # *
    * * * * * *
*/

package com.vishal;

public class Nested_loop {
    public static void main(String[] args) {
        int row = 7;
        int col = 7;
        int row2 = 5;
        int col2 = 5;
        // outer line
        for (int i = 1; i <=row ; i++) {
            // 1st inner line
            for (int j = 1; j <=col ; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("4");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


//         ------------------------2nd ------------------
//        for (int i = 1; i <=row2 ; i++) {
//            // 1st inner line
//            for (int j = 1; j <=col2 ; j++) {
//                if (i == 2 || j == 2 || i == row2 || j == col2) {
//                    System.out.print("3");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

    }
}


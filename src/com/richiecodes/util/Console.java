package com.richiecodes.util;

import java.util.Scanner;

public class Console {

    public Console() {
        /* :) */
    }

    private static Scanner scan = new Scanner(System.in);

    public static int[] getArray() {
        System.out.println("ENTER LENGTH OF ARRAY: ");
        int length = scan.nextInt();
        int[] newArr = new int[length];

        for(int i=0; i < length; i++) { //scan input for given int "length"
            System.out.println("Enter value of the integer at array value " + (i + 1));
            int in = scan.nextInt();
            newArr[i] = in;
        }

        return newArr;
    }

}

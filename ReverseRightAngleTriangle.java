package com.jsp.programming.pattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseRightAngleTriangle {

    public static void reverseRightAngle(int rows) {
        for(int i=rows; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        reverseRightAngle(rows);
    }

}

package com.jsp.programming.pattern;

import java.util.Scanner;

public class RightAngleTrianglePattern {

    public static void rightAngle(int row) {
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of Row: ");
        int row = sc.nextInt();
        rightAngle(row);
    }

}

package com.jsp.programming.pattern;

import java.util.Scanner;

public class PrintQ {
    public static void printPattern(int row) {
        int mid = row/2+1;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row; j++) {
                if((i==1 && j<=row-2) || (j==1 && i<=row-2) || (i==row-2 && j<=row-2)
                || (j==row-2 && i<=row-2) || (i==j && i>=mid)) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of row : ");
        int row = sc.nextInt();

        if (row % 2 == 0) {
            row++;
        }

        printPattern(row);
    }
}

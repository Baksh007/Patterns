package com.jsp.programming.pattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintB {
    public static void printPattern(int row) {
        int mid = row/2+1;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row; j++) {
                if(j == 1 || (i == 1 && j != row) || (i == mid && j != row) ||
                        (i == row && j != row) || (j == row && (i != 1 && i != mid && i != row))) {
                    System.out.print(" B ");
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
        System.out.println("Enter the numbers of Rows: ");
        int row = sc.nextInt();

        printPattern(row);
    }
}

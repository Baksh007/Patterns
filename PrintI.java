package com.jsp.programming.pattern;

import java.util.Scanner;

public class PrintI {
    public static void printPattern(int row) {
        int mid = row/2+1;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row; j++) {
                if(i==1 || i==row || j==mid) {
                    System.out.print(" I ");
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

package com.jsp.programming.pattern;

import java.util.Scanner;

public class PrintP {
    public static void printPattern(int row) {
        int mid = row/2+1;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=mid; j++) {
                if((i==1 && j!=mid) || (j==1) || (i==mid && j!=mid) ||(i!=1 && j==mid && i!=mid)) {
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
        System.out.println("Enter the numbers of Rows: ");
        int row = sc.nextInt();

        printPattern(row);
    }
}

package com.jsp.programming.pattern;

import java.util.Scanner;

public class PrintK {
    public static void printPattern(int row) {
        int mid = row/2+1;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=mid; j++) {
                if(j==1 || (i+j==mid+1) || (i-j)==mid-1) {
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

        if(row % 2 == 0) {
            row++;
        }

        printPattern(row);
    }
}

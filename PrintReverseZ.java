package com.jsp.programming.pattern;

import java.util.Scanner;

public class PrintReverseZ {
    public static void printStraightZ(int row) {
        int mid = row/2+1;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row; j++) {
                if(j == mid || (i == 1 && j >= mid) || (i == row && j<= mid)) {
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
        int row = sc.nextInt();
        if(row % 2 == 0) {
            row++;
        }
        printStraightZ(row);
    }
}

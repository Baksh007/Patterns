package com.jsp.programming.pattern;

import java.util.Scanner;

public class PrintPlus {
    public static void printPatternPlus(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows; j++) {
                if((i == (rows/2)+1) || (j == (rows/2)+1)) {
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
        int rows = sc.nextInt();
        if(rows % 2 == 0) {
            rows++;
        }
        printPatternPlus(rows);
    }
}

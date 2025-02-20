package com.jsp.programming.pattern;

import java.util.Scanner;

public class PrintX {
    public static void printPatternX(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows; j++) {
                if(i == j || ((i+j) == rows + 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
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
        printPatternX(rows);
    }
}

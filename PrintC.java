package com.jsp.programming.pattern;

public class PrintC {
    public static void printPattern(int row) {
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row; j++) {
                if((i == 1 && j != 1) || (i == row && j != 1) || (j == 1 && (i != row && i != 1))) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 6;
        printPattern(row);
    }
}

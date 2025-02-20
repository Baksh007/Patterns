package com.jsp.programming.pattern;

public class PrintReverseTriPattern {
    public static void pattern(int rows) {
        for(int i=rows; i>=1; i--) {
            for(int j=1; j<=rows; j++) {
                if(j <= (rows-i)) {
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
}

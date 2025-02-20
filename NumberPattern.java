package com.jsp.programming.pattern;

public class NumberPattern {
    
    public static void pattern(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
}

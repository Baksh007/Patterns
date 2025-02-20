package com.jsp.programming.pattern;

public class ReverseRightAngleTri {
    public static void pattern(int rows) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows; j++) {
                if(j <= (rows - i)) {
                    System.out.print(" @ ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows = 4;
        pattern(rows);
    }
}

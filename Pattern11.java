package com.dsa.patterns;

public class Pattern11 {
    public static void pattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 7;
        pattern(n);
    }
}

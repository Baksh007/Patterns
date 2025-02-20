package com.dsa.patterns;

public class Pattern10 {
    public static void pattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 7;
        pattern(n);
    }
}

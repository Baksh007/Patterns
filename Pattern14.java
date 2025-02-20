package com.dsa.patterns;

public class Pattern14 {
    public static void pattern(int n) {
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 7;
        pattern(n);
    }
}

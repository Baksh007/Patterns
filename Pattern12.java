package com.dsa.patterns;

public class Pattern12 {
    public static void pattern(int n) {
        int start = 1;
        for(int i=0; i<n; i++) {
            if(i%2==0) {
                start = 1;
            }
            else {
                start = 0;
            }
            for(int j=0; j<=i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 7;
        pattern(n);
    }
}

package com.dsa.patterns;

public class Pttern19 {
    public static void pattern(int n) {
        for(int i=0; i<n; i++) {
            for(char ch=(char)('E'-i); ch<='E'; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}

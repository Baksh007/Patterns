package com.dsa.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++) {
            for(int j=i; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

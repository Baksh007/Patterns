package com.dsa.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7-i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}

package com.dsa.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            for(int l=0; l<7-i-1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<7; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<2*7-(2*i+1); k++) {
                System.out.print("*");
            }
            for(int l=0; l<i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

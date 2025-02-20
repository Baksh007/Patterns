package com.dsa.patterns;

public class Pattern15 {
    public static void pattern(int n)  {
        for(int i=0; i<n; i++) {
            for(char ch = 'A'; ch<'A'+i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n= 7;
        pattern(n);
    }
}

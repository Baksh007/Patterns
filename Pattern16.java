package com.dsa.patterns;

public class Pattern16 {
    public static void pattern(int n)  {
        for(int i=0; i<=n; i++) {
            int rev = n-i-1;
            for(char ch = 'A'; ch<'A'+rev; ch++) {
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

package com.dsa.patterns;

public class Pattern18 {
    public static void pattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPt = (2*i+1)/2;
            for(int j=0; j<2*i+1; j++) {
                System.out.print(ch + " ");
                if(j<=breakPt) {
                    ch++;
                }
                else {
                    ch--;
                }
            }

            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 7;
        pattern(n);
    }
}

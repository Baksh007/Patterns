package com.jsp.programming.pattern;

import java.util.Scanner;

public class Swastik {
    public static void printSwastik(int row)throws InterruptedException {
        int mid = row/2+1;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row; j++) {
                if((i == row && j<=mid) ||(i==1 && j>=mid) || i == mid || j == mid || (j == 1 && i<=mid) || (j == row && i>=mid) ) {
                    Thread.sleep(100);
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        if(row % 2 == 0) {
            row++;
        }

        printSwastik(row);
    }
}

package com.company;

import java.util.Scanner;

public class bai3 {
    public static int factorial(int n){
        if(n == 0 ){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int denominator(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += factorial(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Nhap so n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res =0;
        for(int i =1;i<=n;i++){
            res += (double)1/denominator(i);
        }
        System.out.println("Ket qua "+res);
        System.out.println("Luong Hoang Lam 20183780");
    }
}

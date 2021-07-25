package com.company;

import java.util.Scanner;

public class bai2 {
    public static int factorial(int n){
        if(n == 0 ){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Nhap so n :");
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        double res =0;

        for(int i =1;i<=n;i++){
            res +=(double) 1/factorial(i);
        }
        System.out.println("Ket qua : "+res);
        System.out.println("Luong Hoang Lam 20183780");
    }
}

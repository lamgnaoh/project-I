package com.company.tuan2;

import java.util.Scanner;

public class bai2 {
    public static int factorial(int n){
        if(n == 0 ){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main() {
        System.out.println("Cho số tự nhiên N bất kỳ, tính tổng\n" +
                "S= 1+ 1/2! + 1/3! + … + 1/N!\n");
        System.out.println();
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

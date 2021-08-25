package com.company.tuan2;

import java.util.Scanner;

public class bai6 {
    public static boolean isPrimeNumber(int n){
        if(n == 1)
            return false;
        for(int i =2 ;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main() {
        System.out.println("Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này");
        System.out.println();
        System.out.println("Nhap so phan tu  :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =1 ;i<=n;i++){
            System.out.println("Nhap phan tu thu "+i+":");
            arr[i-1] = scanner.nextInt();
        }
        for(int i = 0 ;i<arr.length;i++){
            if(isPrimeNumber(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

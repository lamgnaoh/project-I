package com.company;

import java.util.Scanner;

public class bai9 {
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

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu  :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =1 ;i<=n;i++){
            System.out.println("Nhap phan tu thu "+i+":");
            arr[i-1] = scanner.nextInt();
        }
        int count_Prime = 0;
        int count_nonPrime =0;
        for(int i = 0 ;i<arr.length;i++){
            if(isPrimeNumber(arr[i])){
                count_Prime++;
            }
            else if(arr[i]!=1){
                count_nonPrime++ ;
            }
        }
        System.out.println("So cac so nguyen to : "+ count_Prime+" so cac hop so "+count_nonPrime);
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

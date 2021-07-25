package com.company;

import java.util.Scanner;

public class bai8 {
    public static final int MIN_INT = -999999999;
    public static int findMax(int[] arr){
        int max = MIN_INT;
        for(int i =0;i<arr.length;i++){
            if(arr[i] >  max){
                max = arr[i];
            }
        }
        return max;
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
        int max_arr = findMax(arr);
        System.out.print("Max cua day la :"+ max_arr+" va co chi so:");
        for(int i = 0 ;i<n;i++){
            if(arr[i]==max_arr){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

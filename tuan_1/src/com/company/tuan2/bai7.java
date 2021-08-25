package com.company.tuan2;

import java.util.Scanner;

public class bai7 {
    public static final int MAX_INT = 999999999;
    public static int findMin(int[] arr){
        int min = MAX_INT;
        for(int i =0;i<arr.length;i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main() {
        System.out.println("Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các chỉ số ứng với giá trị min này.");
        System.out.println();
        System.out.println("Nhap so phan tu  :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =1 ;i<=n;i++){
            System.out.println("Nhap phan tu thu "+i+":");
            arr[i-1] = scanner.nextInt();
        }
        int min_arr = findMin(arr);
        System.out.print("Min cua day la :"+ min_arr+" va co chi so:");
        for(int i = 0 ;i<n;i++){
            if(arr[i]==min_arr){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

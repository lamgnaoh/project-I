package com.company.tuan2;

import java.util.Scanner;

public class bai5 {
    public static void sort(int[] arr){
        int tmp ;
        for(int i =0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
    public static void main() {
        System.out.println("Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.");
        System.out.println();
        System.out.println("Nhap so phan tu  :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =1 ;i<=n;i++){
            System.out.println("Nhap phan tu thu "+i+":");
            arr[i-1] = scanner.nextInt();
        }
        sort(arr);
        System.out.print("Day sau khi sap xep la :");
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

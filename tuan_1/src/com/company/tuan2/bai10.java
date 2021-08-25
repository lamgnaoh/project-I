package com.company.tuan2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai10 {
    public static void main() {
        System.out.println("Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên");
        System.out.println();
        System.out.println("Nhap so phan tu  :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =1 ;i<=n;i++){
            System.out.println("Nhap phan tu thu "+i+":");
            arr[i-1] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr[j]%arr[i] == 0 && i!=j && !list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
        }
        System.out.println("Ket qua "+list);
        System.out.println("Luong Hoang Lam 20183780");
    }
}

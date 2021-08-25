package com.company.tuan2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai11 {
    public static final int MAX_INT = 999999999;
    public static int findMin(List<Integer> arr) {
        int min = MAX_INT;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).compareTo(min)<0) {
                min = arr.get(i);
            }
        }
        return min;
    }
    public static void main() {
        System.out.println("Cho một dãy số tự nhiên, hãy tìm 1 số tự nhiên nhỏ nhất c không bằng bất cứ số nào trong dãy trên.");
        System.out.println();
        System.out.println("Nhap so phan tu  :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            arr[i - 1] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for(int i =0 ;i<n-1;i++){
            for(int j =0;j<n;j++){
                if(arr[i]==arr[j]&& i!=j){
                    break;
                }
                else if(j == n-1){
                    list.add(arr[i]);
                }
            }
        }
        System.out.println("ket qua la : "+findMin(list));
        System.out.println("Luong Hoang Lam 20183780");
    }
}

package com.company;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu  :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            arr[i - 1] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i =0;i<n;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        System.out.println("Day sau khi luoc bo cac so 0 la :"+ list);
        System.out.println("Luong Hoang Lam 20183780");
    }
}

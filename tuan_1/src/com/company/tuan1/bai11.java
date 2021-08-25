package com.company.tuan1;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class bai11 {
    public  static void sortArray(int[] arr){
        Random random = new Random();
        for(int i =arr.length-1;i>=0;i--){
            int index = random.nextInt(i+1);
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i]=tmp;
        }
    }

    public static void main() {
        System.out.println("Viết chương trình tráo đổi ngẫu nhiên vị trí một dãy số cho trước. Để lấy một số int ngẫu nhiên từ 0 đến n-1 ta dùng lệnh int i = Random.nextInt(n); ");
        System.out.println();
        System.out.println("Nhap so phan tu cua mang :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 1;i<=n;i++){
            System.out.println("phan tu thu "+i+": ");
            arr[i-1] = scanner.nextInt();
        }
        System.out.println("day sau khi dao  : ");
        sortArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");;

        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

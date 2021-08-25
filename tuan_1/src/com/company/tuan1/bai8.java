package com.company.tuan1;

import java.util.Scanner;

public class bai8 {
    public static boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }
        if(n==2){
            return true;
        }
        int sqr = (int) Math.sqrt(n) +1;
        for(int i = 2 ; i<= sqr  ;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main() {
        System.out.println("Cho số tự nhiên N bất kỳ (đã gán trước đó), tìm và in ra ước số nguyên tố nhỏ nhất của N");
        System.out.println();
        System.out.println("Nhap n :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =1 ;i<=n;i++){
            if(n%i==0){
                if(isPrimeNumber(i)){
                    System.out.println("Uoc nguyen to nho nhat la :"+i);
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

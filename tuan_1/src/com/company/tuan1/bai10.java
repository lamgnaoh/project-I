package com.company.tuan1;

import java.util.Scanner;

public class bai10 {
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
        System.out.println("Cho trước số tự nhiên N bất kỳ (đã gán trước đó). In ra màn hình tất cả các ước số nguyên tố khác nhau của N");
        System.out.println();
        System.out.println("Nhap n :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Cac uoc nguyen to cua "+n );
        for(int i =1;i<=n;i++){
            if(n%i==0&&isPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }

}

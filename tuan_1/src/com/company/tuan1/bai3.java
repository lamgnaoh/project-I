package com.company.tuan1;

public class bai3 {
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

        System.out.println("In ra man hinh tat ca cac so nguyen to tu 1000 den 2000");
        System.out.println();
        for(int i = 1000;i<=2000;i++){
            if(isPrimeNumber(i)){
                System.out.print( i +" ");
            }

        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

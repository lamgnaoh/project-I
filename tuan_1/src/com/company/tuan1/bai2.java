package com.company.tuan1;


public class bai2 {
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
        int count = 0 ;
        System.out.println("In ra màn hình 20 số nguyên tố đầu tiên : ");
        System.out.println();
        for(int i = 0;;i++){
            if(isPrimeNumber(i)){
                System.out.print(i +" ");
                count ++ ;
            }
            if(count ==20){
                break;
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

package com.company.tuan1;

public class bai6 {
    public static boolean isPrimeNumber(double n){
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
//    public static boolean isPerfectNumber(long n){
//        int res = 0;
//        for(int i =1 ;i<=n/2;i++){
//            if(n % i ==0){
//                res+=i;
//            }
//        }
//        if(res == n){
//            return true;
//        }
//        return false;
//    }
    public static void main() {
        int count =0 ;
        System.out.println("In ra màn hình 5 số hoàn hảo đầu tiên:  ");
        System.out.println();
        for(int i =1;;i++){
            if(isPrimeNumber(Math.pow(2,i)-1)){
                System.out.print(Math.pow(2,i-1)*(Math.pow(2,i)-1)+" ");
                count ++ ;
            }
            if(count == 5){
                break;
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");

    }
}

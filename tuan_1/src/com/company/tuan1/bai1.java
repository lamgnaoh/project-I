package com.company.tuan1;

import static java.lang.StrictMath.sqrt;

public class bai1 {
    public static boolean isCompositeNumber(int n){
        if(n <= 2) {
            return false;
        }
        int sqrNumber = (int)sqrt(n)+1;
        for(int i = 2;i<sqrNumber;i++){
            if(n % i  == 0){
                return true;
            }
        }
        return false ;
    }

    public static void main() {
	// write your code here
        System.out.println("In ra màn hình tất cả các hợp số <100");
        System.out.println();
        System.out.println("Cac hop so nho hon 100 la : ");
        for(int i =0;i<100;i++) {
            if (isCompositeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam MSSV:20183780");
    }
}

package com.company.tuan1;

public class bai5 {
    public static boolean isDivide3And5And7(int n){
        if(n%3==0 && n%5 ==0 && n%7==0){
            return true;
        }
        return false;
    }
    public static void main() {
        System.out.println("In ra màn hình các số nằm giữa 1000 đến 2000 và chia hết cho 3 5 7");
        System.out.println();
        for(int i=1000;i<= 2000;i++){
            if(isDivide3And5And7(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

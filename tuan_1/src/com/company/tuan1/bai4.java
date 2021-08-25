package com.company.tuan1;

public class bai4 {
    public static boolean isDivide3And7(int n){
        if(n%3==0 && n%7 ==0){
            return true;
        }
        return false;
    }
    public static void main() {
        System.out.println("In ra màn hình các số < 100 và chia hết cho 3 và 7: ");
        System.out.println();
        for(int i =0 ;i<100;i++){
            if(isDivide3And7(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

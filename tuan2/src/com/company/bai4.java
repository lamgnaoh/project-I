package com.company;

        import java.util.Scanner;

public class bai4 {
    public static int fibonaci(int n){
        if(n ==0 || n==1){
            return 1;
        }
        return fibonaci(n-2)+fibonaci(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Nhap so n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = fibonaci(n);
        System.out.println("Ket qua la : "+res);
        System.out.println("Luong Hoang Lam 20183780");
    }
}

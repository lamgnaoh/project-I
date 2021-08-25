package com.company.tuan2;

        import java.util.Scanner;

public class bai4 {
    public static int fibonaci(int n){
        if(n ==0 || n==1){
            return 1;
        }
        return fibonaci(n-2)+fibonaci(n-1);
    }
    public static void main() {
        System.out.println("Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N.");
        System.out.println();
        System.out.println("Nhap so n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = fibonaci(n);
        System.out.println("Ket qua la : "+res);
        System.out.println("Luong Hoang Lam 20183780");
    }
}

package com.company.tuan2;

        import java.util.Scanner;

public class bai1 {
    public static int  denominator(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    public static void main() {
        System.out.println("Cho số tự nhiên N bất kỳ\n" +
                "Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)\n");
        System.out.println();
        System.out.println("Nhap n :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res =0;
        for(int i =1 ;i<=n;i++){
            res += (double)1/denominator(i);
        }
        System.out.println("Ket qua :"+res);
        System.out.println("Luong Hoang Lam 20183780");
    }
}

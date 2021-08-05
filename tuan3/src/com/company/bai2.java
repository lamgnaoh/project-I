package com.company;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int cnt = 0;
        System.out.println("Nhap chuoi:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for(int i =3;i<=s.length();i++){
            if(s.substring(i-3,i).equals("abc")){
                cnt++;
            }
        }
        System.out.println("So lan xuat hien chuoi abc la :"+cnt);
        System.out.println("Luong Hoang Lam 20183780");
    }
}

package com.company;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Nhap ten :");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String name = s.trim();
        for (int i = name.length() - 1; i >= 0; i--) {
            if (String.valueOf(name.charAt(i)).equals(" ")) {//kiem tra dau cach cuoi cung trong ten
                String last_name = name.substring(i + 1);
                System.out.println("Ten :" + last_name);
                break;
            }
        }
        System.out.println("Luong Hoang Lam 20183780");
    }
}

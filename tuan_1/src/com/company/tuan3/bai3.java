package com.company.tuan3;

import java.util.Scanner;

public class bai3 {
    public static void main() {
        System.out.println("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này");
        System.out.println();
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

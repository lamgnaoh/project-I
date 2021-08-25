package com.company.tuan3;

import java.util.Scanner;

public class bai4 {
    public static void main() {
        System.out.println("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này");
        System.out.println();
        System.out.println("Nhap ten:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String name = s.trim();
        for(int i = 0;i<name.length();i++){
            if(String.valueOf(name.charAt(i)).equals(" ")){
                String first_name = name.substring(0,i);
                System.out.println("Ho: " + first_name);
                break;
            }
        }
        System.out.println("Luong Hoang Lam 20183780");
    }
}

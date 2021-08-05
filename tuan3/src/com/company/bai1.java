package com.company;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        System.out.println("Nhập tên :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Sau khi xóa khoảng trắng thừa  :");
        System.out.println(name.replaceAll("\\s\\s+"," ").trim());
        System.out.println("Luong Hoang Lam 20183780");
    }
}

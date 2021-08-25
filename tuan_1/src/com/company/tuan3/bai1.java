package com.company.tuan3;

import java.util.Scanner;

public class bai1 {

    public static void main() {
        System.out.println("Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.");
        System.out.println();
        System.out.println("Nhập tên :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Sau khi xóa khoảng trắng thừa  :");
        System.out.println(name.replaceAll("\\s\\s+"," ").trim());
        System.out.println("Luong Hoang Lam 20183780");
    }
}

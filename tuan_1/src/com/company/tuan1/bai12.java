package com.company.tuan1;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao h cua tam giac (2<=h<=10):");
        int h;
        do {
            h = scanner.nextInt();
            if (h < 2 || h > 10) {
                System.out.println("Yeu cau nhap lai chieu cao h cua tam giac (2<=h<=10)");
            }
        } while (h < 2 || h > 10);
        System.out.println("Chon loai tam giac");
        System.out.println("1: Tam giac nguoc");
        System.out.println("2:tam giac xuoi");
        outer: while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= h - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * (i - 1) + 1; j++) {
                            System.out.print("*");
                        }
                        for (int j = 1; j <= h - i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    for (int i = h; i >= 1; i--) {
                        for (int j = 1; j <= h - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * (i - 1) + 1; j++) {
                            System.out.print("*");
                        }
                        for (int j = 1; j <= h - i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                }
                default: {
                    System.out.println("Nhap lai lua chon cua ban (1-2)");
                    continue outer;
                }

            }
            break;
        }
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");


    }

}

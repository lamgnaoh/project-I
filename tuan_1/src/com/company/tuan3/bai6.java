package com.company.tuan3;

import java.util.Scanner;

public class bai6 {
    public static void main() {
        System.out.println("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là  “Thị”.");
        System.out.println();
        System.out.println("Nhap so luong hoc sinh:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten dem can kiem tra :");
        String name_check = scanner.nextLine();
        int cnt = 0;//bien dem
        for(int i =0;i<n;i++){
            System.out.println("Nhap hoc sinh thu "+(i+1)+":");
            String s = scanner.nextLine();
            if(check(s,name_check)){
                cnt++;
            }
        }
        System.out.println("So luong hoc sinh co ten dem  "+'"' +name_check+'"' + " la : " +cnt);
        System.out.println("Luong Hoang Lam 20183780 ");
    }

    private static boolean check(String s, String name_check) {
        String name = s.trim().replaceAll("\\s\\s+"," ");
        String[] tmp = name.split(" ");
        if(tmp.length < 3){
            System.out.println("Khong co ten lot ");
        }
        if(name_check.equalsIgnoreCase(tmp[1])){
            return true;
        }
        return false;
    }
}

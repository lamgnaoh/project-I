package com.company;

import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        System.out.println("Nhap so luong hoc sinh:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten can kiem tra :");
        String name_check = scanner.nextLine();
        int cnt =0;//bien dem
        for(int i = 0;i<n;i++){
            System.out.println("Nhap hoc sinh thu "+(i+1)+":");
            String s = scanner.nextLine();
            if(check(s,name_check)){
                cnt++;
            }
        }
        System.out.println("So luong hoc sinh trung ten "+name_check+" la :"+cnt);
        System.out.println("Luong Hoang Lam 20183780");
    }

    private static boolean check(String s,String name_check) {
        String full_name = s.trim();
        int n = s.length();
        for(int i = n-1;i>=0;i--){
            if(String.valueOf(full_name.charAt(i)).equals(" ")){
                String last_name = full_name.substring(i+1);
                if(last_name.equalsIgnoreCase(name_check)){
                    return true;
                }
            }
        }
        return false;
    }
}

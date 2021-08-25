package com.company.tuan3;

import java.util.Scanner;

public class bai7 {
    public static void main() {
        System.out.println("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn  có tên bắt đầu bằng chữ “H”.");
        System.out.println();
        System.out.println("Nhap so luong hoc sinh:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap chu cai can kiem tra :");
        String name_check = String.valueOf(scanner.nextLine().charAt(0));
        int cnt =0;//bien dem
        for(int i = 0;i<n;i++){
            System.out.println("Nhap hoc sinh thu "+(i+1)+":");
            String s = scanner.nextLine();
            if(check(s,name_check)){
                cnt++;
            }
        }
        System.out.println("So luong hoc sinh trung chu cai  "+name_check+" la :"+cnt);
        System.out.println("Luong Hoang Lam 20183780");
    }

    private static boolean check(String s,String name_check) {
        String full_name = s.trim();
        int n = full_name.length();
        for(int i = n-1;i>=0;i--){
            if(String.valueOf(full_name.charAt(i)).equals(" ")){
                if(String.valueOf(full_name.charAt(i+1)).equalsIgnoreCase(name_check)){
                    return true;
                }else
                    break;

            }
        }
        return false;
    }
    }


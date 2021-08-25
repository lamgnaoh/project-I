package com.company;
import java.util.Scanner;
import com.company.tuan1.*;
import com.company.tuan1.bai1;
import com.company.tuan1.bai2;
import com.company.tuan2.*;
import com.company.tuan3.*;

public class Main {
    public static void main(String[] args) {
        com.company.tuan1.bai1 bai1week1 = new com.company.tuan1.bai1();
        com.company.tuan2.bai1 bai1week2 = new com.company.tuan2.bai1();
        com.company.tuan3.bai1 bai1week3 = new com.company.tuan3.bai1();

        com.company.tuan1.bai2 bai2week1 = new com.company.tuan1.bai2();
        com.company.tuan2.bai2 bai2week2 = new com.company.tuan2.bai2();
        com.company.tuan3.bai2 bai2week3 = new com.company.tuan3.bai2();

        com.company.tuan1.bai3 bai3week1 = new com.company.tuan1.bai3();
        com.company.tuan2.bai3 bai3week2 = new com.company.tuan2.bai3();
        com.company.tuan3.bai3 bai3week3 = new com.company.tuan3.bai3();

        com.company.tuan1.bai4 bai4week1 = new com.company.tuan1.bai4();
        com.company.tuan2.bai4 bai4week2 = new com.company.tuan2.bai4();
        com.company.tuan3.bai4 bai4week3 = new com.company.tuan3.bai4();

        com.company.tuan1.bai5 bai5week1 = new com.company.tuan1.bai5();
        com.company.tuan2.bai5 bai5week2 = new com.company.tuan2.bai5();
        com.company.tuan3.bai5 bai5week3 = new com.company.tuan3.bai5();

        com.company.tuan1.bai6 bai6week1 = new com.company.tuan1.bai6();
        com.company.tuan2.bai6 bai6week2 = new com.company.tuan2.bai6();
        com.company.tuan3.bai6 bai6week3 = new com.company.tuan3.bai6();

        com.company.tuan1.bai7 bai7week1 = new com.company.tuan1.bai7();
        com.company.tuan2.bai7 bai7week2 = new com.company.tuan2.bai7();
        com.company.tuan3.bai7 bai7week3 = new com.company.tuan3.bai7();

        com.company.tuan1.bai8 bai8week1 = new com.company.tuan1.bai8();
        com.company.tuan2.bai8 bai8week2 = new com.company.tuan2.bai8();

        com.company.tuan1.bai9 bai9week1 = new com.company.tuan1.bai9();
        com.company.tuan2.bai9 bai9week2 = new com.company.tuan2.bai9();

        com.company.tuan1.bai10 bai10week1 = new com.company.tuan1.bai10();
        com.company.tuan2.bai10 bai10week2 = new com.company.tuan2.bai10();

        com.company.tuan1.bai11 bai11week1 = new com.company.tuan1.bai11();
        com.company.tuan2.bai11 bai11week2 = new com.company.tuan2.bai11();

        com.company.tuan1.bai12 bai12week1 = new com.company.tuan1.bai12();
        com.company.tuan2.bai12 bai12week2 = new com.company.tuan2.bai12();
         while(true){
             System.out.println("Hãy Nhập bài bạn muốn xem kết quả:");
             System.out.println("VD: week 1 bài 2 thì viết 1.2......");
             Scanner input = new Scanner(System.in);
             String nhap = input.nextLine();
             switch (nhap){
                 case "1.1":
                     bai1week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.2":
                     bai2week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.3":
                     bai3week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.4":
                     bai4week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.5":
                     bai5week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.6":
                     bai6week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.7":
                     bai7week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.8":
                     bai8week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.9":
                     bai9week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.10":
                     bai10week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.11":
                     bai11week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "1.12":
                     bai12week1.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.1":
                     bai1week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.2":
                     bai2week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.3":
                     bai3week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.4":
                     bai4week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.5":
                     bai5week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.6":
                     bai6week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.7":
                     bai7week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.8":
                     bai8week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.9":
                     bai9week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.10":
                     bai10week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.11":
                     bai11week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "2.12":
                     bai12week2.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "3.1":
                     bai1week3.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "3.2":
                     bai2week3.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "3.3":
                     bai3week3.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "3.4":
                     bai4week3.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "3.5":
                     bai5week3.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "3.6":
                     bai6week3.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 case "3.7":
                     bai7week3.main();
                     System.out.println("----------------------------------------------------");
                     break;
                 default:
                     System.out.println("Không có bài này");
                     continue;
             }
         }


    }
}

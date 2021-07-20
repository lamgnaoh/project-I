package com.company.tuan1;

public class bai7 {
    public static void main(String[] args) {
        int a =0,b= 0,c=0,d=0;
        for(int i =0 ;i<=100;i++){
            switch (i%5){
                case 0 : a++;break;
                case 1 : b++;break;
                case 2 : c++;break;
                case 3 : d++;break;
            }
        }
        System.out.println("Có"+a+"số chia hết cho 5");
        System.out.println("Có"+b+"số chia  cho 5 dư 1");
        System.out.println("Có"+c+"số chia  cho 5 dư 2");
        System.out.println("Có"+d+"số chia cho 5 dư 3");
        System.out.println();
        System.out.println("Luong Hoang Lam 20183780");
    }
}

package com.kh.day4;

import java.util.Scanner;

/*
    가위바위보 게임을 구현하시오
    Math.random() : 0.0 <= 실수값 < 1.0
 */
public class Test9 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 3; i++) {
//            int x = (int) (Math.random() * 3);
//            System.out.println(x);
//        }
//        // " 가위 "
//        String str = "가위";
//        String str2 = "주먹";
//        if (str.equals(str2)) {
//            System.out.println("같다");
//        } else {
//            System.out.println("다르다");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println(">> 가위,바위,보 <<");
        System.out.println("1.가위 2.바위 3. 보");
        int menu = Integer.parseInt(scanner.nextLine());


            int x = (int) (Math.random())+3;
            System.out.println(x);


    }

}

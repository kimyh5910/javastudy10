package com.kh.day3;

/*
    사용자로부터 단수를 입력받아 구구단 출력하는 프로그램을 작성하시오
 */

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        method1();
        method2();
        }
    // while문 사용
    public static void method1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("<< 구구단 >>");

        boolean stop = false;
        while (!stop) {
            System.out.print("단수 (입력:2~9, 종료 : 'X') ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("X")) {
                stop = true;
                continue;
            }
            int dansu = Integer.parseInt(input);

            for (int x = 1; x <= 9; x++) {
                System.out.println(dansu + " * " + x + " = " + (dansu * x));
                System.out.println();
            }

        System.out.println("프로그램 종료!");
    }
    }

    // do-while문 사용

    public static void method2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<< 구구단 >>");
        boolean stop = false;
        do {
            System.out.print("단수 (입력:2~9, 종료 : 'X') ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("X")) {
                stop = true;
                continue;
            }
            int dansu = Integer.parseInt(input);

            for (int x = 1; x <= 9; x++) {
                System.out.println(dansu + " * " + x + " = " + (dansu * x));
                System.out.println();
            }
            }while (!stop) ;
        System.out.println("프로그램 종료!");
        }
}

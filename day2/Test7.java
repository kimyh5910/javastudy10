package com.kh.day2;

public class Test7 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    // 1부터 10까지의 합을 구하시요
    public static void method1() {
        int sum = 0;
        for (int i=1; i<=10; i++) {
            sum = sum + i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }
    // 1부터 10까지의 홀수의 합을 구하시오

    public static void method2() {
        int sum1 = 0;
//        for (int i=1; i<=10; i++) {
//            if (i % 2 == 1) {
//                sum1 = sum1 + i;
//            }
//        }
        for (int i = 1; i<=10; i=i+2) {
            sum1 = sum1 + i;
        }
        System.out.println("1부터 10까지의 홀수의 합 : " + sum1);
    }
}

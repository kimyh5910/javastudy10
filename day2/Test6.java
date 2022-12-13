package com.kh.day2;

//        for (초기화식; 조건식; 증강식) {
//            실행문1;
//            실행문2;
//        }
public class Test6 {
    public static void main(String[] args) {
        for (;true ; ) {
            System.out.println("*");
        }
    }

    public static void method4() {

        int sum = 0;

        int i = 1;
        for (  ; i <= 3; ) {      // i++ = i+1
            //System.out.println("i = " + i);
            sum = sum + i;
            i++;
        }
        System.out.println("i="+i);
        System.out.println("합계 : " + sum);
    }

    public static void method3() {
        int sum = 0;

        int i = 1;
        for (  ; i <= 3; ) {      // i++ = i+1
            //System.out.println("i = " + i);
            sum = sum + i;
            i++;
        }
        System.out.println("i="+i);
        System.out.println("합계 : " + sum);
    }

    public static void method2() {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {      // i++ = i+1
            sum = sum + i;
        }
        System.out.println("합계 : " + sum);
    }



    public static void method() {
        int i = 1;
        int j = 2;
        int k = 3;
        int sum = i + j + k;
        System.out.println("1~3까지의 합 : " + sum);
    }
}

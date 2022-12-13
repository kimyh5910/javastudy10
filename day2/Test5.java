package com.kh.day2;

// 국,영,수 총점, 평균을 구하시오

public class Test5 {
    public static void main(String[] args) {
        method1();
        printLine('-',30);
        method2();
        printLine('-',30);
        method3();
        printLine('-',30);
        method4();
        printLine('-',30);
    }

    public static void printLine(char c, int cnt) {
        for (int i = 0; i<cnt; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static  void method1() {

        int a = 80;
        int b = 75;
        int c = 60;

        int sum = a + b + c;
        System.out.println("총점 = " + sum);
        double avg = (double)sum / 3;
        System.out.println("평균 = " +avg);
    }

    public static void method2() {
        int a = 20;
        int b = 75;
        int c = 60;

        int sum = a + b + c;
        double avg = (double)sum / 3;

        System.out.println("평균 = " +avg);
    }

    public static void method3() {
        int a, b, c, sum;
        double avg;

        a = 90;
        b = 80;
        c = 44;
        sum = a + b + c;
        avg = (double)sum / 3;

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " +avg);

    }

    public static void method4() {
        int a, b, c, sum;
        double avg;

        a = 90;
        b = 80;
        c = 44;
        sum = sum(a,b,c);
        avg = avg(sum,3);

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " +avg);
    }

    // 3개의 정수값을 입력받아 합계를 반환하는 메소드
    public static int sum(int val1, int val2, int val3) {
        int result = 0;
        result = val1 + val2 + val3;
        return result;
    }


    // 2개의 정수(나누어지는 값과 나눌값)을 입력받아 계산결과를 반환하는 메소드
    public static double avg(int val1, int val2) {
        double result = 0.0;
        result = val1 / (double)val2;
        return result;
    }
}

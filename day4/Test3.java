package com.kh.day4;
/*
1~10까지의 합을 구하시오(for. while, do-while)
 */
public class Test3 {
    public static void main(String[] args) {
        doFor();
        doWhile();
        doDoWhile();
    }

    private static void doDoWhile() {
        int i = 1;
        int sum = 0;
        do{
            sum = sum + i;
            i++;
        } while (i<=10);
        System.out.println("1~10까지의 합 = " + sum);
        System.out.println("========");
    }

    private static void doWhile() {
        int i = 1;
        int sum = 0;
        while (i<=10) {
            sum = sum + i;
            i++;
        }
        System.out.println("1~10까지의 합 = " + sum);
        System.out.println("========");
    }

    public static void doFor() {
        int sum = 0;
        int i = 1;
        for (; i<=10; ) {
            sum = sum + i;
            i++;
        }
            System.out.println("1~10까지의 합 = " + sum);
        System.out.println("========");
    }
}

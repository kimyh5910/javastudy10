package com.kh.day5;

public class Test3 {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;
        int sum3 = 1;
        int sum4 = 1;
        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
            sum += i;     // sum = sum + i;
            sum2 -= i;     // sum2 = sum - i;
            sum3 *= i;     // sum3 = sum * i;
            sum4 /= i;     // sum4 = sum / i;
        }
        System.out.println("sum = " + sum );
        System.out.println("sum2 = " + sum2 );
        System.out.println("sum3 = " + sum3 );
        System.out.println("sum4 = " + sum4 );
    }
}

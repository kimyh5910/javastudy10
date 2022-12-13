package com.kh.day4;

public class Test1 {
    public static void main(String[] args) {
        int x = 10; // 지역변수(x)

        for (int i=0; i<3; i++) {      // 지역변수(i)
            int y = 5;  // 지역변수(y)
            System.out.println("i = " + i);
            System.out.println("x = " + 10);
        }

    }
}

package com.kh.day2;

public class Test2 {
    public static void main(String[] args) {
        int value1 = 10;

        // 값
        if (true) {     // if 안에 식 = 표현식
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }

        // value1 이 2의 배수인지 체크
        // 식
        if (value1 % 2 == 0) {      // if 안에 식 = 표현식
            System.out.println(value1 + " 는 짝수다"); // +는 문자열연산자 (value1은 정수 ""는 문자)
        } else {
            System.out.println(value1 + " 는 홀수다");
        }

        System.out.println();

        // 메소드 호출
        if (isTwice(value1)) {      // if 안에 식 = 표현식
            System.out.println(value1 + " 는 짝수다"); 
        } else {
            System.out.println(value1 + " 는 홀수다");
        }

        boolean flag = isTwice(value1);
        if (flag) {
            System.out.println(value1 + " 는 짝수다");
        } else {
            System.out.println(value1 + " 는 홀수다");
        }
    }

    // 짝수인지 판단하는 메소드
    public static boolean isTwice(int value) {
        boolean flag = false;
        if (value % 2 == 0) {
            flag = true;
        }
        return flag;
    }
}

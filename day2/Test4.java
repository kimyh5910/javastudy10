package com.kh.day2;
/*
학점구하기
*/
public class Test4 {
    public static void main(String[] args) {
        int score = 95;

//        int result =  score / 10;       // 연산시 큰 범위 값으로 표현
//        System.out.println(score * 1.0 / 10);    
//        System.out.println((double)score / 10);
//        System.out.println(score / (double)10);

//            switch(result) {          // 식
//            switch(share(score)) {          // 식
//            switch(score / 10) {    // 값
            int result2 = share2(score);
            switch (result2) {
            case 9 :
                System.out.println("A학점");
                break;
            case 8 :
                System.out.println("B학점");
                break;
            case 7 :
                System.out.println("C학점");
                break;
            case 6 :
                System.out.println("D학점");
                break;
            default :
                System.out.println("F학점");
                break;
        }
    }

    public static int share(int value) {
        int result = 0;
        result = value / 10;
        return result;
    }

    public static int share2(int value) {
        return  value / 10;
    }
}

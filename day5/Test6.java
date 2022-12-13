package com.kh.day5;
//삼항조건연산자
public class Test6 {
    public static void main(String[] args) {
        String result = ( 5> 3 ) ? "크다" : "크지않다";

        int x = 10;
        String result2= ( x > 3 ) ? "크다" : (( x == 3) ? "같다" : "작다");
    }
}

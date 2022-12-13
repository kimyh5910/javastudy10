package com.kh.day1;

/*
 소스파일 : com.kh.day1.Hello.java
 by KinYoungHun
 자바프로그램의 기본 구조
 */
public class Hello {

    // main() 메소드에서 실행 시작
    public static void main(String[] args) {    // void는 반환타입 main이 이름 ()안이 매개변수
        int i = 20; // 정수형 변수 i 에 20을 저장
        int s;      // 정수형 변수 s 선언
        char a;     // 문자형 변수 a 선언
                    // 실행문 끝은 세미콜론으로 끝난다
        //s = i + 10; // 산술연산자 : +,-,*(곱하기),/(나누기),%(나머지)
        s = sum(i, 10); // sum메소드 호출(sum메소드와 동일한 형태로)
        a = '?';
        System.out.println(a);              // 문자 '?' 화면 출력
        System.out.println("com.kh.day1.Hello");        // "com.kh.day1.Hello" 문자열 화면 출력
        System.out.println(s);              // 정수 s값 화면 출력
    }
    
    public static int sum(int n, int m) {
        // return : 1.메소드 종료 2. 표현식의 결과값 반환
        return n + m;
    }
}

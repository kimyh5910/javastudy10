package com.kh.day9.b;

import com.kh.day9.a.Calculator;

/*
  실행클래스 : main() 메소드가 있는 클래스
 */
public class Main {
  public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.method1();
    cal.method2();
    cal.method3();

    Calculator.method4();
    Math.random();

    System.out.println("hello");
    Calculator.filed4.method1("hello");
  }
}

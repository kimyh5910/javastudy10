package com.kh.day11.b;

public class HighStudent extends Student{
  public HighStudent() {
    super();    //  Student 클래스의 객체생성
    System.out.println("public HighStudent() called");
  }
  public void method1() {
    System.out.println("method1() of HighStudent called");
    super.method1();  // 상위 클래스(Student) 메소드 호출
  }
}

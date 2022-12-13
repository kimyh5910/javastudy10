package com.kh.day11.b;

public class Student extends Person{
  public Student() {
    super();    //  Person 클래스의 객체생성
    System.out.println("public Student() called");
  }
  public void method1() {
    System.out.println("method1() of Student called");
  }
}

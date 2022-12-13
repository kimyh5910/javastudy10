package com.kh.day15.b;

public class B extends Object implements com.kh.day15.b.A {
  @Override
  public void abc() {
    com.kh.day15.b.A.super.abc();
    System.out.println("B 클래스의 abc()");
  }
}

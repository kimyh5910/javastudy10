package Createdobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;

import java.lang.*;

public class A extends  Object {
    // 필드
    int m = 3;

    // 기본 생성자 메소드
    public A() { }

    // 메소드
    void print() {
      System.out.println("객체 생성 및 활용");
    }

  // 재정의
  @Override
  public String toString() {
    return "test";
  }
}


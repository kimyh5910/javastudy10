package com.kh.day13.a;
// p.305
public class A {
  static int a;

  // 정적 초기화 블럭
  // 멤버 정적 필드 초기화하는 용도 : 복잡한 수식을 필요로할때
  static {
//    int x = 10;
//    int y = 10;
//    a = x + y;
    a = 8;
  }
}

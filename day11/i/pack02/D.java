package com.kh.day11.i.pack02;
import com.kh.day11.i.pack01.A;
public class D extends A{
  void def() {
    System.out.println(this.a);
    System.out.println(this.b);     // 상속받음
//    System.out.println(this.c);   // 다른패키지
//    System.out.println(this.d);   // 다른 클래스
  }

}

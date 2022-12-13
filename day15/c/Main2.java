package com.kh.day15.c;

public class Main2 {
  public static void main(String[] args) throws Exception {
    method1();
    method2(2);
  }

  // 일반예외 : Checked Exception
  // 반드시 예외 처리해줘야한다.
  // 1. 메소드 내부에서 2. 호출한 메소드에 위임
  public static void method1()  {
    //    Thread.sleep(1000);    // 밀리세컨즈 : 1000 -> 1초
    try {
      for (int i = 0; i < 10; i++) {
        Thread.sleep(500);
        System.out.println("i = " + i);
      }
    } catch (InterruptedException e) {

    }
  }
    public static void method2 (int param) throws Exception {

      if (param == 1) {
        throw new IllegalArgumentException("파라미터 오류");    // unchecked exception
      }
      if (param == 2) {
      throw new Exception("파라미터 오류");                     // checked exception
      }
      System.out.println("param = " + param);
    }
  }


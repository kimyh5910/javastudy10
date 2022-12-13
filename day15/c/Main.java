package com.kh.day15.c;

public class Main {
  public static void main(String[] args) {
//     ArrayIndexOutOfBoundsException
    int[] a = new int [3];
//    a[0] = 10;
//    a[3] = 20;

    // NullPointException
    a = null;
//    a[0] = 10;



    // ArithmeticException
    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {   // Exception = 예외처리
      e.printStackTrace();
//      System.out.println(e.getMessage());   // by zero
//      System.out.println(e.getCause());     // null
//      ArrayIndexOutOfBoundsException e2 = new ArrayIndexOutOfBoundsException("나누기 오류");
//      System.out.println(e2.getMessage());
      return;
    } finally {     // return이 있어도 무조건 finally 는 실행한다
      System.out.println("finnaly 절 실행됨!");
    }

    System.out.println("프로그램종료!");
  }
}

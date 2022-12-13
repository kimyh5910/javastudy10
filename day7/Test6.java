package com.kh.day7;

public class Test6 {
  public static void main(String[] args) {
    String name = "홍길동";
    System.out.println(name);
    System.out.println(name.toString());
    System.out.println(System.identityHashCode(name));

    String name2 = "홍길동";
    System.out.println(System.identityHashCode(name2));

    String name3 = new String("홍길동");
    System.out.println(System.identityHashCode(name3));

    String name4 = new String("홍길동");
    System.out.println(System.identityHashCode(name4));
  }
}

package com.kh.day11.e;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    A a = new A();

    int m = 5;
    int[] n = {1, 2, 3};
    String b = "a";
    m = a.abc(m);
    a.bcd(n);
    b = a.cde(b);

    System.out.println(m);
    System.out.println(Arrays.toString(n));
    System.out.println(b);
  }
}

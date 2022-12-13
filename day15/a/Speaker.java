package com.kh.day15.a;

public class Speaker  implements Soundable,SmartPower {
  @Override
  public void sound() {
    System.out.println("스피커소리");
  }

  @Override
  public void on() {
    System.out.println("전원을 켜다");
  }

  @Override
  public void off() {
    System.out.println("전원을 끄다");
  }

  @Override
  public void smartOn() {
    System.out.println("스마트 전원 켜다");
  }

}
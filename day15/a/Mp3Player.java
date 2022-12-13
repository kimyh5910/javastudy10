package com.kh.day15.a;

public class Mp3Player extends Radio implements Chargable{
  public void playMp3() {
    System.out.println("mp3를 플래이하다");
  }
  @Override
  public void charge() {
    System.out.println("충전하다");
  }
}
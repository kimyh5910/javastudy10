package com.kh.day9.g;

public class Car {
  // 속성정의 2
  private String color;
  private int speed;

  // 객체생성방법 4  alt + insert

  public Car(String color) {
    this.color = color;
  }

  // 행위정의 1
  public void speedUp(int speed) {
    System.out.println("속도를 올리다");
    this.speed = speed;
  }

  public void speedDown(int speed) {
    System.out.println("속도를 내리다");
    this.speed = speed;
  }

  // 속성의 접근(getter,setter) 3 alt + insert

  public void setColor(String color) {
    this.color = color;
  }

  public int getSpeed() {
    return speed;
  }

  // 객체의 상태 5 alt + insert (to(String))


  @Override
  public String toString() {
    return "Car{" +
        "color='" + color + '\'' +
        ", speed=" + speed +
        '}';
  }
}

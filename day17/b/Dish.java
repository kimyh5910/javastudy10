package com.kh.day17.b;

public class Dish {
  private final String color;

  public Dish(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Dish{" +
        "color='" + color + '\'' +
        '}';
  }
}

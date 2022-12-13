package com.kh.day13.d;

public class Person {
  private String name;
  private int age;
  private Phone phone;

  public Phone getPhone() {
    return phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  public void call(Phone[] phones) {
    for (int i = 0; i < phones.length; i++) {
      phones[i].speak();
    }
  }
}

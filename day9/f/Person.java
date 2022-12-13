package com.kh.day9.f;


// alt + insert : getter setter 생성

import java.lang.*;

public class Person extends Object {
  private String name;
  private int age;

  public Person() {
    super();     // 부모클래스의 디폴트 생성자 메소드 호출
  }

  public void smile() {
    System.out.println("웃다");
  }

  public void sleep() {
    System.out.println("자다");
  }

  // 속성 수정(name,age)

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Person(int age) {
    this.age = age;
  }

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}

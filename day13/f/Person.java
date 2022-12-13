package com.kh.day13.f;

import java.util.Objects;

public class Person {
  String name;
  int age;

  @Override     // --> alt + insert  이름,나이 같다
  public boolean equals(Object o) {

    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

}


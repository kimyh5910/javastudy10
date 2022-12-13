package com.kh.day13.d;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();

    Phone samsungPhone = new SamsungPhone();
    Phone lgPhone = new LGPhone();
    Phone iPhone = new IPhone();

    person.setPhone(samsungPhone);
    person.getPhone().speak();

    person.setPhone(lgPhone);
    person.getPhone().speak();

    person.setPhone(iPhone);
    person.getPhone().speak();



  }
}

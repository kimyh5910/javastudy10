package com.kh.day13.d;

public class Main2 {
  public static void main(String[] args) {
    Person person = new Person ();

//    Phone phone1 = new SamsungPhone();
//    Phone phone2 = new LGPhone();
//    Phone phone3 = new IPhone();

    Phone[] phones = new Phone[3];
    phones[0] = new SamsungPhone();
    phones[1] = new LGPhone();
    phones[2] = new IPhone();

    person.call(phones);

  }
}

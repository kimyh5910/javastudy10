package com.kh.day13.e;

public class Main {
  public static void main(String[] args) {
    Student student = new Student();
//    student.name = "홍길동";
    System.out.println(student.name);
    student.eat();

    System.out.println(((Person)student).name);
    ((Person)student).eat();


    System.out.println(((Person)student).name);
    ((Person)student).eat();

    High high = new High();
    System.out.println(high.name);
    high.eat();

    System.out.println(student.age);
    System.out.println(Person.age);
    System.out.println(High.age);

    System.out.println(student.age);
    System.out.println(((Person)student).age);
  }
}

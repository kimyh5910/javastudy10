package com.kh.day13.c;

public class Main4 {
  public static void main(String[] args) {
    Student student = (Student) (new HighStudent());
    student.study();
    student.eat();

    Person person = (Person) (new Teacher());
    person.eat();



  }
}

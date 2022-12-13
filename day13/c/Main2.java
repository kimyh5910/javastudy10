package com.kh.day13.c;

public class Main2 {
  public static void main(String[] args) {
    Student s1 = new Student();
    Teacher t1 = new Teacher();
    HighStudent hs1 = new HighStudent();

    doEat(s1);
    doEat(t1);
    doEat(hs1);

    // 셋다 Person만 할수있는 행위인 eat만 가능
    Person obj1 = s1;
    Person obj2 = t1;
    Person obj3 = hs1;
    obj1.eat();
    obj2.eat();
    obj3.eat();

    byte x = 10;
    short y = 20;
    int z = 30;

    callMethod(x);
    callMethod(y);
    callMethod(z);
  }

  static void doEat(Person obj) {   // s1,t1,hs1이 다 가능한 Person(상위클래스)이 매개변수로 옴
    obj.eat();    // Person 관점에서 가능한 행위만 가능
  }

  static void callMethod(int val) {   // int 이상만 오면 된다
    System.out.println(val);
  }

}

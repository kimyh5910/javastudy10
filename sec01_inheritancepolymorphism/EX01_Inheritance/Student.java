package sec01_inheritancepolymorphism.EX01_Inheritance;

public class Student extends Human{   // Human 클래스 상속
  int studentID;

  @Override
  void eat() {
    // 추가
//    super.eat();
//      System.out.println("설겆이하다");
    // 전체 수정
//    System.out.println("설적이하다");
    // 일부 수정
    System.out.println("맛잇게 먹다");

  }

  void goToSchool() {}
}

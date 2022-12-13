package sec01_inheritancepolymorphism.EX01_Inheritance;

public class Worker extends Human {   // Human 클래스 상속
  int workerID;

  @Override
  void eat() {
    System.out.println("급하게 먹다");
  }

  void goToWork() {}
}

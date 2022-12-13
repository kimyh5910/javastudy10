package sec01_inheritancepolymorphism.EX01_Inheritance;

public class Inheritance {
  public static void main(String[] args) {
    // Human 객체 생성
    Human h = new Human();
    h.name = "김현지";
    h.age = 27;
    h.eat();
    h.sleep();

    // Student 객체 생성
    Student s = new Student();
    s.name = "김민성";
    s.age = 16;
    s.studentID = 128;
    s.eat();
    System.out.println("-----------");
    Human h2 = (Human)s;    // 형변환 시킴(Human에서 Student로),형변환 시켜도 Human이 할수 있는 행위는 먹고 자는거만 가능해서 형변환해도 똑같이 먹고 자는것만 가능
    h2.eat();


    System.out.println("-----------");
    s.sleep();
    s.goToSchool();

    Worker w = new Worker();
    w.name = "봉윤정";
    w.age = 45;
    w.workerID = 128;
    w.eat();
    w.sleep();
    w.goToWork();
  }
}

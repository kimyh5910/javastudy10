package day12.a;

public class Person {
  private String name;
  private int age;


  public Person(int age) {
    super();
    this.age = age;
  }

  public Person(String name) {
    this(1);
    this.name = name;
  }


  public void smile() {
    System.out.println("웃다");
  }

  public void sleep() {
    System.out.println("자다");
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}

package Createdobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;

public class CreateObjectAndUsageOfMembers {
  public static void main(String[] args) {
    A a = new A();

    a.m = 5;
    System.out.println(a.m);

    a.print();

    System.out.println(a);
  }
}

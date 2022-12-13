package com.kh.day17.ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2);   // Arrays.asList : 원소를 추가하는 메서드는 가지고 있지 않기 때문에 사이즈를 바꿀 수 없다.
//    list.add(3);  // 요소의 길이 추가 불가;
//    list.remove(1);   // 요소길이 축소 불가

    // 탐색
    Integer integer = list.get(1);
    System.out.println(integer);


    // 요소 수정
    list.set(1,4);    // 변경은 가능
    System.out.println(list);



  }
}

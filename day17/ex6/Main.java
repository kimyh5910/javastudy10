package com.kh.day17.ex6;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Map<String, Boolean> map = new LinkedHashMap<>();
    map.put("사운드", true);
    map.put("그래픽", false);
    map.put("배경음", true);
    map.put("그래픽", true);

    System.out.println(map);
  }
}

package com.kh.dic2;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMain {
  public static void main(String[] args) {
    Dictionary2 dic = new Dictionary2();
    Scanner sc = new Scanner(System.in);

    boolean stop = false;
    while (!stop) {
      try {
        System.out.println("1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료");
        System.out.println("선택 >> ");
        String menu = sc.nextLine();

        String word = null;   // 단어
        String meaning = null; // 의미
        switch (menu) {
          case "1":   // 저장
            System.out.println("단어입력 : ");
            word = sc.nextLine();
            System.out.println("의미입력 : ");
            meaning = sc.nextLine();
            dic.put(word,meaning);
            break;
          case "2":     // 검색
            System.out.println("단어입력 : ");
            word = sc.nextLine();
            Map<String, String> result = dic.findByWord(word);
            printList(result);
            break;
          case "3":     // 수정
            System.out.println("단어입력 : ");
            word = sc.nextLine();
            System.out.println("의미입력 : ");
            meaning = sc.nextLine();
            dic.update(word,meaning);
            break;
          case "4":     // 삭제
            System.out.println("단어입력 : ");
            word = sc.nextLine();
            dic.delete(word);
            break;
          case "5":     // 목록
            System.out.println("1.오름차순 2.내림차순");
            System.out.println("선택 >> ");
            String subMenu = sc.nextLine();
            switch (subMenu) {
              case "1" :  // 오름차순
                Map<String,String> ascending = dic.list(1);
                printList(ascending);
                break;
              case "2" :  // 내림차순
                Map<String,String> descending = dic.list(2);
                printList(descending);
                break;
            }
            break;
          case "6":     // 색인
            System.out.println("색인 입력 : ");
            char ch = sc.nextLine().charAt(0);
            List<String> list = dic.index(ch);
            System.out.println(list);
            break;
          case "7":     // 통계
            List<Object> statistics = dic.statistics();
            //1. 단어 갯수
            int cnt =(Integer)statistics.get(0);
            System.out.println("단어갯수 : " + cnt);

            //2. 문자열길이가 가장 긴 단어
            List wordsOfMaxLength =(List)statistics.get(1);
            for (Object ele : wordsOfMaxLength) {
              String maxWord = (String)ele;
              System.out.printf("%s\n", maxWord);
            }

            //3. 문자열길이 내림차순
            List wordsByDescending =(List)statistics.get(2);
            for (Object ele : wordsByDescending) {
              String wordByDescending = (String)ele;
              System.out.printf("%s\n", wordByDescending);
            }
            break;
          case "8":
            stop = true;
            continue;
          default:
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    System.out.println("프로그램 종료!");


  }

  private static void printList(Map<String, String> result) {
    for(Map.Entry<String,String> entry : result.entrySet()) {
      System.out.printf("%s : %s", entry.getKey(), entry.getValue());
    }
  }
}












//    Map<String,String> map = null;

//    try {
//      dic.put("student1", "학생");
//      dic.put("student2", "학생");
//      dic.put("student3", "학생");
//      dic.put("student3", "학생");
//      dic.put("student5", "학생");
//
//      System.out.println(dic);
//      dic.put("student6", "학생");
//      System.out.println(dic.getData().size());
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }

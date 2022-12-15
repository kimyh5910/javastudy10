package com.kh.dic;

import java.util.*;

public class Dictionary implements DictionaryException {

  Map<String,String> wordbook = new HashMap<>();



  // 메뉴
  @Override
  public void menu() {
    System.out.println("등록된 단어 수 : " + wordbook.size());
    System.out.println("메뉴선택");
    System.out.println("1.저장");
    System.out.println("2.검색");
    System.out.println("3.수정");
    System.out.println("4.삭제");
    System.out.println("5.목록");
    System.out.println("6.색인");
    System.out.println("7.통계");
    System.out.println("8.종료");
    System.out.println("-----------------------------------");
  }

  // 저장
  @Override
  public void addword() {

    String eng = null;
    String kor = null;
    while (true) {
      Scanner scr = new Scanner(System.in);
      if (wordbook.size() == 5) {
        System.out.println("최대 5개단어만 저장할 수 있습니다");
        break;
      }
      System.out.println("등록할 영어단어를 입력하세요.");
      eng = scr.nextLine();
      if (eng.equals("menu")) {
        break;
      } else {
        if (wordbook.containsKey(eng) == true) {
          System.out.println("이미 등록된 단어입니다. 수정을 원하시면 삭제 후 다시 등록해주세요.");
        } else {
          System.out.println("뜻을 입력하세요 : ");
          kor = scr.nextLine();

          try {
            wordbook.put(eng, kor);
          } catch (Exception e) {
            System.out.println("다시 입력해주세요");
          }
        }
      }
      break;
    }
  }

  // 검색
  @Override
  public void wordsearch() {
    while (true) {
      Scanner scr = new Scanner(System.in);
      System.out.println("조회하고싶은 영단어를 입력하세요(menu로 가려면 menu입력) : ");
      String eng = scr.nextLine();
      if (eng.equals("menu")) {
        break;
      } else {
        if (wordbook.containsKey(eng) == true) {
          System.out.println("단어 뜻 : " +wordbook.get(eng));
        } else {
          System.out.println("등록되지 않은 단어입니다.");
        }
      }
      break;
    }
  }


  // 수정
  @Override
  public void rename() {
    while (true) {
      Scanner sc = new Scanner(System.in);
      System.out.println("----단어 목록----");
      Set key = wordbook.keySet();
      Iterator iterator;

      for (iterator = key.iterator(); iterator.hasNext();) {
        String keyValue = (String) iterator.next();
        String valueVar = (String) wordbook.get(keyValue);

        System.out.println( keyValue + " : " + valueVar);

      }
      System.out.println("===================");
      System.out.println("수정하고 싶은 단어를 입력하세요");
      String eng = sc.nextLine();
      if (wordbook.containsKey(eng) == true){
        System.out.println("수정하고 싶은 뜻");
        String kor = sc.nextLine();
        wordbook.replace(eng,kor);
        System.out.println("수정후 단어");
        System.out.println(wordbook.get(eng));
        System.out.println("수정했습니다");
      }

      else {
        System.out.println("존재하지 않는 단어입니다.");
      }
      break;
    }
  }



  // 삭제
  @Override
  public void deleteword() {
    while (true) {
      Scanner sc = new Scanner(System.in);
      System.out.println("----단어 목록----");
      Set key = wordbook.keySet();
      Iterator iterator;

      for (iterator = key.iterator(); iterator.hasNext();) {
        String keyValue = (String) iterator.next();
        String valueVar = (String) wordbook.get(keyValue);

        System.out.println( keyValue + " : " + valueVar);

      }
      System.out.println("===================");
      System.out.println("삭제하고 싶은 단어를 입력하세요");
      String del = sc.nextLine();
      if (wordbook.containsKey(del) == true) {
        System.out.println("입력한 단어 (" + del + " : " + wordbook.remove(del) + ")가 삭제되었습니다.");
      } else {
        System.out.println("존재하지 않는 단어입니다.");
      }
      break;
    }
  }

  @Override
  public void wordlist() {
    System.out.println("----오름차순 정리----");
      Comparator<String> comparator = (s1,s2) -> s1.compareTo(s2);
      Map<String, String> map = new TreeMap<>(comparator);
      map.put("sutdent","학생");
      map.put("teacher","선생님");
      map.put("classroom","교실");
      map.put("smart","똑똑한");
      map.put("lunch","점심");

    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println("단어 : " + entry.getKey() + " , " + "뜻 : " + entry.getValue());
    }
    }

  @Override
  public void statistics() {

  }


  // 종료
  @Override
  public void exit() {
    System.out.println("단어장을 종료합니다.");

  }

  @Override
  public void common() {
}
}
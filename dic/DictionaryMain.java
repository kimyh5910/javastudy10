package com.kh.dic;

import java.util.Scanner;

public class DictionaryMain {
  public static void main(String[] args) {

    Dictionary dictionary = new Dictionary();

    while (true) {
      dictionary.menu();


  Scanner scan = new Scanner(System.in);
  String select = scan.nextLine();

    if (select.equals("1")) {   // 단어 저장
      dictionary.addword();
  } else if (select.equals("2")) {    // 단어 검색
      dictionary.wordsearch();
  } else if (select.equals("3")) {    // 단어 수정
      dictionary.rename();
  } else if (select.equals("4")) {    // 단어 삭제
      dictionary.deleteword();
  } else if (select.equals("5")) {    // 목록
      dictionary.wordlist();
    }else if (select.equals("7")) {   // 통계
      dictionary.statistics();
  } else if (select.equals("8")) {
      dictionary.exit();
    break;
  } else

  {
    System.out.println("1~6까지의 숫자만 입력하세요.");
     }
    }
  }


}
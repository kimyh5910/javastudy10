package com.kh.dic;

public interface DictionaryException {
  public void menu();           // 메뉴선택
  public void addword();        // 단어 저장
  public void wordsearch();     // 단어 검색
  public void rename();         // 단어 수정
  public  void deleteword();    // 단어 삭제
  public  void wordlist();      // 목록
  // 색인
  public void statistics();     // 통계
  public  void exit();          // 종료
  public void common();         // 공통
}

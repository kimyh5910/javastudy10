package com.kh.dic2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test {
  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();
    treeSet.add("student");
    treeSet.add("teacher");
    treeSet.add("classroom");
    treeSet.add("smart");
    treeSet.add("lunch");

    System.out.println(treeSet);

    String inputWord = "st";   // classroom

    System.out.println(inputWord.charAt(0));
    System.out.println(inputWord.charAt(1));
    System.out.println(inputWord.charAt(inputWord.length()-1));

    // 마지막 문자
    char lastChar = inputWord.charAt(inputWord.length()-1);
    char nextCharOfLastChar = (char)(lastChar + 1);
    System.out.printf("%c %c\n", lastChar, nextCharOfLastChar);

    String preWord = inputWord.substring(0,inputWord.length()-1);
    System.out.println(preWord);

    String forWord = preWord + lastChar;
    String endWord = preWord + nextCharOfLastChar;
    System.out.printf("%s %s\n",forWord,endWord);

    NavigableSet subSet = treeSet.subSet(forWord, false, endWord, false);
    System.out.println(subSet);

  }
}

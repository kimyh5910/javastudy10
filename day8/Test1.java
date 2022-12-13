package com.kh.day8;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    final int ROW = 6;  // 행
    final int COM = 10;  // 열
    String[][] seats = new String[ROW][COM];

    int cnt = 1;
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
//        seats[i][j] = 1 + "";   // "1"
        seats[i][j] = String.valueOf(cnt++);   // "1"
      }
    }

    System.out.println(">> 영화관 좌석 예매 <<");
    // 배열요소 출력
    boolean stop = false;
    while (!stop) {
      for (int i = 0; i < seats.length; i++) {
        for (int j = 0; j < seats[i].length; j++) {
          System.out.printf("%3s",seats[i][j]);
        }
        System.out.println();
      }
      System.out.print("영화관 좌석을 선택하세요 (1~60, 0 : 종료) >> ");
      Scanner scanner = new Scanner(System.in);
      String seat = scanner.nextLine();   // "59"
      int seatNumber = Integer.parseInt(seat);  // 59    문자화 시킴

      if (seatNumber == 0) {
        stop = true;
        continue;
      }

      int row = (seatNumber-1) / 10;    // 5
      int col = (seatNumber-1) % 10;  // 8


      if (seats[row][col].equals("X")) {
        System.out.printf("%d 좌석은 이미 예매되었습니다.\n",seatNumber);
        continue;
      } else {
        seats[row][col] = "X";
      }
    }
  }
}

package com.kh.day5;

/*
    로또 생성 프로그램을 작성하시오
    (1~45) 중 6개의 중복되지 않는 번호 추출
 */
public class Test18 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
        boolean flag = true;
        int number = 0;

        while(!flag) {
            number = (int)(Math.random()*46)+1;
            for (int j = 0; j <=i; j++) {
                if (lotto[j] == number) {
                    flag = true;
                    break;
                }
            }
        }
        lotto[i] = number;
    }

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + ",");
        }
    }
}

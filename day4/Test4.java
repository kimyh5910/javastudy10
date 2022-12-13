package com.kh.day4;

public class Test4 {
    public static void main(String[] args) {

        useFlag();
        // 중첩된 반복문 탈출하는 방법

        // 1. label 사용
        outer : for (int i=1; i<=3; i++) {
            inner : for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break inner;  // 가장 가까운 반복문 1곳을 탈출!
                }
                System.out.println("j = " + j);
            }
            System.out.println("inner for문");
        }
        System.out.println("outer for문");
    }

    // 2. flag 사용 <-- 권장
    public void useLabel() {
        outer : for (int i=1; i<=3; i++) {
            inner : for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break inner;  // 가장 가까운 반복문 1곳을 탈출!
                }
                System.out.println("j = " + j);
            }
            System.out.println("inner for문");
        }
        System.out.println("outer for문");
    }


    public static void useFlag() {
        boolean flagInner = true;
        boolean flagOuter = false;

        for (int i=1; i<=3; i++) {

            for (int j = 1; j <= 3 && flagInner; j++) {
                if (j == 2) {
                    flagInner = false;
                    flagOuter = false;
                    continue;
                }
                System.out.println("j = " + j);
            }
            if (!flagOuter) {
                continue;
            }
            System.out.println("inner for문");
        }
        System.out.println("outer for문");
    }

}

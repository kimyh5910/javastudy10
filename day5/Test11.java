package com.kh.day5;

public class Test11 {
    public static void main(String[] args) {
        int x = 10;

        double y = x + 3.14;
        System.out.println(("y = " + y));

        float z =(float)(x + 3.14);     // 작은 타입에 영향을 끼치지않고 형변환할때 강제로 변환시킨다
        System.out.println(("z = " + z));
    }
}

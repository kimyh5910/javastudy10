package sec01_datatype.Ex03_RangeOfVariableUse;

public class RangeOfVariableUse {
    public static void main(String[] args) {
        int value1 = 3;         // 지역변수  지역변수의 생명주기 : 변수가 선언된 블럭내에서 유효하다. 변수 value1이 생성되는 시점
//        int vlaue1;  같은 블럭의 동일한 이름으로 변수선언이 안된다.
        {
            int value2 = 5;     // 변수 value2이 생성되는 시점
            System.out.println(value1); // 상위블럭에 선언된 변수는 하위블럭에서 접근 가능
            System.out.println(value2);
        }                       // 변수 value2이 사라지는 시점

        System.out.println(value1);
        method2('*',1);
        method2('*',2);
        method2('*',3);
        method2('*',4);
        method2('*',5);
//        System.out.println(value2); 하위블럭에 선언된 변수에 상위블럭에서 접근 불가.
    }       // 변수 value1이 사라지는 시점

    public static void method1() {
        int value1 = 10;
        System.out.println(value1);
    }

    public static void method2(char c, int cnt) {
//        System.out.println(c);
//        System.out.println(cnt);

        for (int i = 1; i <= cnt; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}

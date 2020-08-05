package hw.d06;

import java.util.Arrays;

/**
 * MyMath 클래스 구현하기
 * 인스턴스를 생성할 수 없는 MyMath 클래스를 구현하시오.
 *
 * MyMath 클래스는 다음 정적 변수를 가진다.
 * PI = 3.1415927;
 * E = 2.718281;
 *
 * MyMath 클래스는 다음 정적 메소드를 가진다.
 * min - 정수 또는 실수를 여러개 입력받아 최소값을 구한다.
 * max - 정수 또는 실수를 여러개 입력받아 최대값을 구한다.
 * abs - 정수 또는 실수를 입력받아 절대값을 구한다.
 * floor - 실수를 입력받아 내림 연산한 정수를 출력한다.
 * ceil - 실수를 입력받아 올림 연산한 정수를 출력한다.
 */
public class MyMath {
    public static void main(String[] args) {
//        int[] a = {2, 3, -4, 6};
//        Arrays.sort(a);
//
//        int[] b = {7, 0, 6, 16, -4};
//        Arrays.sort(b);


        MyMath1 MyMath  = new MyMath1();
        MyMath.PI = 3.1415927f;
        MyMath.E = 2.718281f;
        MyMath.min = Math.min(-4, 6);
        MyMath.max = Math.max(-4, 16);
        MyMath.abc1 = Math.abs(5);
        MyMath.abc2 = Math.abs(-2.3);
        MyMath.floor = Math.floor(1.5232);
        MyMath.ceil = Math.ceil(4.6452);

        System.out.println(MyMath.PI);
        System.out.println(MyMath.E);
        System.out.println(MyMath.min);
        System.out.println(MyMath.max);
        System.out.println(MyMath.abc1);
        System.out.println(MyMath.abc2);
        System.out.println(MyMath.floor);
        System.out.println(MyMath.ceil);
    }
}

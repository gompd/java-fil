package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    /**
     * MyMath 클래스 구현하기
     * 인스턴스를 생성할 수 없는 MyMath 클래스를 구현하시오.
     * <p>
     * MyMath 클래스는 다음 정적 변수를 가진다.
     * PI = 3.1415927;
     * E = 2.718281;
     * <p>
     * MyMath 클래스는 다음 정적 메소드를 가진다.
     * min - 정수 또는 실수를 여러개 입력받아 최소값을 구한다.
     * max - 정수 또는 실수를 여러개 입력받아 최대값을 구한다.
     * abs - 정수 또는 실수를 입력받아 절대값을 구한다.
     * floor - 실수를 입력받아 내림 연산한 정수를 출력한다.
     * ceil - 실수를 입력받아 올림 연산한 정수를 출력한다.
     */

    int[] arr = {1, 3, 6, 4, 12, 4, 5};
    Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        int a = Math.max(arr[3], arr[1]);
        System.out.println(a);



 }
}
package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
        /**
         * 도메인 뒤집기
         *
         * 주어진 홈페이지 주소를 .을 기준으로 각각 뒤집어 출력하시오.
         *
         * ex) www.google.com -> www.elgoog.moc
         *
         * 인자
         * string: 홈페이지 주소
         */

        String string = "www.google.com";

        String[] str = string.split("\\.");
        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.print(".");



        }
    }
}




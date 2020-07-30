package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int one = x > y ? x : z;
        int two = x < z ? y : z;

//       System.out.println(one);
//       System.out.println(two);
        
         System.out.println(one > two? one : two);

    }
}

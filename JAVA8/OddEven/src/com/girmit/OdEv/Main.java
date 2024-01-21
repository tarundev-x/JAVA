/*1. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd
and even numbers in a list.*/
package com.girmit.OdEv;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

         int oddsum = 0;
        int evensum = 0;


        int Evensum = lst.stream().filter(e -> e % 2 == 0).mapToInt(e -> e * e).sum();
        int Oddsum = lst.stream().filter(e -> e % 2 != 0).mapToInt(e -> e * e).sum();
        System.out.println("Square of ODD = "+Oddsum);
        System.out.println("Square of EVEN = "+Evensum);

    }
}
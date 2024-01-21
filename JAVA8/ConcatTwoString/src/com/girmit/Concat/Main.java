/*3. Write a Java program to implement a lambda expression to concatenate two strings.*/

package com.girmit.Concat;
public class Main {
    public static void main(String[] args) {

        String s1="Tarun";
        String s2="Dev";


        Concat c=(x,y)->(s1+" "+s2);
        System.out.println("Concated string = "+c.concat(s1,s2));


    }
}
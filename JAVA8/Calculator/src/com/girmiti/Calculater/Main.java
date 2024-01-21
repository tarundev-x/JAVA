/*4. implement the calculator with com.girmiti.Calculater.Addition, Subtraction, Multiplication, Division and Modules.
(use switch case to choose operations like com.girmiti.Calculater.Addition, Subtraction, Multiplicaton etc,
and use Scanner class to take input.)*/
package com.girmiti.Calculater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number ");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println("Enter the operation (+ . - ,* ,/");
        char c=sc.next().charAt(0);
        
        switch (c)
        {
            case '+':
                Addition addition = (x,y)->a+b;
                System.out.println("Sum of a,b = "+addition.add(a,b));
                break;
            case '-':
                Substraction substraction =(x, y)->{
                    if(x>y) return (a-b);
                    else {
                        return b-a;
                    }
                };
                System.out.println("Substraction of a,b = "+substraction.substract(a,b));
                break;
            case '/':
                Division division=(x,y)->(a/b);
                System.out.println("Division of a,b = "+division.divide(a,b));
                break;
            case '*':
                Multiplication multiplication=(x,y)->a*b;
                System.out.println("Multiplication of a,b = "+multiplication.multiply(a,b));

                break;
            default:
                System.out.println("Invalid parameter");
                return ;
        }
    }
}
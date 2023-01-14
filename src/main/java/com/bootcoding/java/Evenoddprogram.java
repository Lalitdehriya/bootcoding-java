package com.bootcoding.java;

import java.util.Scanner;

public class Evenoddprogram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");

        int n = sc.nextInt();
        int a=10;
        n= a + 3 + ++a;//23
        n= a + 3+ a++;//22

        //=assigment operator
        //n=44,42,33
        if(n% 2==0) {
            System.out.println(n + " is even number");
        }else{
            System.out.println(n+" is odd number");

        }

    }
}

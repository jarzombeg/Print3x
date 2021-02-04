package com.company;


/*
Implement the print method

*/

public class Main {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String s) {
        //write your code here
        int count = 0;
        while (count < 4) {
            System.out.println(s);
            count++;
        }
    }

}


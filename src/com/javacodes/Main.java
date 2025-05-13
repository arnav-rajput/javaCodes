package com.javacodes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Put in your employee id: ");
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        System.out.println("Your jail roll number is: " + empId);
    }
}
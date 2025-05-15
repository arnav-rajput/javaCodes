package com.javacodes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("For Celsius to Farhenheit, give Y or N for vice-versa: ");
        Scanner sc1 = new Scanner(System.in);
        String type = sc1.nextLine();
        System.out.println("Enter the temp: ");
        Scanner sc2 = new Scanner(System.in);
        int var = sc2.nextInt();
        if(type.equalsIgnoreCase("Y")) {
            int result1 = ((var*9)/5) + 32;
            System.out.println("Converted Temp: " + result1 + " F");
        } else if (type.equalsIgnoreCase("N")) {
            int result2 = ((var-32)*5)/9;
            System.out.println("Converted Temp: " + result2 + " C");
        }

    }
}

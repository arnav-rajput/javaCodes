package com.javacodes;

public class Typecasting {
    public static void main (String[] args) {
        // type-casting
        int decimalNumber = (int)(23.56f);
        System.out.println(decimalNumber);

        //automatic type promotion in expressions
        int a2 = 257;
        byte b2 = (byte)(a2);
        System.out.println(a2);
        System.out.println(b2);

        //another-example
        /* byte into byte will give int value, possible because type promotion is handled by java */
        byte a1 = 30;
        byte b1 = 40;
        byte c1 = 20;
        int d1 = (a1*b1) / c1;
        System.out.println(d1);

        //type-cast full blow
        int i = 23;
        float f = 23.23f;
        char c = 'c';
        byte b = 'd';
        short s = 23;
        double d = 234.345;
        long l = 2354325L;

        double result = (f*i) + (b/s) - (l*d);
        System.out.println(result);
    }
}

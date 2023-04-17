package org.example;

import java.math.BigDecimal;
import java.math.BigInteger;

class Chapter9 {
    public static void main(String[] args) {
        Conversion callingObject = new Conversion();
        callingObject.autoboxing();
        callingObject.autounboxing();
        callingObject.BigInteBigDec();
        callingObject.stringMethods();
        callingObject.StringBuilderBuffer();
    }
}

class Conversion {
    Conversion() {

    }

    //primitive to object
    public void autoboxing() {
        int i = 10;
        Integer obj1 = Integer.valueOf(i);
        System.out.println(obj1);
        int j = 20;
        Integer obj2 = Integer.valueOf(j);
        System.out.println(obj2);
        int k = 25;
        Integer obj3 = new Integer(k);
        System.out.println(obj3);
        int l = 30;
        Integer obj4 = new Integer(l);
        System.out.println(obj4);
        int m = 35;
        Integer obj5 = new Integer("2003");
        System.out.println(obj5);
    }

    //object to primitive
    public void autounboxing() {
        Integer obj6 = new Integer(69);
        int n = obj6;
        System.out.println(n);
        Double obj7 = new Double(69.69);
        double o = obj7;
        System.out.println(o);
        Long obj8 = new Long(69696969);
        long p = obj8;
        System.out.println(p);
    }

    public void BigInteBigDec() {
        //BigInteger
        BigInteger obj9 = new BigInteger("6931276847164123");
        System.out.println("BigInteger: " + obj9);
        BigInteger obj10 = new BigInteger("120379821371289");
        System.out.println("BigInteger: " + obj10);
        //add
        System.out.println("Add: " + obj9.add(obj10));
        //BigDecimal
        BigDecimal obj11 = new BigDecimal("120379821371289.4124786");
        System.out.println("BigDecimal: " + obj11);
    }

    public void stringMethods() {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + " " + str2);
        System.out.println(str1.concat(str2));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.length());
    }

    public void StringBuilderBuffer() {
        StringBuffer str3 = new StringBuffer("Hello");
        StringBuffer str4 = new StringBuffer("World");
        str4 = str3;
        StringBuilder str5 = new StringBuilder("World");
        StringBuilder str6 = new StringBuilder("World");
        str6 = str5;
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
    }
}
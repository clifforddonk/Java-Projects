package com.clifford;

public class Datatypes{

    public static void main(String[] args) {

        // Initialization of variables
        byte b1 = 5;
        short s1 = 20;
        int i1 = 100;
        long l1 = 999;

        // Printing values
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);
        System.out.println("i1: " + i1);
        System.out.println("l1: " + l1);

        // Arithmetic operations
        System.out.println("b1 - i1: " + (b1 - i1));
        System.out.println("s1 - b1: " + (s1 - b1));
        System.out.println("i1 - l1: " + (i1 - l1));

        // Changing the value of a variable
        l1 = i1;
        System.out.println("l1 after assignment: " + l1);


        // Exceeding the interval of a byte (demonstration of potential error)
        // Note:  Uncommenting the next line will result in a compile-time error
        // because -129 is outside the byte range (-128 to 127)
        // b1 = -129;

        // Example of casting to avoid potential errors when assigning larger values to smaller data types
        b1 = (byte) i1; //Casting i1 to a byte. Be aware of potential data loss if i1 is outside byte range.
        System.out.println("b1 after casting from i1: " + b1);


    }
}
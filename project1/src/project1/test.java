package project1;

import java.io.*;
import java.lang.*;
 
class Test 
{
    public static void main(String[] args)
    {
        // Declare String without using new operator
        String s = "hello";
 
        // Prints the String.
        System.out.println("String s = " + s);
 
        // Declare String using new operator
        String s1 = new String("hello");
 
        // Prints the String.
        System.out.println("String s1 = " + s1);
    }
}
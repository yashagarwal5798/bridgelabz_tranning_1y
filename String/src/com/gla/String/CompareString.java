package com.gla.String;
import java.util.Scanner;

public class equalstring
{
    public static boolean CharAt(String s1, String s2)
    {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        boolean result1 = CharAt(s1, s2);
        boolean result2 = s1.equals(s2);


        System.out.println( result1);
        System.out.println( result2);


        if (result1 == result2) {
            System.out.println("same");
        } else 
        {
            System.out.println("not same" );
        }


    }
}


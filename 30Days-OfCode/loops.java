"""
    Objective
In this challenge, we will use loops to do some math. Check out the Tutorial tab to learn more.

    Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: n x i = result.

"""

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i=1; i<=10; i++)
           { 
            m = n*i;
            System.out.printf("%d x %d = %d\n", n,i,m);
           }

        scanner.close();
    }
}

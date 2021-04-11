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
        int N = scanner.nextInt();
        int res = 0;
        for (int i=1; i<=10; i++)
            {
                res = N * i;
                System.out.printf("%d x %d = %d\n",N,i,res);
            }
        scanner.close();
    }
}

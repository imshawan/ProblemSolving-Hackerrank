import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String xx = Integer.toString(x);
                //Complete this line
                for (int j = s1.length(); j < 15; j++)
                    s1 += ' ';
                for (int j = xx.length(); j < 3; j++)
                    xx = '0' + xx;
                System.out.print(s1+xx+'\n');
            }
            System.out.println("================================");

    }
}




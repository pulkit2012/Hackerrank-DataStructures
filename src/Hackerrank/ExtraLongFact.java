package Hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        BigInteger ans = new BigInteger("1");
        while(a > 0){
            ans = ans.multiply(new BigInteger((String.valueOf(a))));
            a = a - 1;
        }
        System.out.println(ans);
    }
}

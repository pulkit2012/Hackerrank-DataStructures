package Hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test > 0){
            int start = in.nextInt();
            int end = in.nextInt();
            int storer = (int) Math.sqrt(end) - (int) Math.sqrt(start);
            if(Math.pow((int)Math.sqrt(start),2) >= start){
                storer = storer + 1;
            }
            System.out.println(storer);
            test--;
        }
    }
}
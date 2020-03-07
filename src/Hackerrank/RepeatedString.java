package Hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        Long subStrLen = in.nextLong();
        in.nextLine();
        Long counter = 0L;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'a'){
                counter++;
            }
        }
        Long remainder = subStrLen % input.length();
        Long devisor = subStrLen / input.length();
        Long totalCount = 0L;
        totalCount = totalCount + devisor*counter;
        for (int i = 0; i < remainder; i++) {
            if(input.charAt(i) == 'a'){
                totalCount++;
            }
        }
        System.out.println(totalCount);
    }
}
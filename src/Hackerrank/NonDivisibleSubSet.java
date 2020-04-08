package Hackerrank;

import java.util.Scanner;

public class NonDivisibleSubSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int div = in.nextInt();
        int[] arr = new int[div];
        for (int i = 0; i < len; i++) {
            int index = in.nextInt() % div;
            arr[index] += 1;
        }
        int lengthOfset = 0;
        lengthOfset += (arr[0] >= 1) ? 1 : 0;
        lengthOfset += (div % 2 == 0 && arr[div/2] >=1) ? 1: 0;
        int max = 0;
        if(div % 2 == 0){
            max = (div/2)-1;
        }
        else {
            max = div / 2;
        }
        for (int i = 1; i <= max; i++) {
            lengthOfset += Math.max(arr[i],arr[div-i]);
        }
        System.out.println(lengthOfset);
    }
}
class dunno{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
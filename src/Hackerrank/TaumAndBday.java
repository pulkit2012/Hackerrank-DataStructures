package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class TaumAndBday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test > 0) {
            long b = in.nextLong();
            long w = in.nextLong();
            long[] arr = new long[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextLong();
            }
            long finalBcost = 0l;
            long finalAcost = 0l;
            if (arr[0] == arr[1] && arr[0] == arr[2]) {
                finalBcost = b * arr[0];
                finalAcost = w * arr[1];
            } else {
                if (b * (arr[0]) >= (b * ((arr[1]) + arr[2]))) {
                    finalBcost = b * ((arr[1] + arr[2]));
                } else {
                    finalBcost = b * (arr[0]);
                }
                if (w * (arr[1]) >= w * ((arr[0] + arr[2]))) {
                    finalAcost = w * ((arr[0] + arr[2]));
                } else {
                    finalAcost = w * (arr[1]);
                }
            }
            System.out.println(finalAcost + finalBcost);
            test--;
        }
    }
}

package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        int[] ans = new int[a];
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                if((i + 1) == arr[i1]){
                    for (int i2 = 0; i2 < arr.length; i2++) {
                        if((i1+1) == arr[i2]){
                            ans[i] = i2+1;
                        }
                    }
                }
            }
            System.out.println(ans[i]);
        }
    }
}

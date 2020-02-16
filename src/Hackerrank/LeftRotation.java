package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arrValues = in.nextLine().trim().split(" ");
        int test = 0;
        String[] arrInput = in.nextLine().trim().split(" ");
        int[] arr = new int[Integer.parseInt(arrValues[0])];
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrInput[i]);
        }
        for(int j =0; j< Integer.parseInt(arrValues[1]);j++){
            int storer = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (i == 0) {
                    storer = arr[i];
                }
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = storer;
            for (int i = 0; i < ans.length; i++) {
                ans[i] = arr[i];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

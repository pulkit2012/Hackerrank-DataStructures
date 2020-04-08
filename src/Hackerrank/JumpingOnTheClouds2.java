package Hackerrank;

import java.util.Scanner;

public class JumpingOnTheClouds2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int checker = 0;
        int i = 0;
        while (i <= len - 3) {
            if (arr[i + 1] == 0) {
                if (arr[i + 2] == 0) {
                    i = i + 2;
                    checker++;
                } else {
                    i = i + 1;
                    checker++;
                }
            } else {
                if (arr[i + 2] == 0) {
                    i = i + 2;
                    checker++;
                }
            }
        }
        if (i < len - 1) {
            if(arr[i + 1] == 0){
                checker++;
                System.out.println(checker);
            }
        } else {
            System.out.println(checker);
        }
    }
}

package Hackerrank;

import java.util.Scanner;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inputs = new int[2];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = in.nextInt();
        }
        int[] arr = new int[inputs[0]];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int storer = 0;
        int ans = 100;
        while (true) {
            storer = (storer + inputs[1]) % inputs[0];
            if(arr[storer] == 1){
                ans = ans -3;
            }
            else {
                ans = ans -1;
            }
            if(storer == 0){
                break;
            }
        }
        System.out.println(ans);
    }
}

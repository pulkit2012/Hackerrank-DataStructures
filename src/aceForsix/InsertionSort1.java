package aceForsix;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort1 {
    static void print(int[] arr) {
        for (int c : arr) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        boolean temp = false;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int last = arr[len - 1];
        int prevIndex = len - 1;
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] >= last) {
                arr[prevIndex] = arr[i];
                    prevIndex = i;
            } else {
                arr[prevIndex] = last;
                break;
            }
            if(i == 0){
                temp = true;
            }
            print(arr);
            System.out.println();
        }
        if(temp){
            arr[0] = last;
        }
        print(arr);
    }
}

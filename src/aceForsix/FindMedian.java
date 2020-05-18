package aceForsix;


import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[len/2]);
    }
}


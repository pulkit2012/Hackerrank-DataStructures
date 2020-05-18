package aceForsix;

import java.util.Scanner;

public class CountingSort1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[100];
        for (int i = 0; i < len; i++) {
            int k  = in.nextInt();
            arr[k] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i]; i1++) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}

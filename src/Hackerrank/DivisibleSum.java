package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class DivisibleSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] inputs = in.nextLine().trim().split(" ");
        String[] arr = in.nextLine().trim().split(" ");
        int[] arrInt = new int[Integer.parseInt(inputs[0])];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arrInt);
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < arrInt.length; i++) {
            for (int i1 = i+1; i1 < arrInt.length; i1++) {
                sum = arrInt[i] + arrInt[i1];
                if(sum % Integer.parseInt(inputs[1]) == 0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

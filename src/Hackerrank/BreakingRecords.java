package Hackerrank;

import java.util.Scanner;

public class BreakingRecords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.nextLine();
        String[] input = in.nextLine().trim().split(" ");
        int[] arrInt = new int[length];
        for (int i = 0; i < length; i++) {
            arrInt[i] = Integer.parseInt(input[i]);
        }
        int high = 0;
        int low = 0;
        int Max = arrInt[0];
        int Min = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] > Max) {
                Max = arrInt[i];
                high++;
            } else if(arrInt[i] < Min) {
                Min = arrInt[i];
                low++;
            }
        }
        System.out.println(high + " " + low);
    }
}

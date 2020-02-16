package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().trim().split(" ");
        int[] arrNew = new int[arr.length];
        ArrayList<Integer> arrList = new ArrayList<>();
        int[] arrNow = new int[arrNew.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = Integer.parseInt(arr[i]);
        }
        for (int i = arrNew.length-1; i >=0 ; i--) {
            arrList.add(arrNew[i]);
        }
        for (int i = 0; i < arrList.size(); i++) {
            arrNow[i] = arrList.get(i);
        }

        System.out.println(Arrays.toString(arrNow));
    }
}

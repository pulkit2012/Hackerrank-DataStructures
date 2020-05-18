package aceForsix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumDistance {
    static ArrayList<Integer> repeatChecker(int a, int[] arr, int index){
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = index + 1; i < arr.length; i++) {
            if(arr[i] == a){
                arr2.add(i);
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if(repeatChecker(arr[i],arr,i).size() != 0){
                arr3.add(Math.abs(i - repeatChecker(arr[i],arr,i).get(0)));
            }
        }
        Collections.sort(arr3);
        System.out.println((arr3.size() == 0) ? "-1" : arr3.get(0));
    }
}

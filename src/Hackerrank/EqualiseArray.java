package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class EqualiseArray {
    static int counter(int arr[] , int element){
        int counts = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                counts++;
            }
        }
        return counts;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
            set.add(arr[i]);
        }
        int largest = 0;
        ArrayList<Integer> arrHelp = new ArrayList<>();
        for(int c : set){
            if(counter(arr,c) > largest){
                largest = counter(arr,c);
            }
            arrHelp.add(counter(arr,c));
        }
        int adder = 0;
        int checker = 0;
        for (int i = 0; i < arrHelp.size(); i++) {
            if (arrHelp.get(i) != largest || checker != 0) {
                    adder += arrHelp.get(i);
            }
            else {
                checker++;
            }
        }
        System.out.println(adder);
    }
}

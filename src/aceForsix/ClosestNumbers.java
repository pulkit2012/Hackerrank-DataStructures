package aceForsix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        long[] arr = new long[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextLong();
        }
        Arrays.sort(arr);
        long diff = arr[1] - arr[0];
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);
        arrayList.add(arr[1]);
        for (int i = 1; i < arr.length - 1; i++) {
            long check = arr[i+1] - arr[i];
            if(check < diff){
                arrayList.clear();
                arrayList.add(arr[i]);
                arrayList.add(arr[i + 1]);
                diff = check;
            }
            else if(check == diff){
                arrayList.add(arr[i]);
                arrayList.add(arr[i + 1]);
            }
        }
        for(long c : arrayList){
            System.out.print(c + " ");
        }
    }
}

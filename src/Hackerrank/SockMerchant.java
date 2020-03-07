package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        TreeSet<Integer> set = new TreeSet<>();
        String[] arr = in.nextLine().trim().split(" ");
        int[] arrInt = new int[a];
        for (int i = 0; i < a; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
            set.add(arrInt[i]);
        }
        ArrayList<Integer> nonRepeatables = new ArrayList<>();
        nonRepeatables.addAll(set);
        int counter = 0;
        ArrayList<Integer> countes = new ArrayList<>();
        for (int i = 0; i < nonRepeatables.size(); i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (arrInt[i1] == nonRepeatables.get(i)) {
                    counter++;
                }
            }
            countes.add(counter);
            counter = 0;
        }
        int pairCounter = 0;
        for (int i = 0; i < countes.size(); i++) {
            if(countes.get(i) % 2 != 0) {
               if(countes.get(i) != 1){
                   pairCounter = pairCounter + (countes.get(i)-1) / 2;
               }
            }
            else if(countes.get(i) % 2 == 0){
                pairCounter = pairCounter + (countes.get(i) / 2);
            }
        }
        System.out.println(pairCounter);
    }
}

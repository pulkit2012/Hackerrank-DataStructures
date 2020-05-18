package aceForsix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FradulentActivity {
    static int medianFinder(ArrayList<Integer> list){
        int median = 0;
        Collections.sort(list);
        if(list.size() % 2 == 0){
            median = (list.get(list.size()/2) + list.get((list.size()/2) - 1))/2;
        }
        else {
            median = list.get(list.size()/2);
        }
        return median;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int trail = in.nextInt();
        in.nextLine();
        int outerLoop = n - trail;
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        if(n <= trail){
            System.out.println(0);
        }
        else {
            ArrayList<Integer> medians = new ArrayList<>();
            ArrayList<Integer> arr = new ArrayList<>();
            int k = 0;
            for (int i = 0; i < outerLoop; i++) {
                for (int i1 = i; i1 < trail + i; i1++) {
                    arr.add(arr1[i1]);
                }
                medians.add(medianFinder(arr));
                arr.clear();;
            }
            int notify = 0;
            int i1 = 0;
            for (int i = outerLoop + 1; i < arr1.length; i++) {
                if(i1 < medians.size()) {
                    if (arr1[i] >= medians.get(i1) * 2) {
                        notify++;
                    }
                    i1++;
                }
            }
            System.out.println(notify);
        }
    }
}

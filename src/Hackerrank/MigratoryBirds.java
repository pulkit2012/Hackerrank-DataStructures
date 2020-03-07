package Hackerrank;

import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        String[] arr = in.nextLine().trim().split(" ");
       int[] arrInt = new int[test];
       TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
            set.add(arrInt[i]);
        }
        ArrayList<Integer> arrHelper = new ArrayList<>();
        arrHelper.addAll(set);
        ArrayList<Integer> counts = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < arrHelper.size(); i++) {
            for (int i1 = 0; i1 < arrInt.length; i1++) {
                if(arrHelper.get(i) == arrInt[i1]){
                    counter++;
                }
            }
            counts.add(counter);
            counter = 0;
        }
        int smaller = counts.get(0);
        for (int i = 1; i < counts.size(); i++) {
           if(counts.get(i) > smaller){
               smaller = counts.get(i);
           }
        }
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < counts.size(); i++) {
            if(counts.get(i) == smaller){
                indexes.add(i);
            }
        }
       int smallest = arrHelper.get(indexes.get(0));
        for (int i = 1; i < indexes.size(); i++) {
            if(arrHelper.get(indexes.get(i)) < smallest){
                smallest = arrHelper.get(indexes.get(i));
            }
        }
        System.out.println(smallest);
    }
}

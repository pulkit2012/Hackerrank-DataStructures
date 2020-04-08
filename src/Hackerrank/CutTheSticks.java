package Hackerrank;

import java.util.*;

public class CutTheSticks {
    static int smallestWithoutZero(ArrayList<Integer> arr) {
        ArrayList<Integer> helper = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0) {
                helper.add(arr.get(i));
            }
        }
        Collections.sort(helper);
        return helper.get(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < length; i++) {
            arr.add(in.nextInt());
            set.add(arr.get(i));
        }
        Collections.sort(arr);
        int initial = arr.size();
        for (int i1 = 0; i1 < set.size(); i1++) {
            int counter = 0;
            int cutter = smallestWithoutZero(arr);
            for (int i = 0; i < initial; i++) {
                if (arr.get(i) - cutter >= 0) {
                    arr.set(i, arr.get(i) - cutter);
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
package aceForsix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int test = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        while(test > 0){
            int i = in.nextInt();
            int j = in.nextInt();
            ArrayList<Integer> arrHelp = new ArrayList<>();
            for (int i1 = i; i1 <= j; i1++) {
                arrHelp.add(arr[i1]);
            }
            Collections.sort(arrHelp);
            System.out.println(arrHelp.get(0));
            test--;
        }
    }
}

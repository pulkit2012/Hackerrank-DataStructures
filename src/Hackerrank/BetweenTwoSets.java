package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] length = in.nextLine().trim().split(" ");
        String[] arrNHelp = in.nextLine().trim().split(" ");
        int[] arrN = new int[Integer.parseInt(length[0])];
        for (int i = 0; i < Integer.parseInt(length[0]); i++) {
            arrN[i] = Integer.parseInt(arrNHelp[i]);
        }
        String[] arrMHelp = in.nextLine().trim().split(" ");
        int[] arrM = new int[Integer.parseInt(length[1])];
        for (int i = 0; i < Integer.parseInt(length[1]); i++) {
            arrM[i] = Integer.parseInt(arrMHelp[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arrN);
        Arrays.sort(arrM);
        int HCF = arrN[arrN.length - 1];
        int LCM = arrM[0];
        int current = 0;
        int currentTwo = 0;
        for (int i = HCF; i <= LCM; i++) {
            for (int i1 = 0; i1 < arrN.length; i1++) {
                if (i % arrN[i1] == 0) {
                    current++;
                }
            }
            if(current == arrN.length){
                for (int i1 = 0; i1 < arrM.length; i1++) {
                    if(arrM[i1] % i == 0){
                        currentTwo++;
                    }
                }
                if(currentTwo == arrM.length){
                    ans.add(i);
                }
                currentTwo = 0;
            }
            current = 0;
        }
        System.out.println(ans.size());
    }
}
package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine();
        String[] arrFirst = new String[size];
        for (int i = 0; i < size; i++) {
            arrFirst[i] = in.nextLine();
        }
        int sizeQuery = in.nextInt();
        in.nextLine();
        String[] queryArr = new String[sizeQuery];
        for (int i = 0; i < sizeQuery; i++) {
           queryArr[i] = in.nextLine();
        }
        int counter = 0;
        for (int i = 0; i < queryArr.length; i++) {
            for (int i1 = 0; i1 < arrFirst.length; i1++) {
                if(queryArr[i].equals(arrFirst[i1])){
                    counter++;
                }
            }
            System.out.println(counter);
            counter = 0;
        }
    }
}

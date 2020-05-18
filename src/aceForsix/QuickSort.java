package aceForsix;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {
    static void print(ArrayList<Integer> arrayList){
       for(int c : arrayList){
           System.out.print(c + " ");
       }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        int pivot = 0;
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> grater = new ArrayList<>();
        ArrayList<Integer> smaller = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            if(i == 0){
                pivot = in.nextInt();
                equal.add(pivot);
            }
            else {
                int k = in.nextInt();
                if(k > pivot){
                    grater.add(k);
                }
                else if(k < pivot){
                    smaller.add(k);
                }
                else if(k == pivot){
                    equal.add(k);
                }
            }
        }
        print(smaller);
        print(equal);
        print(grater);
    }
}

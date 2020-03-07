package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TotalPages = in.nextInt();
        in.nextLine();
        int page = in.nextInt();
        ArrayList<Integer> pages = new ArrayList<>();
        for (int i = 1; i <= TotalPages; i++) {
            pages.add(i);
        }
        ArrayList<Integer> flipsFront = new ArrayList<>();
        int counter = 0;
        if (TotalPages % 2 == 0) {
            counter = TotalPages / 2;
        } else {
            counter = (TotalPages - 1) / 2;
        }
        flipsFront.add(0);
        int k = 1;
        for (int i = 1; i < pages.size(); i++) {
            if (pages.get(i) % 2 == 0) {
                flipsFront.add(k);
            } else if (pages.get(i) % 2 != 0) {
                flipsFront.add(k);
                k++;
            }
        }
        ArrayList<Integer> flipsBack = new ArrayList<>();
        if(TotalPages % 2 == 0) {
            for (int i = flipsFront.size() - 1; i >= 0; i--) {
                flipsBack.add(flipsFront.get(i));
            }
        }
        else {
            ArrayList<Integer> initial = new ArrayList<>();
            ArrayList<Integer> arrayReverse = new ArrayList<>();
            for (int i = pages.size()-1; i >= 0; i--) {
                arrayReverse.add(pages.get(i));
            }
            initial.add(0);
            int z = 0;
            for (int i = 1; i < arrayReverse.size(); i++) {
                if(arrayReverse.get(i) % 2 == 0){
                    initial.add(z);
                    z++;
                }
                else {
                    initial.add(z);
                }
            }
            for (int i = initial.size()-1; i >= 0 ; i--) {
                flipsBack.add(initial.get(i));
            }
        }
        int index = 0;
        for (int i = 0; i < pages.size(); i++) {
            if(pages.get(i) == page){
                index = i;
                break;
            }
        }
        System.out.println(Math.min((flipsFront.get(index)),flipsBack.get(index)));
    }
}

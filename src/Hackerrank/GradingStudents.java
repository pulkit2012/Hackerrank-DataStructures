package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int NoOfStud = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < NoOfStud; i++) {
            arr.add(in.nextInt());
        }
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 37) {
                if ((arr.get(i) + 1) % 5 == 0) {
                    System.out.println(arr.get(i) + 1);
                } else if ((arr.get(i) + 2) % 5 == 0) {
                    System.out.println(arr.get(i) + 2);
                } else if (arr.get(i) % 5 == 0) {
                    System.out.println(arr.get(i));
                } else {
                    System.out.println(arr.get(i));
                }
            }
            else {
                System.out.println(arr.get(i));
            }

        }
    }
}
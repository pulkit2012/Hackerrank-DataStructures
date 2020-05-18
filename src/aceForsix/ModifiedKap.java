package aceForsix;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifiedKap {
    static boolean karpekarChecker(int num, long square) {
        boolean temp = false;
        String num1 = String.valueOf(num);
        String num2 = String.valueOf(square);
        int index = 0;
        if(num == 1){
            temp = true;
        }
        else {
            if (num2.length() != 1) {
                if (num2.length() == 2 * num1.length()) {
                    index = num2.length() - num1.length();
                } else if (num2.length() == 2 * (num1.length()) - 1) {
                    index = (num2.length() - num1.length());
                }
                String r = "";
                for (int i = index; i < num2.length(); i++) {
                    r += num2.charAt(i);
                }
                String l = "";
                for (int i = 0; i < index; i++) {
                    l += num2.charAt(i);
                }
                if (Integer.parseInt(r) + Integer.parseInt(l) == num) {
                    temp = true;
                } else {
                    temp = false;
                }
            } else {
                temp = false;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        in.nextLine();
        int end = in.nextInt();
        long square = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            square = (long) Math.pow(i, 2);
            if(karpekarChecker(i,square)){
                arr.add(i);
            }
        }
        if(arr.size() == 0){
            System.out.println("INVALID RANGE");
        }
        else {
            for(int i : arr){
                System.out.print(i + " ");
            }
        }
    }
}

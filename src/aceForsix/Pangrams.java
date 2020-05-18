package aceForsix;

import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        a = a.toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                int index = (a.charAt(i) - 'a');
                arr[index] += 1;
            }
        }
        boolean temp = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                temp = false;
                break;
            }
        }
        System.out.println(temp ? "pangram" : "not pangram");
    }
}

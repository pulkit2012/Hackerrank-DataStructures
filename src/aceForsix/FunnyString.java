package aceForsix;

import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test > 0){
            String a = in.nextLine().trim();
            String front = "";
            String back = "";
            for (int i = 0; i < a.length() - 1; i++) {
                front += Math.abs((int)a.charAt(i) - (int)a.charAt(i + 1));
            }
            for (int i = a.length() - 1; i > 0; i--) {
                back += Math.abs((int)a.charAt(i) - (int)a.charAt(i - 1));
            }
            System.out.println(front.equals(back) ? "Funny" : "Not Funny");
            test--;
        }
    }
}

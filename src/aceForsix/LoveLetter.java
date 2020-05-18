package aceForsix;

import java.util.Scanner;

public class LoveLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test > 0){
            String a = in.nextLine().trim();
            int counter = 0;
            for (int i = 0; i < a.length() / 2; i++) {
                counter += Math.abs((int) a.charAt(i) - (int)a.charAt(a.length() - 1 - i));
            }
            System.out.println(counter);
            test--;
        }
    }
}

package aceForsix;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        int counter = 0;
        counter = (input.length() == 0) ? 0 : 1;
        if (counter != 0) {
            for (int i = 0; i < input.length(); i++) {
                if ((int) input.charAt(i) >= 65 && (int) input.charAt(i) < 97) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

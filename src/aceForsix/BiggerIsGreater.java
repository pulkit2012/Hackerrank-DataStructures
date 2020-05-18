package aceForsix;

import java.util.Scanner;
import java.util.TreeSet;

public class BiggerIsGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test > 0) {
            char temp = (char) 0;
            int index = 0;
            String input = in.nextLine().trim();
            if (input.length() == 1) {
                System.out.println("no answer");
                test--;
                continue;
            }
            for (int i = input.length() - 1; i >= 1; i--) {
                if (input.charAt(i - 1) < input.charAt(i)) {
                    temp = input.charAt(i - 1);
                    index = i;
                    break;
                }
            }
            if (index - 1 < 0) {
                System.out.println("no answer");
                test--;
                continue;
            }
            int index2 = 0;
            char comparator = input.charAt(index);
            if (index != input.length() - 1) {
                for (int i = index + 1; i < input.length(); i++) {
                    if (input.charAt(i) > temp) {
                        if (input.charAt(i) < comparator) {
                            comparator = input.charAt(i);
                            index2 = i;
                        }
                    }
                }
            } else {
                index2 = index;
            }
            StringBuilder sb = new StringBuilder(input);
            sb.setCharAt(index - 1, comparator);
            sb.setCharAt(index2, temp);
            String s2 = "";
            TreeSet<Character> set = new TreeSet<>();
            for (int i = index; i < sb.length(); i++) {
                set.add(sb.charAt(i));
            }
            for (char c : set) {
                s2 += c;
            }
            String s1 = "";
            for (int i = 0; i < index; i++) {
                s1 += sb.charAt(i);
            }
            System.out.println((s1 + s2).equals(input) ? "no answer" : (s1 + s2));
            test--;
        }
    }
}
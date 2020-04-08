package Hackerrank;

import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String desired = in.nextLine();
        int CountOfOper = in.nextInt();
        int counter = 0;
        if (input.length() < desired.length()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == desired.charAt(i)) {
                    counter++;
                } else {
                    break;
                }
            }
        } else {
            for (int i = 0; i < desired.length(); i++) {
                if (input.charAt(i) == desired.charAt(i)) {
                    counter++;
                } else {
                    break;
                }
            }
        }
        if (counter == input.length() && counter == desired.length()) {
            if (CountOfOper < counter && CountOfOper % 2 == 0) {
                System.out.println("Yes");
            } else if ((input.length() * 2 + 1) == CountOfOper) {
                System.out.println("Yes");
            }
        } else if (CountOfOper >= Math.abs(input.length() - counter) + Math.abs(desired.length() - counter)) {
            if (CountOfOper > Math.abs(counter - desired.length()) && (CountOfOper - Math.abs(counter - desired.length())) % 2 == 0) {
                System.out.println("Yes");
            } else if ((CountOfOper < (input.length() + desired.length())) && (Math.abs(input.length() - counter) == 0)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
    }
}
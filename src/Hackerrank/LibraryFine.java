package Hackerrank;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] returnDate = new int[3];
        int[] dueDate = new int[3];
        for (int i = 0; i < 3; i++) {
            returnDate[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            dueDate[i] = in.nextInt();
        }
        if ((returnDate[1] == dueDate[1]) && (returnDate[2] == dueDate[2])) {
            System.out.println((returnDate[0] - dueDate[0]) < 0 ? 0 : (15 * (returnDate[0] - dueDate[0])));
        } else if ((returnDate[1] != dueDate[1]) && (returnDate[2] == dueDate[2])) {
            System.out.println((returnDate[1] - dueDate[1]) < 0 ? 0 : (500 * (returnDate[1] - dueDate[1])));
        } else {
            System.out.println((returnDate[2] - dueDate[2]) < 0 ? 0 : (10000));
        }
    }
}

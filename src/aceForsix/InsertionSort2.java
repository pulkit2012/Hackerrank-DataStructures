package aceForsix;


import java.util.Scanner;

public class InsertionSort2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test > 0) {
            int len = in.nextInt();
            in.nextLine();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = in.nextInt();
            }
            int i1 = 1;
            int counter = 0;
            while (i1 < len) {
                boolean tempA = false;
                int index = 0;
                int first = arr[i1];
                int firstIndex = i1;
                for (int i = firstIndex - 1; i >= 0; i--) {
                    if (arr[i] > first) {
                        int temp = arr[i];
                        arr[i] = first;
                        arr[i + 1] = temp;
                        index = i;
                        tempA = true;
                    }
                }
                if (tempA) {
                    counter += Math.abs(index - firstIndex);
                }
                i1++;
            }
            System.out.println(counter);
            test--;
        }
    }
}

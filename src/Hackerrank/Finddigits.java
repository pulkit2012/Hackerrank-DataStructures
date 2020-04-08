package Hackerrank;

import java.util.Scanner;

public class Finddigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test > 0){
            String number = in.nextLine();
            int[] arrInt = new int[number.length()];
            int counter = 0;
            for (int i = 0; i < number.length(); i++) {
                if(Character.getNumericValue(number.charAt(i)) != 0) {
                    if (Integer.parseInt(number) % Character.getNumericValue(number.charAt(i)) == 0) {
                        counter++;
                    }
                }
            }
            System.out.println(counter);
            test--;
        }

    }
}

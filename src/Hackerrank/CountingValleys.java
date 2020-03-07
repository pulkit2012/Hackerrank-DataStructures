package Hackerrank;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int steps = in.nextInt();
        in.nextLine();
        String stepsString = in.nextLine();
        int counter = 0;
        int ans = 0;
        char[] arrSteps = stepsString.toCharArray();
        for (char c: arrSteps){
            if(c == 'U'){
                counter++;
            }
            else {
                counter--;
            }
            if (counter == 0 && c == 'U'){
                ans++;
            }

        }
        System.out.println(ans);
    }
}

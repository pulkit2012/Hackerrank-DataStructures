package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

class testing{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for(int i = 0; i < T; i++)
        {
            int N = input.nextInt();//Number of prisoners
            int M = input.nextInt();//Number of sweets
            int S = input.nextInt();//First prisoner to be served

            int poisonedPrisoner = (S + M - 1) % N;
            if(poisonedPrisoner == 0){poisonedPrisoner=N;}
            System.out.println(poisonedPrisoner);
        }
    }
}
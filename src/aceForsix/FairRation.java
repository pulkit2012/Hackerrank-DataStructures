package aceForsix;

import java.util.Scanner;

public class FairRation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        int bread = 0;
        int current = 0;
        for (int i = 0; i < a; i++) {
            current += in.nextInt();
            if (i == a - 1) {
                if(current % 2 == 1) {
                    System.out.println("NO");
                }
                else {
                    System.out.println(bread);
                }
            }
            if(current % 2 == 1){
                current = 1;
                bread += 2;
                continue;
            }
            current = 0;
        }
    }
}

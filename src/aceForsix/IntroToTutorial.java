package aceForsix;

import java.util.Scanner;

public class IntroToTutorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        int len = in.nextInt();
        in.nextLine();
        int a = 0;
        for (int i = 0; i < len; i++) {
             a = in.nextInt();
             if(a == num){
                 System.out.println(i);
                 break;
             }
        }
    }
}

package aceForsix;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int max = 0;
        String s = in.nextLine().trim();
        if(s.length() == 1){
            System.out.println(max);
            System.exit(0);
        }
        for (int i = 0; i < 26; i++) {
            next :
            for (int i1 = i + 1; i1 < 26; i1++) {
                char one = (char) ('a' + i);
                char two = (char) ('a' + i1);
                char last = '\u0000';
                int counter = 0;
                for(char l : s.toCharArray()){
                    if(l == one || l == two){
                        if(l == last){
                            continue next;
                        }
                        counter++;
                        last = l;
                    }

                }
                max = (counter > max) ? counter : max;
            }
        }
        System.out.println(max);
    }
}
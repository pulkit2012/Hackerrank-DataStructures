package aceForsix;

import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test > 0){
            String a = in.nextLine().trim();
            int counter = 0;
            for (int i = 0; i < a.length() - 1; i++) {
                if(a.charAt(i) == a.charAt(i + 1)){
                    counter++;
                }
            }
            System.out.println(counter);
            test--;
        }
    }
}

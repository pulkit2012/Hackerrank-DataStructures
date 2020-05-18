package aceForsix;

import java.util.Scanner;

public class BeautifulBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int counter = 0;
        String a = in.nextLine().trim();
        for (int i = 0; i <= a.length()-3; i++) {
            String b = a.substring(i,i+3);
            if(b.equals("010")){
                a = a.substring(0,i + 2) + '1' + a.substring(i + 3);
                counter++;
            }
        }
        System.out.println(counter);
    }
}

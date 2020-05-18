package aceForsix;

import java.util.Scanner;

public class HalloweenSale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int counter = 0;
        int sum = 0;
        while(sum <= s) {
            sum += p;
            if(sum > s){
                break;
            }
            if (p - d <= m) {
                p = m;
            } else {
                p = p - d;
            }
            counter++;
        }
        System.out.println(counter);
    }
}

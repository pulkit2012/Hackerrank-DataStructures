package aceForsix;

import java.util.Scanner;

public class StrangeCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long time = in.nextLong();
        long t1 = 1;
        long initial = 3;
        long clk = initial;
        while(true){
            clk--;
            t1++;
            if(t1 == time){
                System.out.println(clk);
                break;
            }
            if(clk == 1){
                initial = 2 * initial;
                clk = initial;
                t1++;
                if(t1 == time){
                    System.out.println(clk);
                    break;
                }
            }
        }
    }
}

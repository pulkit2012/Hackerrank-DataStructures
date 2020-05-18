package aceForsix;


import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        int numOfWrap = 0;
        int redeem = 0;
        int numOfChoc = 0;
        while(test > 0){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            numOfWrap = n / c;
            numOfChoc += numOfWrap;
            while(true){
                redeem = numOfWrap / m;
                if(redeem <= 0){
                    break;
                }
                numOfWrap = redeem + (numOfWrap % m);
                numOfChoc += redeem;
            }
            System.out.println(numOfChoc);
            numOfChoc = 0;
            test--;
        }
    }
}

package Hackerrank;

import java.util.Scanner;

public class BirthdayChoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.nextLine();
        String[] arr = in.nextLine().trim().split(" ");
        int[] arrChoc = new int[length];
        for (int i = 0; i < length; i++) {
            arrChoc[i] = Integer.parseInt(arr[i]);
        }
        String[] arrFinal = in.nextLine().trim().split(" ");
        int squares = Integer.parseInt(arrFinal[1]);
        int sum = Integer.parseInt(arrFinal[0]);
        int k = arrChoc.length - (squares - 1);
        int i = 0;
        int sounter = 0;
        int sumChecker = 0;
        int ans = 0;
        if(arrChoc.length > 1) {
            while (i < k) {
                if (i != arrChoc.length - 1) {
                    for (int i1 = i; i1 < i + squares; i1++) {
                        if (i1 <= arrChoc.length - 1) {
                            sumChecker = sumChecker + arrChoc[i1];
                        } else {
                            break;
                        }
                    }
                    if (sumChecker == sum) {
                        sounter++;
                    }
                    sumChecker = 0;
                }
                i++;
            }
            System.out.println(sounter);
        }
        else {
            if(squares == 1){
                if(sum == arrChoc[0]){
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
            else{
                System.out.println(0);
            }
        }
    }
}
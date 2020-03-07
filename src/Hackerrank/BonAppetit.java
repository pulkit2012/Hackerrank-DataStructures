package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BonAppetit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] items = in.nextLine().trim().split(" ");
        String[] billHelper = in.nextLine().trim().split(" ");
        int[] intBillArr = new int[billHelper.length];
        int[] finalBillArr = new int[billHelper.length];
        for (int i = 0; i < intBillArr.length; i++) {
            intBillArr[i] = Integer.parseInt(billHelper[i]);
            finalBillArr[i] = Integer.parseInt(billHelper[i]);
        }
        int chargedToAnna = in.nextInt();
        in.nextLine();
        finalBillArr[Integer.parseInt(items[1])] = 0;
        int finalAdder = 0;
        for (int i = 0; i < intBillArr.length; i++) {
            finalAdder = finalAdder + finalBillArr[i];
        }
        int amountActual = finalAdder / 2;
        if(chargedToAnna == amountActual){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(chargedToAnna - amountActual);
        }
    }
}

package Hackerrank;

import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] SandTHelper = in.nextLine().trim().split(" ");
        int[] SandTarr = new int[SandTHelper.length];
        for (int i = 0; i < SandTarr.length; i++) {
            SandTarr[i] = Integer.parseInt(SandTHelper[i]);
        }
        String[] AandBhelper = in.nextLine().trim().split(" ");
        int[] AandBarr = new int[AandBhelper.length];
        for (int i = 0; i < AandBarr.length; i++) {
            AandBarr[i] = Integer.parseInt(AandBhelper[i]);
        }
        String[] counts = in.nextLine().trim().split(" ");
        String[] appleHelper = in.nextLine().trim().split(" ");
        int[] apples = new int[Integer.parseInt(counts[0])];
        for (int i = 0; i < Integer.parseInt(counts[0]); i++) {
            apples[i] = Integer.parseInt(appleHelper[i]);
        }
        String[] orangeHelper = in.nextLine().trim().split(" ");
        int[] oranges = new int[Integer.parseInt(counts[1])];
        for (int i = 0; i < Integer.parseInt(counts[1]); i++) {
            oranges[i] = Integer.parseInt(orangeHelper[i]);
        }
        int appleCounter = 0;
        int OrangeCounter = 0;
        for (int i = 0; i < apples.length; i++) {
            int j = apples[i] + AandBarr[0];
            if(j >= SandTarr[0] && j<= SandTarr[1]){
                appleCounter++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            int j = oranges[i] + AandBarr[1];
            if(j >= SandTarr[0] && j<= SandTarr[1]){
                OrangeCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(OrangeCounter);

    }
}

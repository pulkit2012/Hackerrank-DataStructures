package aceForsix;

import java.util.Scanner;

public class TheGridSearch {
    static boolean pattenChecker(int i,int i1,int[][] arrSmall,int[][] arrBig){
        if(i > arrBig.length - arrSmall.length || i1 > arrBig[0].length - arrSmall[0].length){
            return false;
        }
        int i2 = i;
        int i3 = i1;
        for (int i4 = 0; i4 < arrSmall.length; i4++) {
            for (int i5 = 0; i5 < arrSmall[0].length; i5++) {
                if(arrBig[i2][i3] != arrSmall[i4][i5]){
                    return false;
                }
                i3++;
            }
            i3 = i1;
            i2++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        tests :
        while(test > 0){
            int l = in.nextInt();
            int b = in.nextInt();
            in.nextLine();
            int[][] arrBig = new int[l][b];
            for (int i = 0; i < l; i++) {
                String a1 = in.nextLine();
                for (int i1 = 0; i1 < b; i1++) {
                    arrBig[i][i1] = Integer.parseInt(String.valueOf(a1.charAt(i1)));
                }
            }
            int l1 = in.nextInt();
            int b1 = in.nextInt();
            in.nextLine();
            int[][] arrSmall = new int[l1][b1];
            for (int i = 0; i < l1; i++) {
                String a2 = in.nextLine();
                for (int i1 = 0; i1 < b1; i1++) {
                    arrSmall[i][i1] = Integer.parseInt(String.valueOf(a2.charAt(i1)));
                }
            }
            int start = arrSmall[0][0];
            for (int i = 0; i < l; i++) {
                for (int i1 = 0; i1 < b; i1++) {
                    if(arrBig[i][i1] == start){
                        if(pattenChecker(i,i1,arrSmall,arrBig)){
                            System.out.println("YES");
                            continue tests;
                        }
                    }
                }
            }
            System.out.println("NO");
            test--;
        }
    }
}

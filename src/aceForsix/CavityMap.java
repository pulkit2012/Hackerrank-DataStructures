package aceForsix;

import java.util.Scanner;

public class CavityMap {
    static boolean depthChecker(int[][] arr, int i,int j){
        boolean temp = false;
        if(i == 0 || j == 0 || i == arr.length - 1 ||  j == arr.length - 1){
            temp = false;
        }
        else {
            if((arr[i][j - 1] < arr[i][j]) && (arr[i][j + 1] < arr[i][j]) && (arr[i - 1][j] < arr[i][j]) && (arr[i + 1][j] < arr[i][j])){
                temp = true;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[][] arr = new int[len][len];
        for (int i = 0; i < len; i++) {
            String line = in.nextLine().trim();
            for (int i1 = 0; i1 < len; i1++) {
                arr[i][i1] = Integer.parseInt(String.valueOf(line.charAt(i1)));
            }
        }
        for (int i = 0; i < len; i++) {
            for (int i1 = 0; i1 < len; i1++) {
                if(depthChecker(arr,i,i1)){
                    System.out.print("X");
                }
                else {
                    System.out.print(arr[i][i1]);
                }
            }
            System.out.println();
        }
    }
}

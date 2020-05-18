package aceForsix;

import java.util.Scanner;

public class PalindromeIndex {
    static boolean palindromeChecker(String s,int i,int j){
        for(int i1 = i,j1 = j;i1 < j1;i1++,j1--){
            if(s.charAt(i1) != s.charAt(j1)){
                return false;
            }
        }
        return true;
    }
    static int remover(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)){
                return palindromeChecker(s,i + 1,j) ? i : j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test > 0) {
            String a = in.nextLine().trim();
            System.out.println(remover(a));
            test--;
        }
    }
}

package aceForsix;

import java.util.Scanner;

public class SuperReduced {
    static boolean dupliChecker(String s){
        boolean temp = false;
        if(s.length() == 1 || s.length() == 0){
            return false;
        }
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == ch){
                temp = true;
                break;
            }
            else {
                ch = s.charAt(i);
            }
        }
        return temp;
    }
    static String stringGetter(String a){
        String s = "";
        char ch = a.charAt(0);
        int counter = 1;
        continuation :
        for (int i = 1; i < a.length(); i++) {
            if(a.charAt(i) == ch){
                counter++;
                continue continuation;
            }
            else {
                if(counter % 2 != 0){
                    s = s + ch;
                }
                ch = a.charAt(i);
                counter = 1;
            }
        }
        if(counter % 2 != 0){
            s = s + ch;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().trim();
        while (dupliChecker(stringGetter(a))) {
            a = stringGetter(a);
        }
        String b = stringGetter(a);
        System.out.println(b.length() == 0 ? "Empty String" : b);
    }
}

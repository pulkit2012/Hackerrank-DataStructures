package aceForsix;

import java.util.Scanner;

public class MarsExploration {
    static int checker(String s,int index){
        int counter = 0;
        if(s.charAt(index) != 'S'){
            counter++;
        }
        if(s.charAt(index+1) != 'O'){
            counter++;
        }
        if(s.charAt(index + 2) != 'S'){
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a =  in.nextLine().trim();
        int counter = a.length() / 3;
        int i = 0;
        int ans = 0;
        while(counter > 0){
            ans += checker(a,i);
            i += 3;
            counter--;
        }
        System.out.println(ans);
    }
}

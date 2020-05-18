package aceForsix;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class WeightedUniform {
    static long weight(String s){
        long first = (s.charAt(0) - 'a') + 1;
        return first*s.length();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().trim();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        String toBeChecked = "";
        for (int i = 0; i < a.length() - 1; i++) {
            if(a.charAt(i) == a.charAt(i + 1)){
                toBeChecked += a.charAt(i);
                set.add(toBeChecked);
            }
            else{
                toBeChecked += a.charAt(i);
                set.add(toBeChecked);
                toBeChecked = "";
            }
        }
        toBeChecked += a.charAt(a.length() -1);
        set.add(toBeChecked);
        HashSet<Long> anotherSet = new HashSet<>();
        for(String s : set){
            anotherSet.add(weight(s));
        }
        long queries = in.nextLong();
        in.nextLine();
        while(queries > 0){
            long test = in.nextLong();
            System.out.println(anotherSet.contains(test) ? "Yes" : "No");
            queries--;
        }
    }
}

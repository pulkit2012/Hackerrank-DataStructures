package aceForsix;
;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class GemStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        String[] arr = new String[test];
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        LinkedHashSet<Character> set2 = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
        }
        String first = arr[0];
        for (int i = 0; i < first.length(); i++) {
            set.add(first.charAt(i));
        }
        for (int i = 1; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length(); i1++) {
                if(set.contains(arr[i].charAt(i1))){
                    set2.add(arr[i].charAt(i1));
                }
            }
            set.clear();
            set.addAll(set2);
            set2.clear();
        }
        System.out.println(set.size());
    }
}

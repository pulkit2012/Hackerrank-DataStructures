package aceForsix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HappyLadyBugs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        tests:
        while (test > 0) {
            int len = in.nextInt();
            in.nextLine();
            String a = in.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < a.length(); i++) {
                Character ch = a.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
            for (Map.Entry<Character, Integer> freq : map.entrySet()) {
                if (freq.getValue() < 2 && !freq.getKey().equals('_')) {
                    System.out.println("NO");
                    test--;
                    continue tests;
                }
            }
            if (!map.containsKey('_')) {
                int count = 0;
                char ch1 = a.charAt(0);
                for (int i = 0; i < a.length(); i++) {
                    char ch = a.charAt(i);
                    if (ch == ch1) {
                        count++;
                    } else {
                        if (count < 2) {
                            System.out.println("NO");
                            test--;
                            continue tests;
                        } else {
                            count = 1;
                        }
                    }
                    ch1 = ch;
                }
            }
            System.out.println("YES");
            test--;
        }
    }
}

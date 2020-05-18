package aceForsix;

import java.util.Scanner;

public class HackerrankWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while(test > 0) {
            String string = scanner.nextLine();
            char[] str = string.toCharArray();
            char[] ch = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
            boolean[] flag = {false, false, false, false, false, false, false, false, false, false};
            int head = 0;
            for (int i = 0; i < ch.length; i++) {
                for (int j = head; j < string.length(); j++) {
                    if (ch[i] == str[j]) {
                        flag[i] = true;
                        head = ++j;
                        break;
                    }
                }
            }
            if (flag[0] && flag[1] && flag[2] && flag[3] && flag[4] && flag[5] && flag[6] && flag[7] && flag[8] && flag[9]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            test--;
        }
    }
}

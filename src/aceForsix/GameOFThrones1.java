package aceForsix;

import java.util.Scanner;

public class GameOFThrones1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().trim();
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            int index = (int)a.charAt(i) - 'a';
            arr[index] += 1;
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(a.length() % 2 == 0){
                if(arr[i] != 0){
                    if(arr[i] % 2 != 0){
                        System.out.println("NO");
                        System.exit(0);
                    }
                }
            }
            else {

                if(arr[i] != 0){
                    if(arr[i] % 2 != 0){
                        counter++;
                    }
                    if(counter > 1){
                        System.out.println("NO");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("YES");
    }
}

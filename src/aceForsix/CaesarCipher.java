package aceForsix;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        String a = in.nextLine().trim();
        int k = in.nextInt();
        if(k > 26){
            k = k % 26;
        }
        String ans = "";
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher;
        for (int i = 0; i < a.length(); i++) {
            if(pattern.matcher(String.valueOf(a.charAt(i))).matches()){
                if((int)a.charAt(i) >= 97 && (int)a.charAt(i) <= 122){
                    char temp = (char)(a.charAt(i) + k);
                    if((int)temp > 122){
                        int size = (int)(temp) - 122;
                        ans += (char)('a' + (size - 1));
                    }
                    else {
                        ans += temp;
                    }
                }
                else {
                    char temp = (char)(a.charAt(i) + k);
                    if((int)temp > 90){
                        int size = (int)(temp) - 90;
                        ans += (char)('A' + (size - 1));
                    }
                    else {
                        ans += temp;
                    }
                }
            }
            else {
                ans += a.charAt(i);
            }
        }
        System.out.println(ans);
    }
}

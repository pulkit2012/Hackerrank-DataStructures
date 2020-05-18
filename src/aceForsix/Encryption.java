package aceForsix;

import com.sun.jdi.connect.Connector;

import java.util.*;

public class Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        String str = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                str = str + input.charAt(i);
            }
        }
        int columns = 0;
        int rows = (int) Math.sqrt(str.length());
        if(rows*rows == str.length()) {
             columns = rows;
        }
        else {
            columns = rows + 1;
        }
        ArrayList<String> arr = new ArrayList<>();
        String iterator = "";
        int itrCounter = 0;
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (itrCounter < columns) {
                iterator = iterator + str.charAt(i);
                itrCounter++;
            } else {
                itrCounter = 1;
                iterator = "";
                iterator = iterator + str.charAt(i);
            }
            if (iterator.length() == columns) {
                arr.add(iterator);
                index = i;
            }
        }
        if(index != str.length() - 1) {
            String last = "";
            for (int i = index + 1; i <= str.length() - 1; i++) {
                last = last + str.charAt(i);
            }
            arr.add(last);
        }
        ArrayList<String> ansArr = new ArrayList<>();
        String finalEncrypt = "";
        for (int i = 0; i < columns; i++) {
            for (int i1 = 0; i1 < arr.size()-1; i1++) {
                finalEncrypt = finalEncrypt + arr.get(i1).charAt(i);
            }
            ansArr.add(finalEncrypt);
            finalEncrypt = "";
        }
        String newly = "";
       for (int i = 0; i < arr.get(arr.size() - 1).length(); i++) {
            newly = ansArr.get(i) + arr.get(arr.size() -1).charAt(i);
            ansArr.set(i,newly);
           newly = "";
       }
        for(String s : ansArr){
            System.out.print(s + " ");
        }
    }
}

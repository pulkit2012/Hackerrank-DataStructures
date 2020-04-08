package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ACMICPCTeam {
    static int topicCounter(String str1,String str2){
        int counter = 0;
        int[] topicArr = new int[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == '1'){
                topicArr[i] += 1;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == '1'){
                topicArr[i] += 1;
            }
        }
        for (int i = 0; i < topicArr.length; i++) {
            if(topicArr[i] != 0){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int attendees = in.nextInt();
        int topics = in.nextInt();
        in.nextLine();
        ArrayList<String> arrInputs = new ArrayList<>();
        int loop = attendees;
        while(loop > 0){
            arrInputs.add(in.nextLine());
            loop--;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= attendees; i++) {
            for (int i1 = i + 1; i1 <= attendees; i1++) {
                ans.add(topicCounter(arrInputs.get(i - 1),arrInputs.get(i1 - 1)));
            }
        }
        Collections.sort(ans);
        System.out.println(ans.get(ans.size() - 1));
        int check = ans.get(ans.size() - 1);
        int teams = 0;
        for(int c : ans){
            if(c == check){
                teams++;
            }
        }
        System.out.println(teams);
    }
}
package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingTheLeaderBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] ScoresArr = new int[len];
        int[] ranksArr = new int[len];
        int rank = 1;
        for (int i = 0; i < len; i++) {
            ScoresArr[i] = in.nextInt();
            if(i > 0 && ScoresArr[i - 1] != ScoresArr[i]){
                rank++;
                ranksArr[i] = rank;
            }
            else {
                ranksArr[i] = rank;
            }
        }
        int AliceRank = ranksArr[ranksArr.length - 1] + 1;
        int index = len - 1;
        int AliceLen = in.nextInt();
        int prevScore = -1;
        for (int i = 0; i < AliceLen; i++) {
            int currentScore = in.nextInt();
            for(int j = index;j >= -1;j-- ){
                if(j < 0 || currentScore < ScoresArr[j]){
                    System.out.println(AliceRank);
                    break;
                }
                else if(ScoresArr[j] < currentScore){
                    if(ScoresArr[j] != prevScore){
                        AliceRank--;
                    }
                    index--;
                }
                else{
                    index--;
                    AliceRank = ranksArr[j];
                }
                prevScore = ScoresArr[j];
            }
        }
    }
}
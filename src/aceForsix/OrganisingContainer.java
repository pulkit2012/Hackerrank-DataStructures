package aceForsix;

import java.util.ArrayList;
import java.util.Scanner;

public class OrganisingContainer {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int test = in.nextInt();
      in.nextLine();
      while(test > 0){
          int len = in.nextInt();
          in.nextLine();
          int[][] arr = new int[len][len];
          for (int i = 0; i < len; i++) {
              for (int i1 = 0; i1 < len; i1++) {
                  arr[i][i1] = in.nextInt();
              }
          }
          int totalNoOfBalls = 0;
          int sizeOfAContainer = 0;
          ArrayList<Integer> ballsArr = new ArrayList<>();
          ArrayList<Integer> containerArr = new ArrayList<>();
          for (int i = 0; i < len; i++) {
              for (int i1 = 0; i1 < len; i1++) {
                  sizeOfAContainer += arr[i][i1];
                  totalNoOfBalls += arr[i1][i];
              }
              ballsArr.add(totalNoOfBalls);
              containerArr.add(sizeOfAContainer);
              totalNoOfBalls = 0;
              sizeOfAContainer = 0;
          }
          containerArr.removeAll(ballsArr);
          if(containerArr.isEmpty()){
              System.out.println("Possible");
          }
          else {
              System.out.println("Impossible");
          }
          test--;
      }
    }
}
